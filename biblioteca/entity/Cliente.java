package entity;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {

	private String nome;

	@Id
	private String cpf;

	private Collection<Emprestimo> emprestimo;

    public static class Livro {

    }
}
