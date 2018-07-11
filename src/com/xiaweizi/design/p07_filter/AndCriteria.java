package com.xiaweizi.design.p07_filter;

import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p07_filter.AndCriteria
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteria = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteria);
    }
}
