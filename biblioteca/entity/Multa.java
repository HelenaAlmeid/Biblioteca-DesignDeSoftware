package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Multa {

	@Id
	private int id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "IdEmprestimo")
	private Emprestimo emprestimo;

	private double valor;

	private String nome;


}
