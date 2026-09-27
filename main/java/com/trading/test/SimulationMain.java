package com.trading.test;


import com.trading.engine.*;
import com.trading.model.*;



public class SimulationMain {


    public static void main(String[] args){


        MatchingEngine engine =
                new MatchingEngine();



        Order sell =
                new Order(
                        1,
                        "AAPL",
                        Side.SELL,
                        OrderType.LIMIT,
                        150,
                        100
                );



        Order buy =
                new Order(
                        2,
                        "AAPL",
                        Side.BUY,
                        OrderType.LIMIT,
                        151,
                        50
                );



        engine.submitOrder(sell);



        System.out.println(
                engine.submitOrder(buy)
        );


    }


}
