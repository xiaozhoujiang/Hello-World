package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "city")
public class City {

    @Id
    @Column(name = "id")
    private Integer id;

}
