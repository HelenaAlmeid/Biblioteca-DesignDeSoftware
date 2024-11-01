package entity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
public class Emprestimo {

	private Date dataDeLocacao;

	private Date dataDeDevolucao;

	private String prazo;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_cpf")
	private Cliente cliente;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recepcionista_cpf")
	private Recepcionista recepcionista;

	@Id
	private int id;

	@OneToMany(mappedBy = "emprestimo")
	private ArrayList<Livro> livros;


}
