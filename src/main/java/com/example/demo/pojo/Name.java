package com.example.demo.pojo;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bing
 */
@Entity
@Table(name = "name")
@Data
public class Name {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;
}
