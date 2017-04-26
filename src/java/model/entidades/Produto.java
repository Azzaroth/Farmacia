/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author gusta
 */
@Entity
@Table(name="produtos")
public class Produto {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name="nome")
    private String nome;
    @Column(name="id_tipo")
    private int id_tipo;
    @Column(name="descrição")
    private String descrição;
    @Column(name="preço")
    private double preço;
    @Column(name="data_validade")
    private Date data_validade;
    @Column(name="data_registro")
    private Date data_registro;
}
