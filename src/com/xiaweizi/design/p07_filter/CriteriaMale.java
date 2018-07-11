package com.xiaweizi.design.p07_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p07_filter.CriteriaMale
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePerson = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePerson.add(person);
            }
        }
        return malePerson;
    }

}
