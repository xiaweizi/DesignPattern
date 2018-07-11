package com.xiaweizi.design.p07_filter;

import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p07_filter.OrCriteria
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        List<Person> second = otherCriteria.meetCriteria(persons);
        for (Person person : second) {
            if (!first.contains(person)) {
                first.add(person);
            }
        }
        return first;
    }
}
