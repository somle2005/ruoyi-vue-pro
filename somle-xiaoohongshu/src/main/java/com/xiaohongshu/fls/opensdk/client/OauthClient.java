package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.oauth.request.GetAccessTokenRequest;
import com.xiaohongshu.fls.opensdk.entity.oauth.request.RefreshTokenRequest;
import com.xiaohongshu.fls.opensdk.entity.oauth.response.GetAccessTokenResponse;
import com.xiaohongshu.fls.opensdk.entity.oauth.response.RefreshTokenResponse;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class OauthClient extends BaseClient {
   public OauthClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<GetAccessTokenResponse> execute(GetAccessTokenRequest request) throws IOException {
      BaseResponse<GetAccessTokenResponse> response = new BaseResponse<GetAccessTokenResponse>();
      request.setMethod("oauth.getAccessToken");
      request.addParameter(this, (String)null);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         GetAccessTokenResponse refreshTokenResponse = (GetAccessTokenResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), GetAccessTokenResponse.class);
         response.setSuccessResponse(refreshTokenResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<RefreshTokenResponse> execute(RefreshTokenRequest request) throws IOException {
      BaseResponse<RefreshTokenResponse> response = new BaseResponse<RefreshTokenResponse>();
      request.setMethod("oauth.refreshToken");
      request.addParameter(this, (String)null);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), RefreshTokenResponse.class);
         response.setSuccessResponse(refreshTokenResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
