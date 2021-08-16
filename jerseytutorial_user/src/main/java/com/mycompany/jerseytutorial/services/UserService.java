/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.services;

import com.mycompany.jerseytutorial.model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author enda
 */
public class UserService {
    
    public static List<User> list = new ArrayList<>();
    
    public List<User> createAllUsers() {
        User m1 = new User(0, "Enda", "brown", 30);
        User m2 = new User(1, "Liam", "blond", 66);

        list.add(m1);
        list.add(m2);
        return list;
       
    }
 
    public List<User> getAllUsers() {

        return list;
       
    }    
    
    public User getUser(int id) {
        return list.get(id-1);
    }
    
    
}
