/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noelcosgrave.power;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import java.text.DecimalFormat;

/**
 *
 * @author noel
 */
@Path("/")
public class RaiseToPower {
    @GET //http://localhost:49002/api/power/2/2
    @Path("/power/{number}/{power}")
    @Produces(MediaType.TEXT_HTML)
    public Response convertToC(@PathParam("number") double number, @PathParam("power") double power) {
        DecimalFormat formatter = new DecimalFormat("0");
        formatter.setMaximumFractionDigits(10);
        double answer = Math.pow(number,power);     
        String output = String.format("<html><head></head><body>%s<sup>%s</sup> = %s</body></html>",
                formatter.format(number),formatter.format(power),formatter.format(answer));
        return Response.status(200).entity(output).build();
    }
}



