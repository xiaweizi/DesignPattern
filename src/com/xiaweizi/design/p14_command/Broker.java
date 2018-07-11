package com.xiaweizi.design.p14_command;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p14_command.Broker
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Broker {
    private List<Order>  orderList = new ArrayList<>();
    void takeOrder(Order order) {
        orderList.add(order);
    }
    void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
