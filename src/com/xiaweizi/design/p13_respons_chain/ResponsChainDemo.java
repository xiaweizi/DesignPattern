package com.xiaweizi.design.p13_respons_chain;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p13_respons_chain.ResponsChainDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class ResponsChainDemo {
    private static Handler getChainHandler() {
        Handler client = new ClientHandler();
        Handler technology = new Technology();
        Handler ceo = new CEO();
        client.setNextHandler(technology);
        technology.setNextHandler(ceo);
        return client;
    }

    public static void main(String[] args) {
        LeaveNote leaveNote = new LeaveNote("张三", "婚假", 8);
        Handler chainHandler = getChainHandler();
        chainHandler.hand(leaveNote);
    }
}
