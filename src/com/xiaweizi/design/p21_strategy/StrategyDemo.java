package com.xiaweizi.design.p21_strategy;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p21_strategy.StrategyDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/13
 *     desc   :
 * </pre>
 */

class StrategyDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(1, 2));
        context.setStrategy(new OperationSubstract());
        System.out.println(context.executeStrategy(2,10));
    }
}
