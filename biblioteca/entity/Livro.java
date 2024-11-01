package entity;

import jakarta.persistence.*;

@Entity
public class Livro {

    @Id
    private int id;

    private String nome;

    private String autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emprestimo_associado")
    private Emprestimo emprestimo;
}
