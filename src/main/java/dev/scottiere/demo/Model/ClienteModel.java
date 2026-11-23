package dev.scottiere.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_clientes")
public class ClienteModel {
     @Id
    private Long id;
    private String nome;
    private int idade;
    private String email;
}
