package site.jackwang.designmode.filter;

import java.util.ArrayList;
import java.util.List;
import site.jackwang.designmode.People;
import site.jackwang.designmode.study.Study;

/**
 * 责任链条
 *
 * @author jie.wang001@bkjk.com
 * @date 2019/5/11
 */
public class FilterChain implements Filter {
    /**
     * 存储链上所有的过滤规则
     */
    private List<Filter> filters = new ArrayList<Filter>();

    /**
     * 当前执行filters中过滤规则的序号
     */
    private int index = 0;

    /**
     * 学习
     */
    private Study study;

    public FilterChain(Study study) {
        this.study = study;
    }

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;    }

    public void doFilter(People people, FilterChain filterChain) {
        if (index == filters.size()) {
            // 当链条上所有"责任"都做完后，开始执行真正的逻辑
            study.study();
            return;
        }

        filters.get(index++).doFilter(people, filterChain);
    }
}
