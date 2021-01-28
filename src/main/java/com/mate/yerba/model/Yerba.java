package com.mate.yerba.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Yerba {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idYerba;

    private String brandYerba;

    private int priceYerba;
}
