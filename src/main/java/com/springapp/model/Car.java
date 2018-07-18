package com.springapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "mark")
    private String mark;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private Short year;

    @Column(name = "prodcountry")
    private String prodCountry;

}
