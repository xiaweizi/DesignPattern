package com.xiaweizi.design.p09_decorator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p09_decorator.HeroA
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class HeroA implements Hero {

    private String name;

    public HeroA(String name) {
        this.name = name;
    }

    @Override
    public void learnSkill() {
        System.out.println(name + "学习了以上技能");
    }
}
