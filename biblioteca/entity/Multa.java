package entity;

import jakarta.persistence.Entity;

@Entity
public class Multa {

	private int id;

	private int idEmprestimo;

	private double valor;

	private String nome;

	private Emprestimo emprestimo;

}
