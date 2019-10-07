package com.metinacun.testmultipledatabase.model.oracle;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usertable")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
}
