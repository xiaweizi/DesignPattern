package com.xiaweizi.design.p09_decorator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p09_decorator.Skill_Q
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Skill_R extends Skill {

    public Skill_R(Hero hero, String skillName) {
        super(hero, skillName);
    }

    @Override
    public void learnSkill() {
        super.learnSkill();
        System.out.println("学习了R技能" + skillName);
    }
}
