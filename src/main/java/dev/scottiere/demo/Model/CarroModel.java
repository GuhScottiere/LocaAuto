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

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;

    public CarroModel(){

    }

    public CarroModel(Long id, String modelo, Marca marca, int anoFabricacao) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }
}
