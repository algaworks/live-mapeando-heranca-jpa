package com.algaworks.cadastroprojetos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("colaborador")
public class Colaborador extends RecursoProjeto {

    private String nome;

    private String email;
}
