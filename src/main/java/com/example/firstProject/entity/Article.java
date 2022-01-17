package com.example.firstProject.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity; //enables DB understands objects
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@ToString
@Entity
public class Article {

    @Id
    @GeneratedValue //auto generated annotation
    private  Long id;
    @Column
    private String title;
    @Column
    private String content;



}
