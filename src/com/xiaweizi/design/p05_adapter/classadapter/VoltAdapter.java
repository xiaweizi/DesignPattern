package com.xiaweizi.design.p05_adapter.classadapter;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p05_adapter.classadapter.VoltAdapter
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class VoltAdapter extends Volt220 implements Volt5{

    @Override
    public int getVolt5() {
        return 5;
    }
}
