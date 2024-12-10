package cn.iocoder.yudao.framework.mybatis.core.enums;

import com.baomidou.mybatisplus.core.conditions.ISqlSegment;

/**
* @Author Wqh
* @Date 10:53 2024/12/6
**/
public enum SqlKeywordX implements ISqlSegment {
    FIND_IN_SET("FIND_IN_SET({0}, %s)"),
  ;

    private final String keyword;

    @Override
    public String getSqlSegment() {
        return this.keyword;
    }

    SqlKeywordX(final String keyword) {
        this.keyword = keyword;
    }
}
