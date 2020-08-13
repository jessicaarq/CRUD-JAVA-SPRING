package com.empresa.cargo.service;

import com.empresa.cargo.domain.Cargo;
import com.empresa.cargo.repositories.CargoRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {
    @Autowired
    CargoRepository repo;

    public List<Cargo> findAll(){
        return repo.findAll();
    }

    public Cargo find(Integer id) {
        Optional<Cargo> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(id, "Objeto não encontrado, Tipo: " + Cargo.class.getName()));
    }

    public Cargo insert (Cargo obj){
        obj.setId(null);
        return repo.save(obj);
    }

    public Cargo update (Cargo obj){
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete (Integer id) {
        find(id);
        repo.delete(find(id));
    }
}
