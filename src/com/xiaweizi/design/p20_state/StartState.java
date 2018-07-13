package com.xiaweizi.design.p20_state;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p20_state.StopState
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/13
 *     desc   :
 * </pre>
 */

class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("now state is stop");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
