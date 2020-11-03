package org.example.server;


import org.example.model.Order;
import org.example.model.Product;
import org.example.services.ShopServices;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.Test;

import javax.ws.rs.core.UriBuilder;
import java.util.List;

public class ClientTest {
    public static final UriBuilder FULL_PATH = UriBuilder.fromPath("http://127.0.0.1:8080/JAX_RS_war/rest/api/");

    private ShopServices shopData = new ShopServices();
    List<Product> products = shopData.getAllProducts();
    List<Order> orders = shopData.getAllOrders();


    @Test
    public void test() {

        final ResteasyClient client = new ResteasyClientBuilder().build();
        final ResteasyWebTarget target = client.target(FULL_PATH);
        // TODO test text file content


    }

}
