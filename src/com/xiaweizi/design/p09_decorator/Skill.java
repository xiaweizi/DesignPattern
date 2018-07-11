package com.xiaweizi.design.p09_decorator;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p09_decorator.Skill
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class Skill implements Hero {

    private Hero hero;
    String skillName;

    public Skill(Hero hero, String skillName) {
        this.hero = hero;
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        hero.learnSkill();
    }
}
