package com.xiaweizi.design.p14_command;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p14_command.CommandDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class CommandDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Broker broker = new Broker();

        Order buy = new BuySotck(stock);
        Order sell = new SellSotck(stock);
        broker.takeOrder(buy);
        broker.takeOrder(sell);
        broker.placeOrders();
    }
}
