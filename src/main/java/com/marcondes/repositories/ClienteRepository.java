package com.marcondes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcondes.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository< Cliente, Long> {

}
