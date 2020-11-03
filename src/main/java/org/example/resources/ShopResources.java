package org.example.resources;


import org.example.model.Order;
import org.example.model.Product;
import org.example.services.ShopServices;
import org.example.utils.Utils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Path("/api")
public class ShopResources {

  private final ShopServices shopServices = new ShopServices();

    Utils utils=new Utils();



    @GET
    @Path("/products")
    @Produces({ "application/json" })
    public List<Product> products() {
        return  shopServices.getAllProducts();

    }


    @GET
    @Path("/orders")
    @Produces({ "application/json" })
    public List<Order> orders() {
        return shopServices.getAllOrders();

    }


    @GET
    @Path("/cost-per-order")
    @Produces({ "application/json" })
    public Map<Integer,Double> test() {
        return shopServices.orderCost();

    }

    @GET
    @Path("/total")
    @Produces({ "application/json" })
    public Double totalIncome() {



        return shopServices.totalIncome();

    }

    @GET
    @Path("/getTextFile")
    @Produces("text/plain")
    public Response getFile() {

        try {
            utils.textOutput(shopServices.orderCost(),shopServices.totalIncome());

            File file = new File("output");

            Response.ResponseBuilder response = Response.ok( file);
            response.header("Content-Disposition",
                    "attachment; filename=\"summary.log\"");
            return response.build();

        } catch (IOException e) {
            e.printStackTrace();
        }

return null;


    }


    @GET
    @Path("/getTextFileParallel")
    @Produces("text/plain")
    public Response getFileparallel() {

        try {

            utils.textOutput(shopServices.orderCostParallel(),shopServices.totalIncome());

            File file = new File("output");

            Response.ResponseBuilder response = Response.ok( file);
            response.header("Content-Disposition",
                    "attachment; filename=\"summary.log\"");
            return response.build();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;


    }


}
