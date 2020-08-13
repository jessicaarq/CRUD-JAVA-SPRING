package com.empresa.cargo.repositories;

import com.empresa.cargo.domain.Trilha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrilhaRepository extends JpaRepository<Trilha, Integer>{
}
