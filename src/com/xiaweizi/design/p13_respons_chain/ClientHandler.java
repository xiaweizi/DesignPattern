package com.xiaweizi.design.p13_respons_chain;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p13_respons_chain.ClientHandler
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class ClientHandler extends Handler {

    @Override
    void hand(LeaveNote level) {
        System.out.println("主管批准" + level.name + level.reason);
        if (level.leaveDays > 1) {
            if (nextHandler != null) {
                nextHandler.hand(level);
            }
        }
    }
}

class Technology extends Handler {

    @Override
    void hand(LeaveNote level) {
        System.out.println("技术主管批准" + level.name + level.reason);
        if (level.leaveDays > 3) {
            if (nextHandler != null) {
                nextHandler.hand(level);
            }
        }
    }
}

class CEO extends Handler {

    @Override
    void hand(LeaveNote level) {
        System.out.println("CEO" + level.name + level.reason);
        if (level.leaveDays > 5) {
            if (nextHandler != null) {
                nextHandler.hand(level);
            }
        }
    }
}