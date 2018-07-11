package com.xiaweizi.design.p14_command;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p14_command.BuySotck
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class BuySotck implements Order {
    private Stock stock;

    public BuySotck(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

class SellSotck implements Order {
    private Stock stock;

    public SellSotck(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
