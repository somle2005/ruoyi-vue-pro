package com.xiaohongshu.fls.opensdk.client;

import com.alibaba.fastjson.JSON;
import com.xiaohongshu.fls.opensdk.entity.BaseResponse;
import com.xiaohongshu.fls.opensdk.entity.finance.request.DownloadStatementRequest;
import com.xiaohongshu.fls.opensdk.entity.finance.request.PageQueryExpenseRequest;
import com.xiaohongshu.fls.opensdk.entity.finance.request.PageQueryTransactionRequest;
import com.xiaohongshu.fls.opensdk.entity.finance.request.QueryCpsSettleRequest;
import com.xiaohongshu.fls.opensdk.entity.finance.request.QuerySellerAccountRecordsRequest;
import com.xiaohongshu.fls.opensdk.entity.finance.response.DownloadStatementResponse;
import com.xiaohongshu.fls.opensdk.entity.finance.response.PageQueryExpenseResponse;
import com.xiaohongshu.fls.opensdk.entity.finance.response.PageQueryTransactionResponse;
import com.xiaohongshu.fls.opensdk.entity.finance.response.QueryCpsSettleResponse;
import com.xiaohongshu.fls.opensdk.entity.finance.response.QuerySellerAccountRecordsResponse;
import com.xiaohongshu.fls.opensdk.util.Utils;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.collections.MapUtils;

public class FinanceClient extends BaseClient {
   public FinanceClient(String url, String appId, String version, String appSecret) {
      super(url, appId, version, appSecret);
   }

   public BaseResponse<QueryCpsSettleResponse> execute(QueryCpsSettleRequest request, String accessToken) throws IOException {
      BaseResponse<QueryCpsSettleResponse> response = new BaseResponse<QueryCpsSettleResponse>();
      request.setMethod("bill.queryCpsSettle");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         QueryCpsSettleResponse queryCpsSettleResponse = (QueryCpsSettleResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), QueryCpsSettleResponse.class);
         response.setSuccessResponse(queryCpsSettleResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<DownloadStatementResponse> execute(DownloadStatementRequest request, String accessToken) throws IOException {
      BaseResponse<DownloadStatementResponse> response = new BaseResponse<DownloadStatementResponse>();
      request.setMethod("bill.downloadStatement");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         DownloadStatementResponse downloadStatementResponse = (DownloadStatementResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), DownloadStatementResponse.class);
         response.setSuccessResponse(downloadStatementResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<QuerySellerAccountRecordsResponse> execute(QuerySellerAccountRecordsRequest request, String accessToken) throws IOException {
      BaseResponse<QuerySellerAccountRecordsResponse> response = new BaseResponse<QuerySellerAccountRecordsResponse>();
      request.setMethod("finance.querySellerAccountRecords");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         QuerySellerAccountRecordsResponse querySellerAccountRecordsResponse = (QuerySellerAccountRecordsResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), QuerySellerAccountRecordsResponse.class);
         response.setSuccessResponse(querySellerAccountRecordsResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<PageQueryTransactionResponse> execute(PageQueryTransactionRequest request, String accessToken) throws IOException {
      BaseResponse<PageQueryTransactionResponse> response = new BaseResponse<PageQueryTransactionResponse>();
      request.setMethod("finance.pageQueryTransaction");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         PageQueryTransactionResponse pageQueryTransactionResponse = (PageQueryTransactionResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), PageQueryTransactionResponse.class);
         response.setSuccessResponse(pageQueryTransactionResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }

   public BaseResponse<PageQueryExpenseResponse> execute(PageQueryExpenseRequest request, String accessToken) throws IOException {
      BaseResponse<PageQueryExpenseResponse> response = new BaseResponse<PageQueryExpenseResponse>();
      request.setMethod("finance.pageQueryExpense");
      request.addParameter(this, accessToken);
      String bodyString = JSON.toJSONString(request);
      RequestBody body = RequestBody.create(JSONTYPE, bodyString);
      Request httpRequest = (new Request.Builder()).url(this.url).post(body).build();
      Response openapiResponse = Utils.okHttpClient.newCall(httpRequest).execute();
      String responseBody = openapiResponse.body().string();
      Map bodyMap = (Map)Utils.objectFromJSONStr(responseBody, Map.class);
      if (MapUtils.getBoolean(bodyMap, "success")) {
         PageQueryExpenseResponse pageQueryExpenseResponse = (PageQueryExpenseResponse)JSON.parseObject(JSON.toJSONString(bodyMap.get("data")), PageQueryExpenseResponse.class);
         response.setSuccessResponse(pageQueryExpenseResponse);
      } else {
         response.setFailResponse(Objects.toString(bodyMap.getOrDefault("error_msg", bodyMap.get("msg")), ""), Objects.toString(bodyMap.getOrDefault("error_code", bodyMap.get("code")), ""));
      }

      return response;
   }
}
