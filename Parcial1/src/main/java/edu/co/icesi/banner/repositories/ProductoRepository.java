package edu.co.icesi.banner.repositories;


import edu.co.icesi.banner.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

    // Métodos adicionales para buscar o actualizar productos según necesidad
}
