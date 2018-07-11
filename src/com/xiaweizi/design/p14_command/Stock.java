package com.xiaweizi.design.p14_command;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p14_command.Stock
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Stock {
    private String name = "ABC";
    private int quantity = 10;

    void buy() {
        System.out.println("Stock{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}' + "bought");
    }

    void sell() {
        System.out.println("Stock{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}' + "sold");
    }

}
