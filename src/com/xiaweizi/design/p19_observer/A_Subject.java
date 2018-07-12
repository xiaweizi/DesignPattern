package com.xiaweizi.design.p19_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p19_observer.A_Subject
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class A_Subject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String msg;

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public void notify(Observer observer) {
        if (observers.contains(observer)) {
            observer.update(msg);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }
}
