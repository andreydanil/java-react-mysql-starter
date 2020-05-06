package com.company.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "greetings")
public class Greeting {

    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String name;

    public Greeting(String name) {
        this.name = name;
    }

}
