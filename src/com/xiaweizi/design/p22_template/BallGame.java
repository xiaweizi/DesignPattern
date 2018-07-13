package com.xiaweizi.design.p22_template;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p22_template.BallGame
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/13
 *     desc   :
 * </pre>
 */

class BallGame extends Game {
    @Override
    void init() {
        System.out.println("Ball init");
    }

    @Override
    void start() {
        System.out.println("Ball start");
    }

    @Override
    void stop() {
        System.out.println("Ball stop");
    }
}
