package com.somle.ai.model;

import java.util.List;
import java.util.stream.Stream;


import com.fasterxml.jackson.databind.node.ObjectNode;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.common.util.json.JsonUtils;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AiResponse {
    private String previous;
    private String next;
    private Integer count;
    private List<ObjectNode> results;

    public <T> Stream<T> getResults(Class<T> objectClass) {
        return results.stream().map(n-> JsonUtils.parseObject(n, objectClass));
    }
}
