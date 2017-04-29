package model.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author gusta
 */
@Entity
@Table(name="produtos")
public class Produto implements Serializable {
    
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
    @Column(name="lote")
    private int lote;
    @Column(name="data_validade")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_validade;
    @Column(name="data_registro")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_registro;

    public double getPreço() {
        return preço;
    }

    public int getLote() {
        return lote;
    }
}
