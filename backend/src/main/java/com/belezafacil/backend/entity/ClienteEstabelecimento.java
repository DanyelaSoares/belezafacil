
package com.belezafacil.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import java.time.LocalDate;

@Entity
@Table(
        name = "cliente_estabelecimento",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"cliente_id", "estabelecimento_id"}
                )
        }
)
public class ClienteEstabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Cliente associado ao vínculo
    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    // Salão ao qual o vínculo pertence
    @ManyToOne(optional = false)
    @JoinColumn(name = "estabelecimento_id", nullable = false)
    private Estabelecimento estabelecimento;

    // Relação da pessoa com este salão
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private TipoVinculo tipoVinculo = TipoVinculo.LEAD;

    // Situação do vínculo neste salão
    @Column(nullable = false)
    private Boolean ativo = true;

    // Data em que começou o vínculo com este salão
    @Column(nullable = false, updatable = false)
    private LocalDate dataInicioVinculo;

    // Data do último atendimento efetivamente concluído
    private LocalDate dataUltimoAtendimento;

    @PrePersist
    public void preencherDataInicioVinculo() {
        if (dataInicioVinculo == null) {
            dataInicioVinculo = LocalDate.now();
        }
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public TipoVinculo getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(TipoVinculo tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataInicioVinculo() {
        return dataInicioVinculo;
    }

    public LocalDate getDataUltimoAtendimento() {
        return dataUltimoAtendimento;
    }

    public void setDataUltimoAtendimento(LocalDate dataUltimoAtendimento) {
        this.dataUltimoAtendimento = dataUltimoAtendimento;
    }
}
