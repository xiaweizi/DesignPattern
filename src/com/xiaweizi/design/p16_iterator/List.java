package com.xiaweizi.design.p16_iterator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p16_iterator.List
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

interface List<T> {
    void add(T t);
    void remove(T t);
    public Iterator iterator();
}
