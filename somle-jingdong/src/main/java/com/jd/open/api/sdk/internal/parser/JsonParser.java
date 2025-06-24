package com.jd.open.api.sdk.internal.parser;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jd.open.api.sdk.JdException;
import com.jd.open.api.sdk.internal.JSON.JSON;
import com.jd.open.api.sdk.internal.util.StringUtil;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.Iterator;
import java.util.Map;

public class JsonParser implements Parser {
   private final ObjectMapper mapper = new ObjectMapper();

   public JsonParser() {
      this.mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
      this.mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
      this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
   }

   public <T extends AbstractResponse> T parse(String json, Class<T> responseClass, String apiName) throws JdException {
      AbstractResponse response = null;

      try {
         if (StringUtil.isEmpty(json)) {
            throw new JdException("response json is empty!");
         } else {
            response = this.fromJson(json, responseClass, apiName);
            if (response != null) {
               response.setMsg(json);
            }

            return (T)response;
         }
      } catch (Exception e) {
         throw new JdException(e);
      }
   }

   public <T extends AbstractResponse> T fromJson(String json, Class<T> responseClass, String apiName) throws Exception {
      ObjectNode rootNode = null;

      try {
         rootNode = (ObjectNode)this.mapper.readTree(json);
      } catch (Exception var9) {
         rootNode = (ObjectNode)this.mapper.readTree(JSON.toString(JSON.parse(json)));
      }

      String innerJson = "";
      if (apiName.startsWith("jd.union.") && rootNode.get("error_response") == null) {
         ObjectNode node = new ObjectNode(JsonNodeFactory.instance);
         Iterator<Map.Entry<String, JsonNode>> iterator = ((JsonNode)((Map.Entry)rootNode.fields().next()).getValue()).fields();

         while(iterator.hasNext()) {
            Map.Entry<String, JsonNode> next = (Map.Entry)iterator.next();
            if (!((String)next.getKey()).equals("code") && !((String)next.getKey()).equals("request_id")) {
               node.put((String)next.getKey(), this.mapper.readTree(((JsonNode)next.getValue()).asText()));
            } else {
               node.put((String)next.getKey(), (JsonNode)next.getValue());
            }
         }

         innerJson = node.toString();
      } else {
         innerJson = ((JsonNode)((Map.Entry)rootNode.fields().next()).getValue()).toString();
      }

      return (T)(this.mapper.readValue(innerJson, responseClass));
   }
}
