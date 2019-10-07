package com.metinacun.testmultipledatabase.model.oracle;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "oracleproduct")
public class OracleProduct {

    @Id
    private int id;
    private String name;
    private int price;
}
