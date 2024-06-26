package com.example.Medico.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "O id do paciente é obrigatório")
    private Long pacienteId;

    @NotNull(message = "O id do médico é obrigatório")
    private Long medicoId;
    @NotNull(message = "A data da consulta é obrigatória")
    @FutureOrPresent
    private LocalDateTime dataHora;

    @NotNull(message = "A descrição da consulta é obrigatoria")
    @Size(min = 10, max = 500, message = "A descrição da consulta deve ter entre 10 e 500 caracteres")
    private String descricao;

    public Consulta(Long id, Long pacienteId, Long medicoId, LocalDateTime dataHora, String descricao) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public Consulta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(Long pacienteId) {
        this.pacienteId = pacienteId;
    }

    public Long getMedicoId() {
        return medicoId;
    }

    public void setMedicoId(Long medicoId) {
        this.medicoId = medicoId;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
