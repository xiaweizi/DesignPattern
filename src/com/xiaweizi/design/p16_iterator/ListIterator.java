package com.xiaweizi.design.p16_iterator;

import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p16_iterator.ListIterator
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class ListIterator<T> implements Iterator {
    private final List<T> mData;
    private int cursor = 0;

    public ListIterator(List<T> mData) {
        this.mData = mData;
    }

    @Override
    public T next() {
        T t = null;
        if (cursor < mData.size()) {
            t = mData.get(cursor++);
        }
        return t;
    }

    @Override
    public boolean hasNext() {
        return cursor != mData.size();
    }
}
