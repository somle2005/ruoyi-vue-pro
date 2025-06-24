package com.jd.open.api.sdk.request.yjs;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.yjs.MedicineDsOrderUserPickUpGoodsResponse;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MedicineDsOrderUserPickUpGoodsRequest extends AbstractRequest implements JdRequest<MedicineDsOrderUserPickUpGoodsResponse> {
   private String pickUpCode;
   private String orderId;
   private String operateMan;
   private Long storeId;

   public void setPickUpCode(String pickUpCode) {
      this.pickUpCode = pickUpCode;
   }

   public String getPickUpCode() {
      return this.pickUpCode;
   }

   public void setOrderId(String orderId) {
      this.orderId = orderId;
   }

   public String getOrderId() {
      return this.orderId;
   }

   public void setOperateMan(String operateMan) {
      this.operateMan = operateMan;
   }

   public String getOperateMan() {
      return this.operateMan;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public String getApiMethod() {
      return "jingdong.medicine.ds.order.userPickUpGoods";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("pickUpCode", this.pickUpCode);
      pmap.put("orderId", this.orderId);
      pmap.put("operateMan", this.operateMan);
      pmap.put("storeId", this.storeId);
      return JsonUtil.toJson(pmap);
   }

   public Class<MedicineDsOrderUserPickUpGoodsResponse> getResponseClass() {
      return MedicineDsOrderUserPickUpGoodsResponse.class;
   }
}
