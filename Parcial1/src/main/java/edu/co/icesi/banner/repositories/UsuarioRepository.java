package edu.co.icesi.banner.repositories;
import edu.co.icesi.banner.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}

