
package com.portfoliovictoria.victoria.security.repository;

import com.portfoliovictoria.victoria.security.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByNombreUsuario (String nombreUsuario);
    
    boolean existByNombreUsuario (String nombreUsuario);
    boolean existByEmail (String email);
}
