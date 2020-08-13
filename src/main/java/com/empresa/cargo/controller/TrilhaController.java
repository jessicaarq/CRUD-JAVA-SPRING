package com.empresa.cargo.controller;

import com.empresa.cargo.domain.Cargo;
import com.empresa.cargo.domain.Trilha;
import com.empresa.cargo.service.CargoService;
import com.empresa.cargo.service.TrilhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/trilhas")
public class TrilhaController {

    @Autowired
    private TrilhaService service;

    @RequestMapping(method= RequestMethod.GET)
    public ResponseEntity<List<Trilha>> findAll() {
        List<Trilha> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ResponseEntity<Trilha> find(@PathVariable Integer id) {
        Trilha obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Trilha obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.PUT)
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Trilha obj){
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
