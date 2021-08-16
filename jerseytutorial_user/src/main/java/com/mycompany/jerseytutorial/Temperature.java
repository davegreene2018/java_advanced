/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jerseytutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author enda
 */
@Path("/Converter")
public class Temperature {
    // curl -vi -X GET -G "http://localhost:49000/api/Converter/Celcius/35"
    @GET
    @Path("/Celcius/{param}")
    public Response degCToDegF(@PathParam("param") int degC) {
        String output = degC + "C converted to F = " + (degC*9/5+32) + "F";
        return Response.status(200).entity(output).build();
    }
    
    
    // curl -vi -X GET -G "http://localhost:49000/api/Converter/Farenheit/95"    
    @GET
    @Path("/Farenheit/{param}")
    public Response degFToDegC(@PathParam("param") int degF) {
        String output = degF + "F converted to C = " + ((degF-32)*5/9) + "C";
        return Response.status(200).entity(output).build();
    }
        
}
