package com.xiaweizi.design.p05_adapter.objectadapter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p05_adapter.objectadapter.VoltAdapter
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class VoltAdapter implements Volt5 {

    private Volt220 volt220;
    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        System.out.println("开始转换 " + volt220.getVolt220());
        return 5;
    }
}
