package dev.scottiere.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_carros")
public class CarroModel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private Marca marca;
    private int anoFabricacao;
}
