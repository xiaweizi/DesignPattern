package com.xiaweizi.design.p22_template;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p22_template.Game
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/13
 *     desc   :
 * </pre>
 */

abstract class Game {
    abstract void init();
    abstract void start();
    abstract void stop();
    final void play() {
        init();
        start();
        stop();
    }
}
