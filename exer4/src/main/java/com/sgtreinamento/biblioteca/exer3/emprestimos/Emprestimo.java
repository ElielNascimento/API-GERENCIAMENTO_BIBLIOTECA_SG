package com.sgtreinamento.biblioteca.exer3.emprestimos;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "emprestimo")
public class Emprestimo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "multa")
    private Integer multa;

    @CreationTimestamp
    @Column(name = "data_retirada")
    private Date dataRetirada;

    @Column(name = "data_devolucao")
    private Date dataDevolucao;

    @Column(name = "livro_entregue")
    private Boolean livroEntregue = true;

    public Emprestimo() {
    }

    public Emprestimo(Integer limiteItens, Date dataRetirada, Date dataDevolucao, Boolean livroEntregue) {
        this.multa = limiteItens;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livroEntregue = livroEntregue;
    }

    public Long getId() {
        return id;
    }

    public Integer getLimiteItens() {
        return multa;
    }

    public void setLimiteItens(Integer limiteItens) {
        this.multa = limiteItens;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Boolean getLivroEntregue() {
        return livroEntregue;
    }

    public void setLivroEntregue(Boolean livroEntregue) {
        this.livroEntregue = livroEntregue;
    }
}
