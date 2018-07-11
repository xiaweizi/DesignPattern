package com.xiaweizi.design.p13_respons_chain;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p13_respons_chain.Handler
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

abstract class Handler {
    Handler nextHandler;
    abstract void hand(LeaveNote level);
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
