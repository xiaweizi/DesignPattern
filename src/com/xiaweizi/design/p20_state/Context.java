package com.xiaweizi.design.p20_state;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p20_state.Context
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/13
 *     desc   :
 * </pre>
 */

class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
