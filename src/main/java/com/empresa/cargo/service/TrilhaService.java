package com.empresa.cargo.service;

import com.empresa.cargo.domain.Cargo;
import com.empresa.cargo.domain.Trilha;
import com.empresa.cargo.repositories.TrilhaRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrilhaService {

    @Autowired
    TrilhaRepository repo;

    public List<Trilha> findAll(){
        return repo.findAll();
    }

    public Trilha find(Integer id) {
        Optional<Trilha> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(id, "Objeto não encontrado, Tipo: " + Cargo.class.getName()));
    }

    public Trilha insert (Trilha obj){
        obj.setId(null);
        return repo.save(obj);
    }

    public Trilha update (Trilha obj){
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete (Integer id) {
        find(id);
        repo.delete(find(id));
    }
}
