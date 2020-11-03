package org.example.data;

import org.example.model.Order;
import org.example.model.Product;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FetchData {

    private static final String REST_URI_PRODUCT = "http://5e28257b120f820014bf415a.mockapi.io/api/v1/beverage";
    private static final String REST_URI_ORDER = "http://5e28257b120f820014bf415a.mockapi.io/api/v1/order";

    private Client client = ClientBuilder.newClient();




    public List<Product> getAllProducts(){

        List<Product> products =
                client
                        .target(REST_URI_PRODUCT)
                        .request(MediaType.APPLICATION_JSON)
                        .get(new GenericType<List<Product>>() {});

        return products;
    }


    public List<Order> getAllOrders(){

        List<Order> orders =
                client
                        .target(REST_URI_ORDER)
                        .request(MediaType.APPLICATION_JSON)
                        .get(new GenericType<List<Order>>() {});

        return orders;
    }



}
