package entity;
import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Recepcionista {

	private String nome;

	@Id
	private String recepcionista_cpf;

	private String email;

	@OneToMany (mappedBy = "recepcionista")
	private ArrayList<Emprestimo> emprestimo;

}
