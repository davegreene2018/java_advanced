/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ca2partb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import java.text.DecimalFormat;

/**
 *
 * @author Daveg
 */
@Path("/")
public class MinMax {
    
    
    //http://localhost:49002/api/min/number1/number2
    @GET
    @Path("/min/{number1}/{number2}") 
    @Produces(MediaType.TEXT_HTML)
    public Response getmin(@PathParam("number1") double number1, @PathParam("number2") double number2) {
        DecimalFormat formatter = new DecimalFormat("0");
        formatter.setMaximumFractionDigits(10);
        double answer = Math.min(number1, number2);     
        String output = String.format("<html><head></head><body>%s<sup>%s</sup> = %s</body></html>",
               (number1), (number2), formatter.format(answer));
        return Response.status(200).entity(output).build();
    }
    
    //http://localhost:49002/api/max/number1/number2
    @GET
    @Path("/max/{number1}/{number2}") 
    @Produces(MediaType.TEXT_HTML)
    public Response getmax(@PathParam("number1") double number1, @PathParam("number2") double number2) {
        DecimalFormat formatter = new DecimalFormat("0");
        formatter.setMaximumFractionDigits(10);
        double answer = Math.max(number1, number2);     
        String output = String.format("<html><head></head><body>%s<sup>%s</sup> = %s</body></html>",
               (number1), (number2), formatter.format(answer));
        return Response.status(200).entity(output).build();
    }
    
    //http://localhost:49002/api/avg/number1/number2
    @GET
    @Path("/avg/{number1}/{number2}") 
    @Produces(MediaType.TEXT_HTML)
    public Response getavg(@PathParam("number1") double number1, @PathParam("number2") double number2) {
        DecimalFormat formatter = new DecimalFormat("0");
        formatter.setMaximumFractionDigits(10);
        double answer = number1+number2/2;     
        String output = String.format("<html><head></head><body>%s<sup>%s</sup> = %s</body></html>",
               (number1), (number2), formatter.format(answer));
        return Response.status(200).entity(output).build();
    }
    
    //http://localhost:49002/api/power/number1/number2
    @GET 
    @Path("/power/{number1}/{number2}")
    @Produces(MediaType.TEXT_HTML)
    public Response getpower(@PathParam("number1") double number1, @PathParam("number2") double number2) {
        DecimalFormat formatter = new DecimalFormat("0");
        formatter.setMaximumFractionDigits(10);
        double answer = Math.pow(number1,number2);     
        String output = String.format("<html><head></head><body>%s<sup>%s</sup> = %s</body></html>",
                formatter.format(number1),formatter.format(number2),formatter.format(answer));
        return Response.status(200).entity(output).build();
    }
}
