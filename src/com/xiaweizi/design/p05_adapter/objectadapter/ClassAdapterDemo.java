package com.xiaweizi.design.p05_adapter.objectadapter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p05_adapter.objectadapter.ClassAdapterDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   :
 * </pre>
 */

class ClassAdapterDemo {
    public static void main(String[] args) {
        Volt5 volt5 = new VoltAdapter(new Volt220());
        System.out.println(volt5.getVolt5());
    }
}
