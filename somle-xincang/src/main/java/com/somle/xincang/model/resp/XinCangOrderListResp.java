package com.somle.xincang.model.resp;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class XinCangOrderListResp {

    private Rst rst;
    private Integer errno;
    private String err;

    @Data
    @NoArgsConstructor
    public static class Rst {
        private String code;
        private String msg;
        private List<Order> data;
        private String count; // 保持字符串类型（原JSON为"16780"）
    }

    @Data
    @NoArgsConstructor
    public static class Order {
        // 订单基本信息
        private String stateName;
        private String id;
        private String orderNo;
        private String optNo;
        private String gzh;
        
        // 物流信息
        private String faceFileName;
        private String faceZip;
        private String faceCsv;
        private String ckh;
        private String sourceCkh;
        private String relatedNo;
        private String relatedCkh;
        private String autoWarehouse;
        
        // 商品信息
        private String productName;
        private String orderFrom;
        private String orderType;
        private String productSku;
        private String sourceSku;
        private String sfp;
        
        // 尺寸重量
        private String dimLength;
        private String dimWidth;
        private String dimHeight;
        private String dimDivisor;
        private String weightLbs;
        private String volumeWeightLbs;
        private String billingWeightLbs;
        private String repairBillingWeightLbs;
        private String skuCount;
        
        // 仓库信息
        private String warehouseId;
        private String warehouseCode;
        private String country;
        private String province;
        private String city;
        private String address;
        private String address2;
        private String address3;
        private String postcode;
        
        // 收件人信息
        private String receiveUser;
        private String phone;
        private String email;
        private String platform;
        private String shippingService;
        private String isSign;
        private String zone;
        private String repairZoneCode;
        
        // 客户信息
        private String customerId;
        private String customerNo;
        private String isOutStock;
        private String outStockUser;
        private String outStockUsername;
        private String outStockTime;
        private String outStockResendUser;
        private String outStockResendTime;
        private String ahsWeight;
        private String ahsDimensions;
        private String oversize;
        
        // 金额信息
        private String totalAmount;
        private String srcAmount;
        private String repairAmount;
        
        // 时间信息（使用String类型处理多种格式）
        private String approveTime;
        private String approveTimeUs;
        private String pickingTime;
        private String pickingTimeUs;
        private String pickedTime;
        private String pickedTimeUs;
        private String pickedUser;
        private String scanTime;
        private String scanTimeUs;
        private String scanUser;
        private String deliveredTime;
        
        // 系统信息
        private String extFeeTypes;
        private String dateFrom;
        private String dateTo;
        private String ryfjfConfig;
        private String apiError;
        private String setPickError;
        private String remark;
        private String outStockConfirm;
        private String scanCount;
        private String shopName;
        private String isInWarehouse;
        private String clientIp;
        private String approveIp;
        private String pinyinCode;
        private String pinyinFirstCode;
        private String addUser;
        private String addUsername;
        private String deleteUser;
        private String gmtCreate;
        private String gmtModify;
        private String gmtDelete;
        private String gmtCancel;
        
        // 状态标识
        private String state;
        private String deleted;
        private String jobId;
        private String isSure;
        private String isSync;
        private String isExt;
        private String extFrom;
        private String extCkh;
        private String pickUsername;
    }
}