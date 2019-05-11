package site.jackwang.designmode;

import site.jackwang.designmode.filter.FilterChain;
import site.jackwang.designmode.filter.impl.EatFilter;
import site.jackwang.designmode.filter.impl.WashFilter;
import site.jackwang.designmode.study.Study;

/**
 * @author jie.wang001@bkjk.com
 * @date 2019/5/11
 */
public class Main {
    public static void main(String[] args) {
        WashFilter washFilter = new WashFilter();
        EatFilter eatFilter = new EatFilter();

        People people = new People();
        Study study = new Study();

        FilterChain filterChain = new FilterChain(study);
        filterChain.addFilter(washFilter).addFilter(eatFilter);

        filterChain.doFilter(people, filterChain);
    }
}
