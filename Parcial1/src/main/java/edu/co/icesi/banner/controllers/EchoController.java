package edu.co.icesi.banner.controllers;

import edu.co.icesi.banner.entity.Producto;
import edu.co.icesi.banner.entity.Usuario;
import edu.co.icesi.banner.repositories.ProductoRepository;
import edu.co.icesi.banner.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 3600)
public class EchoController {

    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping(value = "Registrar",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<Object> registrar(@RequestBody Producto producto){
        productoRepository.save(producto);
        return ResponseEntity.status(200).body("Producto Agregado");
    }

    @PostMapping(value = "Crear")
    public ResponseEntity<Object> crearUsuario(@RequestBody Usuario usuario){
        //UsuarioRepository.save(usuario);
        return ResponseEntity.status(200).body("Usuario Agregado");
    }

    @PostMapping(value = "Agregar",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<Object> agregar(@RequestHeader("ID") String id,@RequestBody Producto producto){
        try {
            return ResponseEntity.status(200).body("");
        } catch (Exception e) {
            return ResponseEntity.status(401).body("");
        }
    }
    @PostMapping("Agregar/{id}")
    public ResponseEntity<Object> agregarProductoAlCarrito(@PathVariable Long id, @RequestBody Producto producto) {

        return null;
    }


    @DeleteMapping(value = "Eliminar/{id}/{productId}")
    public void eliminarObjeto(@PathVariable Long id, @PathVariable Long productId) {

    }

    @GetMapping("Obtener/{id}")
    public ResponseEntity<Double> getPrecio(@PathVariable Long id) {

        return null;
    }

}
