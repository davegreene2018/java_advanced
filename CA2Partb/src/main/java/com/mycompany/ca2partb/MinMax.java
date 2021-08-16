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
    
    
    // //http://localhost:49004/api/minmax/number1/number2
    @GET
    @Path("/minmax/{number1}/{number2}")
    @Produces(MediaType.TEXT_HTML)
    public Response convertToC(@PathParam("number1") double number1, @PathParam("number2") double number2) {
        DecimalFormat formatter = new DecimalFormat("0");
        formatter.setMaximumFractionDigits(10);
        double answer = Math.min(number1, number2);     
        String output = String.format("<html><head></head><body>%s<sup>%s</sup> = %s</body></html>",
                formatter.format(number1),formatter.format(number2),formatter.format(answer));
        return Response.status(200).entity(output).build();
    }
    
}
