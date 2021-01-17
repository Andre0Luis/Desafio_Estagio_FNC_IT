package io.github.labauto.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.labauto.todo.model.Paciente;


public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
