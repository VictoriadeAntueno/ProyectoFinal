
package com.portfoliovictoria.victoria.controller;

import com.portfoliovictoria.victoria.dto.dtoExperiencia;
import com.portfoliovictoria.victoria.entity.Experiencia;
import com.portfoliovictoria.victoria.security.controller.Mensaje;
import com.portfoliovictoria.victoria.service.SExperiencia;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("explab")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    SExperiencia sExperiencia;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = sExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp) {
        if(StringUtils.isBlank(dtoexp.getNombreE()))
            return new ResponseEntity(new Mensaje("debe dar un nombre"), HttpStatus.BAD_REQUEST);
        if(sExperiencia.existByNombreE(dtoexp.getNombreE()))
            return new ResponseEntity(new Mensaje("esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = new Experiencia(dtoexp.getNombreE(), dtoexp.getDescripcionE());
        sExperiencia.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia guardada OK"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp) {
        //SI EL ID NO EXISTE negación!
        if(!sExperiencia.existById(id))
            return new ResponseEntity(new Mensaje("el id no exist"), HttpStatus.BAD_REQUEST);
        
        //compara nombres de experiencias para saber si ya existen
        if(sExperiencia.existByNombreE(dtoexp.getNombreE()) && sExperiencia.getByNombreE(dtoexp.getNombreE()).get().getId() != id)
            return new ResponseEntity(new Mensaje("esa experiencia ya existe "), HttpStatus.BAD_REQUEST);
        
        //el campo no puede estar vacío
        if(StringUtils.isBlank(dtoexp.getNombreE()))
            return new ResponseEntity(new Mensaje("debe dar un nombre"), HttpStatus.BAD_REQUEST);
        
        //si pasa validaciones... se actualiza el O experiencia .. busca nombre del dto
        Experiencia experiencia = sExperiencia.getOne(id).get();
        experiencia.setNombreE(dtoexp.getNombreE());
        experiencia.setDescripcionE((dtoexp.getDescripcionE()));
        
        sExperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada OK"), HttpStatus.OK);
        
    }
     
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
         //SI EL ID NO EXISTE negación!
        if(!sExperiencia.existById(id))
            return new ResponseEntity(new Mensaje("el id no exist"), HttpStatus.BAD_REQUEST);
        
        sExperiencia.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminada OK"), HttpStatus.OK);
    }
}
