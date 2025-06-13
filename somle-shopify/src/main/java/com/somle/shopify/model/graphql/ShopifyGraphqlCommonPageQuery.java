package com.somle.shopify.model.graphql;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class ShopifyGraphqlCommonPageQuery {

    private int first;

    private String query;

    private String cursor;

    private ShopifyGraphqlCommonPageQuery() {

    }

    public static ShopifyGraphqlCommonPageQuery build(int first, String cursor, LocalDateTime createdAtMin, LocalDateTime createdAtMax) {
        ShopifyGraphqlCommonPageQuery shopifyGraphqlCommonPageQuery = new ShopifyGraphqlCommonPageQuery();
        //  官方限制最多250
        shopifyGraphqlCommonPageQuery.setFirst(Math.min(first, 250));
        if (StrUtil.isNotBlank(cursor)) {
            shopifyGraphqlCommonPageQuery.setCursor(cursor);
        }
        if (Objects.nonNull(createdAtMin) && Objects.nonNull(createdAtMax)) {
            String format = String.format("created_at:>=%s AND created_at:<=%s", createdAtMin.format(DatePattern.NORM_DATETIME_FORMATTER), createdAtMax.format(DatePattern.NORM_DATETIME_FORMATTER));
            shopifyGraphqlCommonPageQuery.setQuery(format);
        }
        return shopifyGraphqlCommonPageQuery;
    }

}
