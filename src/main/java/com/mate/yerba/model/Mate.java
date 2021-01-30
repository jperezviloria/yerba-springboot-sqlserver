package com.mate.yerba.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Mate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMate;

    private String typeMate;

    private int priceMate;

}
