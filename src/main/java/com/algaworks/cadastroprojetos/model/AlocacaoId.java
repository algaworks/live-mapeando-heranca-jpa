package com.algaworks.cadastroprojetos.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class AlocacaoId implements Serializable {

    @EqualsAndHashCode.Include
    @Column(name = "projeto_id")
    private Integer projeto;

    @EqualsAndHashCode.Include
    @Column(name = "recurso_id")
    private Integer recurso;


}
