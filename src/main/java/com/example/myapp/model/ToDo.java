package com.example.myapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="todo_table")
@Data
@NoArgsConstructor

public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public ToDo(String name) {
        this.name = name;
    }
}
