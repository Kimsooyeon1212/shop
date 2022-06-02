package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "result")
@Getter
@Setter
@ToString
public class Result {

    @Column(name="result_id")
    private Long id;

    @Id
    private String name;

    @Column(unique = true)
    private String url;


}
