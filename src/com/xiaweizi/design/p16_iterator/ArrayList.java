package com.xiaweizi.design.p16_iterator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p16_iterator.ArrayList
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class ArrayList<T> implements List<T>{
    private java.util.List<T> list = new java.util.ArrayList<>();
    @Override
    public void add(T o) {
        list.add(o);
    }

    @Override
    public void remove(T o) {
        list.remove(o);
    }

    @Override
    public Iterator iterator() {
        return new ListIterator(list);
    }
}
