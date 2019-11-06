package com.algaworks.cadastroprojetos.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@DiscriminatorValue("material")
public class Material extends RecursoProjeto {

    private String descricao;
}
