package com.xiaweizi.design.p20_state;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p20_state.StateDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/13
 *     desc   :
 * </pre>
 */

class StateDemo {
    public static void main(String[] args) {
        Context context = new Context();
        State start = new StartState();
        start.doAction(context);
        System.out.println(start.toString());

        State stop = new StopState();
        start.doAction(context);
        System.out.println(stop.toString());
    }
}
