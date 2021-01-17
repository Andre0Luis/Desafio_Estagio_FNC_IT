package io.github.labauto.todo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter

public class Exame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoExameMarcado;
	
	@Column
	private String nomePaciente;
	
	@Column
	private Long codigoProcedimento;
	
	@Column
	private String dataDeColeta;
	
	@Column
	private String dataDeEntrega;


}
