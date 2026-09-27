package com.trading.engine;

import com.trading.model.Order;
import com.trading.model.Side;
import java.util.PriorityQueue;

public class OrderBook {
    // 买单：价格高优先；卖单：价格低优先
    private final PriorityQueue<Order> bids = new PriorityQueue<>((a, b) -> Double.compare(b.getPrice(), a.getPrice()));
    private final PriorityQueue<Order> asks = new PriorityQueue<>((a, b) -> Double.compare(a.getPrice(), b.getPrice()));

    public void addOrder(Order order) {
        if(order.getSide() == Side.BUY){
            bids.add(order);
        }else{
            asks.add(order);
        }
    }

    public PriorityQueue<Order> getBids(){
        return bids;
    }
    public PriorityQueue<Order> getAsks(){
        return asks;
    }
}
