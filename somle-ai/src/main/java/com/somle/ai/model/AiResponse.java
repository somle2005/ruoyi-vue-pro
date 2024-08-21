package com.somle.ai.model;

import java.util.List;
import java.util.stream.Stream;


import cn.iocoder.yudao.framework.common.util.json.JsonUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AiResponse {
    private String previous;
    private String next;
    private Integer count;
    private List<String> results;

    public <T> Stream<T> getResults(Class<T> objectClass) {
        return results.stream().map(n-> JsonUtils.parseObject(n, objectClass));
    }
}
