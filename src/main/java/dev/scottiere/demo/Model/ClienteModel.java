package dev.scottiere.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_clientes")
public class ClienteModel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String email;


    public ClienteModel(Long id, String nome, int idade, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
}
