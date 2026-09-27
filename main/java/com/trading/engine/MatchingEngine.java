package com.trading.engine;


import com.trading.model.*;

import java.util.ArrayList;
import java.util.List;



public class MatchingEngine {


    private final OrderBook orderBook;



    public MatchingEngine(){

        orderBook =
                new OrderBook();

    }



    public List<Trade> submitOrder(Order order){


        List<Trade> trades =
                new ArrayList<>();


        if(order.getSide()==Side.BUY){


            while(!orderBook.getAsks().isEmpty()
                    &&
                    order.getQuantity()>0
            ){


                Order sell =
                        orderBook.getAsks().peek();



                if(order.getPrice()
                        <
                        sell.getPrice())

                    break;



                int quantity =
                        Math.min(
                                order.getQuantity(),
                                sell.getQuantity()
                        );


                Trade trade =
                        new Trade(
                                order,
                                sell,
                                sell.getPrice(),
                                quantity
                        );


                trades.add(trade);



                order.reduceQuantity(quantity);

                sell.reduceQuantity(quantity);



                if(sell.getQuantity()==0)

                    orderBook.getAsks().poll();


            }


        }



        if(order.getQuantity()>0)

            orderBook.addOrder(order);



        return trades;


    }

}
