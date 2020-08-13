package com.empresa.cargo.controller;

import com.empresa.cargo.domain.Cargo;
import com.empresa.cargo.service.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/cargos")
public class CargoController {

    @Autowired
    private CargoService service;

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<List<Cargo>> findAll() {
        List<Cargo> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Cargo> find(@PathVariable Integer id) {
        Cargo obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Cargo obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Cargo obj){
        obj.setId(id);
        obj = service.update(obj);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

}
