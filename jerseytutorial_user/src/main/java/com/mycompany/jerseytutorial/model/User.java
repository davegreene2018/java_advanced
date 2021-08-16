/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author enda
 */
@XmlRootElement
public class User {
    
    private long id;
    private String name;
    private int age;
    private String hairColour;


    public User() {
    }

    public User(long id, String name, String hairColour, int age) {
        this.age = age;
        this.hairColour = hairColour;
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
