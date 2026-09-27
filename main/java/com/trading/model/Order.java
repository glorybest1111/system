package com.trading.model;


import java.time.LocalDateTime;


public class Order {


    private final long orderId;

    private final String symbol;

    private final Side side;

    private final OrderType type;

    private final double price;

    private int quantity;

    private final LocalDateTime timestamp;



    public Order(
            long orderId,
            String symbol,
            Side side,
            OrderType type,
            double price,
            int quantity
    ){

        this.orderId = orderId;
        this.symbol = symbol;
        this.side = side;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.timestamp = LocalDateTime.now();

    }



    public long getOrderId(){

        return orderId;

    }


    public String getSymbol(){

        return symbol;

    }


    public Side getSide(){

        return side;

    }


    public double getPrice(){

        return price;

    }


    public int getQuantity(){

        return quantity;

    }


    public void reduceQuantity(int amount){

        this.quantity -= amount;

    }



    public LocalDateTime getTimestamp(){

        return timestamp;

    }


}
