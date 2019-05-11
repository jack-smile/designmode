package site.jackwang.designmode.filter;

import site.jackwang.designmode.People;

/**
 * 定义filter接口，具体的过滤规则需要实现这个接口
 *
 * @author jie.wang001@bkjk.com
 * @date 2019/5/11
 */
public interface Filter {
    /**
     * 实现具体的过滤
     *
     * @param people 过滤操作对象
     * @param filterChain 责任链条
     */
    void doFilter(People people, FilterChain filterChain);
}
