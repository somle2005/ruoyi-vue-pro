package cn.iocoder.yudao.framework.mybatis.core.enums;

import com.github.yulichang.wrapper.enums.BaseFuncEnum;

/**
* @Author Wqh
* @Date 10:53 2024/12/6
**/
public enum DefaultFuncEnumX implements BaseFuncEnum {
    GROUP_CONCAT("GROUP_CONCAT(%s)"),
  ;

    private final String sql;

    DefaultFuncEnumX(String sql) {
        this.sql = sql;
    }

    @Override
    public String getSql() {
        return this.sql;
    }
}
