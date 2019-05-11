package site.jackwang.designmode.filter.impl;

import site.jackwang.designmode.People;
import site.jackwang.designmode.filter.Filter;
import site.jackwang.designmode.filter.FilterChain;

/**
 * @author jie.wang001@bkjk.com
 * @date 2019/5/11
 */
public class EatFilter implements Filter {
    public void doFilter(People people, FilterChain filterChain) {
        // eat相关的过滤处理
        System.out.println("eat filter");
        people.eat();

        filterChain.doFilter(people, filterChain);
    }
}
