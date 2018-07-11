package com.xiaweizi.design.p09_decorator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p09_decorator.DecoratorDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class DecoratorDemo {
    public static void main(String[] args) {
        Hero hero = new HeroA("盲僧");

        Skill q = new Skill_Q(hero, "天音波/回音击");
        Skill w = new Skill_W(q, "金钟罩/铁布衫");
        Skill e = new Skill_E(w, "天雷破/摧筋断骨");
        Skill r = new Skill_R(e, "猛龙摆尾");
        r.learnSkill();

    }
}
