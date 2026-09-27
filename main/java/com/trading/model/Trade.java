package com.trading.model;


public class Trade {


    private final Order buyOrder;

    private final Order sellOrder;

    private final double price;

    private final int quantity;



    public Trade(
            Order buyOrder,
            Order sellOrder,
            double price,
            int quantity
    ){

        this.buyOrder = buyOrder;

        this.sellOrder = sellOrder;

        this.price = price;

        this.quantity = quantity;

    }



    public double getPrice(){

        return price;

    }



    public int getQuantity(){

        return quantity;

    }



    @Override
    public String toString(){

        return
                "Trade{" +
                        "price=" + price +
                        ", quantity=" + quantity +
                        "}";

    }


}
