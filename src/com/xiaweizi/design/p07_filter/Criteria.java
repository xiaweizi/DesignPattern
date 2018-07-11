package com.xiaweizi.design.p07_filter;

import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.design.p07_filter.Criteria
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/07/11
 *     desc   :
 * </pre>
 */

interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
