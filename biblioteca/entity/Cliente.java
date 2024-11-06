package entity;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {

	private String nome;

	@Id
	private String cliente_cpf;

	@OneToMany(mappedBy = "cliente")
	private ArrayList<Emprestimo> emprestimo;

    public Cliente(String nome, String cliente_cpf){
		this.nome = nome;
		this.cliente_cpf = cliente_cpf;
	}
}
