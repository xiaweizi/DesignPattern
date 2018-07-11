package com.xiaweizi.design.p13_respons_chain;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p13_respons_chain.LeaveNote
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class LeaveNote {
    final String name;
    final String reason;
    final int leaveDays;

    public LeaveNote(String name, String reason, int leaveDays) {
        this.name = name;
        this.reason = reason;
        this.leaveDays = leaveDays;
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
