package org.example.services;


import org.example.data.FetchData;
import org.example.model.Order;
import org.example.model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ShopServices {


    private FetchData shopData = new FetchData();




    public List<Product> getAllProducts() {
        return shopData.getAllProducts();

    }


    public List<Order> getAllOrders() {

        return  shopData.getAllOrders();

    }

    public  Map<Integer,Double> orderCost(){

        List<Product> products = shopData.getAllProducts();
        List<Order> orders = shopData.getAllOrders();

        Map<Integer,Double> costOfEachOrder = new HashMap<>();



        for(Order order : orders){

            double cost=0;
           if (order.isEspresso_classic()){
                   cost= products.get(0).getCost();
           }
           if(order.isEspresso_arabica()){
               cost= cost+products.get(1).getCost();
           }
           if(order.isEspresso_decaf()){
               cost= cost+products.get(2).getCost();
           }
           if(order.isMilk()){
               cost= cost+products.get(3).getCost();
           }
           if(order.isSoy()){
               cost= cost+products.get(4).getCost();
           }
            if(order.isCaramel_syrop()){
                cost= cost+products.get(5).getCost();
            }
            if(order.isAlmond_milk()){
                cost= cost+products.get(6).getCost();
            }


            costOfEachOrder.put(order.getId(),cost);


        }

return costOfEachOrder;

    }


    public Double totalIncome(){

       Map<Integer,Double> costs= orderCost();

       Double totalIncome=0.0;
       for(Double d:costs.values()){
           totalIncome=totalIncome+d;
       }

        return totalIncome;
    }



    public  Map<Integer,Double> orderCostParallel(){

        List<Product> products = shopData.getAllProducts();
        List<Order> orders = shopData.getAllOrders();

        Map<Integer,Double> costOfEachOrder = new HashMap<>();

        orders
                .parallelStream()
                .forEach(order -> {
                    double cost=0;
                    if (order.isEspresso_classic()){
                        cost= products.get(0).getCost();
                    }
                    if(order.isEspresso_arabica()){
                        cost= cost+products.get(1).getCost();
                    }
                    if(order.isEspresso_decaf()){
                        cost= cost+products.get(2).getCost();
                    }
                    if(order.isMilk()){
                        cost= cost+products.get(3).getCost();
                    }
                    if(order.isSoy()){
                        cost= cost+products.get(4).getCost();
                    }
                    if(order.isCaramel_syrop()){
                        cost= cost+products.get(5).getCost();
                    }
                    if(order.isAlmond_milk()){
                        cost= cost+products.get(6).getCost();
                    }


                    costOfEachOrder.put(order.getId(),cost);
                });

        return costOfEachOrder;

    }

}
