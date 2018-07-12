package com.xiaweizi.design.p19_observer;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p19_observer.Subject
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

interface Subject {
    void attach(Observer observer);
    void notify(Observer observer);
    void notifyAllObserver();
    void remove(Observer observer);
    void setMsg(String msg);
}
