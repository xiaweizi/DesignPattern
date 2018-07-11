package com.xiaweizi.design.p05_adapter.classadapter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p05_adapter.classadapter.ClassAdapterDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/10
 *     desc   : 类适配器测试代码
 * </pre>
 */

class ClassAdapterDemo {
    public static void main(String[] args) {
        Volt5 volt5 = new VoltAdapter();
        System.out.println("输出电压：" + volt5.getVolt5());
    }
}
