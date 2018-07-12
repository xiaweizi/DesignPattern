package com.xiaweizi.design.p16_iterator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p16_iterator.IteratorDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/12
 *     desc   :
 * </pre>
 */

class IteratorDemo {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            data.add("data" + i);
        }
        Iterator iterator = data.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
