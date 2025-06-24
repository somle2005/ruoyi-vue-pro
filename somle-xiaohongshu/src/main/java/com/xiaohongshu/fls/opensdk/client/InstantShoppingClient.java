package com.xiaohongshu.fls.opensdk.client;

import com.google.gson.Gson;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.instantshopping.request.UpdateInstantShoppingTrackRequest;
import com.xiaohongshu.fls.opensdk.entity.instantshopping.request.UpdateRiderLocationRequest;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class InstantShoppingClient extends BaseClient {
   public InstantShoppingClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse execute(UpdateInstantShoppingTrackRequest request, String accessToken) throws IOException {
      BaseResponse response = new BaseResponse();
      request.setMethod("express.instantshopping.updateInstantShoppingTrack");
      request.addParameter(this, accessToken);
      Gson gson = new Gson();
      String bodyString = gson.toJson((Object)request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse((Object)null);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse execute(UpdateRiderLocationRequest request, String accessToken) throws IOException {
      BaseResponse response = new BaseResponse();
      request.setMethod("express.instantshopping.updateRiderLocation");
      request.addParameter(this, accessToken);
      Gson gson = new Gson();
      String bodyString = gson.toJson((Object)request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         response.setSuccessResponse((Object)null);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
