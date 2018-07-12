package com.xiaweizi.design.p18_memento;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p18_memento.Memento
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
