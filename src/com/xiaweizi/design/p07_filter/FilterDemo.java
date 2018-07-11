package com.xiaweizi.design.p07_filter;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p07_filter.FilterDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

class FilterDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("\nmales:");
        System.out.println(male.meetCriteria(persons));

        System.out.println("\nfemales:");
        System.out.println(female.meetCriteria(persons));

        System.out.println("\nsingle:");
        System.out.println(single.meetCriteria(persons));

        System.out.println("\n Single or Males:");
        System.out.println(singleMale.meetCriteria(persons));

        System.out.println("\nSingle or Females:");
        System.out.println(singleOrFemale.meetCriteria(persons));
    }
}
