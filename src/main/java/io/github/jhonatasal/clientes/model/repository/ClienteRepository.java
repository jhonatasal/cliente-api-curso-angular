package io.github.jhonatasal.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jhonatasal.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
