/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial.resources;

import com.google.gson.Gson;
import com.mycompany.jerseytutorial.model.User;
import com.mycompany.jerseytutorial.services.UserService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author enda
 */

// curl -vi -X GET -G "http://localhost:49000/api/users"
@Path("/users")
public class UserResource {
    
    UserService userService = new UserService();
    
    // curl -vi -X GET -G "http://localhost:49000/api/users/"
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<User> createUsers() {
        return userService.createAllUsers();
    }    
    
    
    // curl -vi -X GET -G "http://localhost:49000/api/users/fetch"
    @GET
    @Path("fetch/")
    @Produces(MediaType.APPLICATION_XML)
    public List<User> getUsers() {
        return userService.getAllUsers();
    }       

    
    // curl -vi -X GET -G "http://localhost:49000/api/users/fetchj"
    @GET
    @Path("fetchj/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsersJ() {
        Gson gson = new Gson();
        List <User> a = userService.getAllUsers();
        return Response.status(Response.Status.CREATED).entity(gson.toJson(a)).build();
    }    
    
    // curl -vi -X GET -G "http://localhost:49000/api/users/fetch/1"
    @GET
    @Path("fetch/{userId}")
    @Produces(MediaType.APPLICATION_XML)  
    public User getUser(@PathParam("userId") int id) {
        return userService.getUser(id);
    }
}
