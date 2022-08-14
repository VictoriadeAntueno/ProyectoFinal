
package com.portfoliovictoria.victoria.security.repository;

import com.portfoliovictoria.victoria.security.entity.Rol;
import com.portfoliovictoria.victoria.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
