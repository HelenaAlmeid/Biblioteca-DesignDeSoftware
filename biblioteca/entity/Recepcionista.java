package entity;
import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Recepcionista {

	private String nome;
	@Id
	private String cpf;

	private String email;

	@OneToMany (mappedBy = "emprestimo", fetch = FetchType.LAZY)
	private Collection<Emprestimo> emprestimo;

}
