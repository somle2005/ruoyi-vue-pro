package com.jd.open.api.sdk.domain.ECLP.EclpOpenService.response.queryB2BSWbMain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class LwbMain implements Serializable {
   private Long id;
   private String lwbNo;
   private String wbNo;
   private String orderNo;
   private String sendPay;
   private String deptName;
   private String deptNo;
   private Long deptId;
   private Long sellerId;
   private String sellerNo;
   private String sellerName;
   private Integer status;
   private String statusDesc;
   private Byte cancelStatus;
   private String senderName;
   private String senderMobile;
   private String senderPhone;
   private String senderProvince;
   private String senderCity;
   private String senderCounty;
   private String senderTown;
   private String senderProvinceName;
   private String senderCityName;
   private String senderCountyName;
   private String senderTownName;
   private String senderAddress;
   private String receiverName;
   private String receiverMobile;
   private String receiverPhone;
   private String receiverProvince;
   private String receiverCity;
   private String receiverCounty;
   private String receiverTown;
   private String receiverProvinceName;
   private String receiverCityName;
   private String receiverCountyName;
   private String receiverTownName;
   private String receiverAddress;
   private String wholeReceiverAddress;
   private String remark;
   private int packageQty;
   private Date predictArrivalDate;
   private Byte reliability;
   private BigDecimal grossWeight;
   private BigDecimal grossVolume;
   private Byte isFragile;
   private Byte source;
   private Date createTime;
   private Date updateTime;
   private String createUser;
   private String updateUser;
   private Byte yn;
   private List<LwbItem> lwbItemList;
   private String lwbItemsStr;
   private LwbStatus lwbStatus;
   private String senderZip;
   private String transitCenterNo;
   private String distributeNo;
   private String logisticsServiceStoreId;
   private Long spId;
   private Double receivable;
   private String pinAccount;
   private String isCod;
   private Date pickUpDate;
   private Byte sourceType;
   private List<LwbGoodsItem> lwbGoodsItemList;
   private Integer flowId;
   private Byte operateType;
   private String orderDownloadTime;
   private String vehicleTypeName;
   private String vehicleTypeNo;
   private Integer vehicleQty;
   private String expressItemName;
   private int expressItemQty;
   private BigDecimal guaranteeValue;
   private Date pickupBeginTime;
   private Date pickupEndTime;
   private Byte bussinessType;
   private BigDecimal jdGrossWeight;
   private Byte deliveryType;
   private String senderNickName;
   private String receiverNickName;
   private SSendpay sSendpay;
   private BigDecimal jdGrossVolume;
   private Long siteId;
   private String siteName;
   private Integer siteType;
   private String road;
   private String senderCompany;
   private String receiverCompany;
   private String bdOwnerNo;
   private Byte wbType;
   private String isprintFlag;
   private Integer waybillSign;
   private Integer createType;
   private String reserve1;
   private String backName;
   private String backMobile;
   private String backPhone;
   private String backProvinceCode;
   private String backCityCode;
   private String backCountyCode;
   private String backTownCode;
   private String backProvinceName;
   private String backCityName;
   private String backCountyName;
   private String backTownName;
   private String backAddress;
   private String wholeBackAddress;
   private String pickupReturnReason;
   private String saleContactPhone;
   private String productId;
   private String associateSoNo;
   private Byte isGuarantee;
   private String statusSmallDesc;
   private LwbStatusObjFLas lwbStatusObjFLas;
   private Byte isprintBoxFlag;
   private Integer jdExpressItemQty;
   private String sellerWarehouseCode;
   private String projectName;
   private String actualSpId;
   private Date predictReceiptDate;
   private Date upShelveTime;
   private Date downShelveTime;
   private AddressExtentInfo addressExtentInfo;

   @JsonProperty("id")
   public void setId(Long id) {
      this.id = id;
   }

   @JsonProperty("id")
   public Long getId() {
      return this.id;
   }

   @JsonProperty("lwbNo")
   public void setLwbNo(String lwbNo) {
      this.lwbNo = lwbNo;
   }

   @JsonProperty("lwbNo")
   public String getLwbNo() {
      return this.lwbNo;
   }

   @JsonProperty("wbNo")
   public void setWbNo(String wbNo) {
      this.wbNo = wbNo;
   }

   @JsonProperty("wbNo")
   public String getWbNo() {
      return this.wbNo;
   }

   @JsonProperty("orderNo")
   public void setOrderNo(String orderNo) {
      this.orderNo = orderNo;
   }

   @JsonProperty("orderNo")
   public String getOrderNo() {
      return this.orderNo;
   }

   @JsonProperty("sendPay")
   public void setSendPay(String sendPay) {
      this.sendPay = sendPay;
   }

   @JsonProperty("sendPay")
   public String getSendPay() {
      return this.sendPay;
   }

   @JsonProperty("deptName")
   public void setDeptName(String deptName) {
      this.deptName = deptName;
   }

   @JsonProperty("deptName")
   public String getDeptName() {
      return this.deptName;
   }

   @JsonProperty("deptNo")
   public void setDeptNo(String deptNo) {
      this.deptNo = deptNo;
   }

   @JsonProperty("deptNo")
   public String getDeptNo() {
      return this.deptNo;
   }

   @JsonProperty("deptId")
   public void setDeptId(Long deptId) {
      this.deptId = deptId;
   }

   @JsonProperty("deptId")
   public Long getDeptId() {
      return this.deptId;
   }

   @JsonProperty("sellerId")
   public void setSellerId(Long sellerId) {
      this.sellerId = sellerId;
   }

   @JsonProperty("sellerId")
   public Long getSellerId() {
      return this.sellerId;
   }

   @JsonProperty("sellerNo")
   public void setSellerNo(String sellerNo) {
      this.sellerNo = sellerNo;
   }

   @JsonProperty("sellerNo")
   public String getSellerNo() {
      return this.sellerNo;
   }

   @JsonProperty("sellerName")
   public void setSellerName(String sellerName) {
      this.sellerName = sellerName;
   }

   @JsonProperty("sellerName")
   public String getSellerName() {
      return this.sellerName;
   }

   @JsonProperty("status")
   public void setStatus(Integer status) {
      this.status = status;
   }

   @JsonProperty("status")
   public Integer getStatus() {
      return this.status;
   }

   @JsonProperty("statusDesc")
   public void setStatusDesc(String statusDesc) {
      this.statusDesc = statusDesc;
   }

   @JsonProperty("statusDesc")
   public String getStatusDesc() {
      return this.statusDesc;
   }

   @JsonProperty("cancelStatus")
   public void setCancelStatus(Byte cancelStatus) {
      this.cancelStatus = cancelStatus;
   }

   @JsonProperty("cancelStatus")
   public Byte getCancelStatus() {
      return this.cancelStatus;
   }

   @JsonProperty("senderName")
   public void setSenderName(String senderName) {
      this.senderName = senderName;
   }

   @JsonProperty("senderName")
   public String getSenderName() {
      return this.senderName;
   }

   @JsonProperty("senderMobile")
   public void setSenderMobile(String senderMobile) {
      this.senderMobile = senderMobile;
   }

   @JsonProperty("senderMobile")
   public String getSenderMobile() {
      return this.senderMobile;
   }

   @JsonProperty("senderPhone")
   public void setSenderPhone(String senderPhone) {
      this.senderPhone = senderPhone;
   }

   @JsonProperty("senderPhone")
   public String getSenderPhone() {
      return this.senderPhone;
   }

   @JsonProperty("senderProvince")
   public void setSenderProvince(String senderProvince) {
      this.senderProvince = senderProvince;
   }

   @JsonProperty("senderProvince")
   public String getSenderProvince() {
      return this.senderProvince;
   }

   @JsonProperty("senderCity")
   public void setSenderCity(String senderCity) {
      this.senderCity = senderCity;
   }

   @JsonProperty("senderCity")
   public String getSenderCity() {
      return this.senderCity;
   }

   @JsonProperty("senderCounty")
   public void setSenderCounty(String senderCounty) {
      this.senderCounty = senderCounty;
   }

   @JsonProperty("senderCounty")
   public String getSenderCounty() {
      return this.senderCounty;
   }

   @JsonProperty("senderTown")
   public void setSenderTown(String senderTown) {
      this.senderTown = senderTown;
   }

   @JsonProperty("senderTown")
   public String getSenderTown() {
      return this.senderTown;
   }

   @JsonProperty("senderProvinceName")
   public void setSenderProvinceName(String senderProvinceName) {
      this.senderProvinceName = senderProvinceName;
   }

   @JsonProperty("senderProvinceName")
   public String getSenderProvinceName() {
      return this.senderProvinceName;
   }

   @JsonProperty("senderCityName")
   public void setSenderCityName(String senderCityName) {
      this.senderCityName = senderCityName;
   }

   @JsonProperty("senderCityName")
   public String getSenderCityName() {
      return this.senderCityName;
   }

   @JsonProperty("senderCountyName")
   public void setSenderCountyName(String senderCountyName) {
      this.senderCountyName = senderCountyName;
   }

   @JsonProperty("senderCountyName")
   public String getSenderCountyName() {
      return this.senderCountyName;
   }

   @JsonProperty("senderTownName")
   public void setSenderTownName(String senderTownName) {
      this.senderTownName = senderTownName;
   }

   @JsonProperty("senderTownName")
   public String getSenderTownName() {
      return this.senderTownName;
   }

   @JsonProperty("senderAddress")
   public void setSenderAddress(String senderAddress) {
      this.senderAddress = senderAddress;
   }

   @JsonProperty("senderAddress")
   public String getSenderAddress() {
      return this.senderAddress;
   }

   @JsonProperty("receiverName")
   public void setReceiverName(String receiverName) {
      this.receiverName = receiverName;
   }

   @JsonProperty("receiverName")
   public String getReceiverName() {
      return this.receiverName;
   }

   @JsonProperty("receiverMobile")
   public void setReceiverMobile(String receiverMobile) {
      this.receiverMobile = receiverMobile;
   }

   @JsonProperty("receiverMobile")
   public String getReceiverMobile() {
      return this.receiverMobile;
   }

   @JsonProperty("receiverPhone")
   public void setReceiverPhone(String receiverPhone) {
      this.receiverPhone = receiverPhone;
   }

   @JsonProperty("receiverPhone")
   public String getReceiverPhone() {
      return this.receiverPhone;
   }

   @JsonProperty("receiverProvince")
   public void setReceiverProvince(String receiverProvince) {
      this.receiverProvince = receiverProvince;
   }

   @JsonProperty("receiverProvince")
   public String getReceiverProvince() {
      return this.receiverProvince;
   }

   @JsonProperty("receiverCity")
   public void setReceiverCity(String receiverCity) {
      this.receiverCity = receiverCity;
   }

   @JsonProperty("receiverCity")
   public String getReceiverCity() {
      return this.receiverCity;
   }

   @JsonProperty("receiverCounty")
   public void setReceiverCounty(String receiverCounty) {
      this.receiverCounty = receiverCounty;
   }

   @JsonProperty("receiverCounty")
   public String getReceiverCounty() {
      return this.receiverCounty;
   }

   @JsonProperty("receiverTown")
   public void setReceiverTown(String receiverTown) {
      this.receiverTown = receiverTown;
   }

   @JsonProperty("receiverTown")
   public String getReceiverTown() {
      return this.receiverTown;
   }

   @JsonProperty("receiverProvinceName")
   public void setReceiverProvinceName(String receiverProvinceName) {
      this.receiverProvinceName = receiverProvinceName;
   }

   @JsonProperty("receiverProvinceName")
   public String getReceiverProvinceName() {
      return this.receiverProvinceName;
   }

   @JsonProperty("receiverCityName")
   public void setReceiverCityName(String receiverCityName) {
      this.receiverCityName = receiverCityName;
   }

   @JsonProperty("receiverCityName")
   public String getReceiverCityName() {
      return this.receiverCityName;
   }

   @JsonProperty("receiverCountyName")
   public void setReceiverCountyName(String receiverCountyName) {
      this.receiverCountyName = receiverCountyName;
   }

   @JsonProperty("receiverCountyName")
   public String getReceiverCountyName() {
      return this.receiverCountyName;
   }

   @JsonProperty("receiverTownName")
   public void setReceiverTownName(String receiverTownName) {
      this.receiverTownName = receiverTownName;
   }

   @JsonProperty("receiverTownName")
   public String getReceiverTownName() {
      return this.receiverTownName;
   }

   @JsonProperty("receiverAddress")
   public void setReceiverAddress(String receiverAddress) {
      this.receiverAddress = receiverAddress;
   }

   @JsonProperty("receiverAddress")
   public String getReceiverAddress() {
      return this.receiverAddress;
   }

   @JsonProperty("wholeReceiverAddress")
   public void setWholeReceiverAddress(String wholeReceiverAddress) {
      this.wholeReceiverAddress = wholeReceiverAddress;
   }

   @JsonProperty("wholeReceiverAddress")
   public String getWholeReceiverAddress() {
      return this.wholeReceiverAddress;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("packageQty")
   public void setPackageQty(int packageQty) {
      this.packageQty = packageQty;
   }

   @JsonProperty("packageQty")
   public int getPackageQty() {
      return this.packageQty;
   }

   @JsonProperty("predictArrivalDate")
   public void setPredictArrivalDate(Date predictArrivalDate) {
      this.predictArrivalDate = predictArrivalDate;
   }

   @JsonProperty("predictArrivalDate")
   public Date getPredictArrivalDate() {
      return this.predictArrivalDate;
   }

   @JsonProperty("reliability")
   public void setReliability(Byte reliability) {
      this.reliability = reliability;
   }

   @JsonProperty("reliability")
   public Byte getReliability() {
      return this.reliability;
   }

   @JsonProperty("grossWeight")
   public void setGrossWeight(BigDecimal grossWeight) {
      this.grossWeight = grossWeight;
   }

   @JsonProperty("grossWeight")
   public BigDecimal getGrossWeight() {
      return this.grossWeight;
   }

   @JsonProperty("grossVolume")
   public void setGrossVolume(BigDecimal grossVolume) {
      this.grossVolume = grossVolume;
   }

   @JsonProperty("grossVolume")
   public BigDecimal getGrossVolume() {
      return this.grossVolume;
   }

   @JsonProperty("isFragile")
   public void setIsFragile(Byte isFragile) {
      this.isFragile = isFragile;
   }

   @JsonProperty("isFragile")
   public Byte getIsFragile() {
      return this.isFragile;
   }

   @JsonProperty("source")
   public void setSource(Byte source) {
      this.source = source;
   }

   @JsonProperty("source")
   public Byte getSource() {
      return this.source;
   }

   @JsonProperty("createTime")
   public void setCreateTime(Date createTime) {
      this.createTime = createTime;
   }

   @JsonProperty("createTime")
   public Date getCreateTime() {
      return this.createTime;
   }

   @JsonProperty("updateTime")
   public void setUpdateTime(Date updateTime) {
      this.updateTime = updateTime;
   }

   @JsonProperty("updateTime")
   public Date getUpdateTime() {
      return this.updateTime;
   }

   @JsonProperty("createUser")
   public void setCreateUser(String createUser) {
      this.createUser = createUser;
   }

   @JsonProperty("createUser")
   public String getCreateUser() {
      return this.createUser;
   }

   @JsonProperty("updateUser")
   public void setUpdateUser(String updateUser) {
      this.updateUser = updateUser;
   }

   @JsonProperty("updateUser")
   public String getUpdateUser() {
      return this.updateUser;
   }

   @JsonProperty("yn")
   public void setYn(Byte yn) {
      this.yn = yn;
   }

   @JsonProperty("yn")
   public Byte getYn() {
      return this.yn;
   }

   @JsonProperty("lwbItem_list")
   public void setLwbItemList(List<LwbItem> lwbItemList) {
      this.lwbItemList = lwbItemList;
   }

   @JsonProperty("lwbItem_list")
   public List<LwbItem> getLwbItemList() {
      return this.lwbItemList;
   }

   @JsonProperty("lwbItemsStr")
   public void setLwbItemsStr(String lwbItemsStr) {
      this.lwbItemsStr = lwbItemsStr;
   }

   @JsonProperty("lwbItemsStr")
   public String getLwbItemsStr() {
      return this.lwbItemsStr;
   }

   @JsonProperty("lwbStatus")
   public void setLwbStatus(LwbStatus lwbStatus) {
      this.lwbStatus = lwbStatus;
   }

   @JsonProperty("lwbStatus")
   public LwbStatus getLwbStatus() {
      return this.lwbStatus;
   }

   @JsonProperty("senderZip")
   public void setSenderZip(String senderZip) {
      this.senderZip = senderZip;
   }

   @JsonProperty("senderZip")
   public String getSenderZip() {
      return this.senderZip;
   }

   @JsonProperty("transitCenterNo")
   public void setTransitCenterNo(String transitCenterNo) {
      this.transitCenterNo = transitCenterNo;
   }

   @JsonProperty("transitCenterNo")
   public String getTransitCenterNo() {
      return this.transitCenterNo;
   }

   @JsonProperty("distributeNo")
   public void setDistributeNo(String distributeNo) {
      this.distributeNo = distributeNo;
   }

   @JsonProperty("distributeNo")
   public String getDistributeNo() {
      return this.distributeNo;
   }

   @JsonProperty("logisticsServiceStoreId")
   public void setLogisticsServiceStoreId(String logisticsServiceStoreId) {
      this.logisticsServiceStoreId = logisticsServiceStoreId;
   }

   @JsonProperty("logisticsServiceStoreId")
   public String getLogisticsServiceStoreId() {
      return this.logisticsServiceStoreId;
   }

   @JsonProperty("spId")
   public void setSpId(Long spId) {
      this.spId = spId;
   }

   @JsonProperty("spId")
   public Long getSpId() {
      return this.spId;
   }

   @JsonProperty("receivable")
   public void setReceivable(Double receivable) {
      this.receivable = receivable;
   }

   @JsonProperty("receivable")
   public Double getReceivable() {
      return this.receivable;
   }

   @JsonProperty("pinAccount")
   public void setPinAccount(String pinAccount) {
      this.pinAccount = pinAccount;
   }

   @JsonProperty("pinAccount")
   public String getPinAccount() {
      return this.pinAccount;
   }

   @JsonProperty("isCod")
   public void setIsCod(String isCod) {
      this.isCod = isCod;
   }

   @JsonProperty("isCod")
   public String getIsCod() {
      return this.isCod;
   }

   @JsonProperty("pickUpDate")
   public void setPickUpDate(Date pickUpDate) {
      this.pickUpDate = pickUpDate;
   }

   @JsonProperty("pickUpDate")
   public Date getPickUpDate() {
      return this.pickUpDate;
   }

   @JsonProperty("sourceType")
   public void setSourceType(Byte sourceType) {
      this.sourceType = sourceType;
   }

   @JsonProperty("sourceType")
   public Byte getSourceType() {
      return this.sourceType;
   }

   @JsonProperty("lwbGoodsItem_list")
   public void setLwbGoodsItemList(List<LwbGoodsItem> lwbGoodsItemList) {
      this.lwbGoodsItemList = lwbGoodsItemList;
   }

   @JsonProperty("lwbGoodsItem_list")
   public List<LwbGoodsItem> getLwbGoodsItemList() {
      return this.lwbGoodsItemList;
   }

   @JsonProperty("flowId")
   public void setFlowId(Integer flowId) {
      this.flowId = flowId;
   }

   @JsonProperty("flowId")
   public Integer getFlowId() {
      return this.flowId;
   }

   @JsonProperty("operateType")
   public void setOperateType(Byte operateType) {
      this.operateType = operateType;
   }

   @JsonProperty("operateType")
   public Byte getOperateType() {
      return this.operateType;
   }

   @JsonProperty("orderDownloadTime")
   public void setOrderDownloadTime(String orderDownloadTime) {
      this.orderDownloadTime = orderDownloadTime;
   }

   @JsonProperty("orderDownloadTime")
   public String getOrderDownloadTime() {
      return this.orderDownloadTime;
   }

   @JsonProperty("vehicleTypeName")
   public void setVehicleTypeName(String vehicleTypeName) {
      this.vehicleTypeName = vehicleTypeName;
   }

   @JsonProperty("vehicleTypeName")
   public String getVehicleTypeName() {
      return this.vehicleTypeName;
   }

   @JsonProperty("vehicleTypeNo")
   public void setVehicleTypeNo(String vehicleTypeNo) {
      this.vehicleTypeNo = vehicleTypeNo;
   }

   @JsonProperty("vehicleTypeNo")
   public String getVehicleTypeNo() {
      return this.vehicleTypeNo;
   }

   @JsonProperty("vehicleQty")
   public void setVehicleQty(Integer vehicleQty) {
      this.vehicleQty = vehicleQty;
   }

   @JsonProperty("vehicleQty")
   public Integer getVehicleQty() {
      return this.vehicleQty;
   }

   @JsonProperty("expressItemName")
   public void setExpressItemName(String expressItemName) {
      this.expressItemName = expressItemName;
   }

   @JsonProperty("expressItemName")
   public String getExpressItemName() {
      return this.expressItemName;
   }

   @JsonProperty("expressItemQty")
   public void setExpressItemQty(int expressItemQty) {
      this.expressItemQty = expressItemQty;
   }

   @JsonProperty("expressItemQty")
   public int getExpressItemQty() {
      return this.expressItemQty;
   }

   @JsonProperty("guaranteeValue")
   public void setGuaranteeValue(BigDecimal guaranteeValue) {
      this.guaranteeValue = guaranteeValue;
   }

   @JsonProperty("guaranteeValue")
   public BigDecimal getGuaranteeValue() {
      return this.guaranteeValue;
   }

   @JsonProperty("pickupBeginTime")
   public void setPickupBeginTime(Date pickupBeginTime) {
      this.pickupBeginTime = pickupBeginTime;
   }

   @JsonProperty("pickupBeginTime")
   public Date getPickupBeginTime() {
      return this.pickupBeginTime;
   }

   @JsonProperty("pickupEndTime")
   public void setPickupEndTime(Date pickupEndTime) {
      this.pickupEndTime = pickupEndTime;
   }

   @JsonProperty("pickupEndTime")
   public Date getPickupEndTime() {
      return this.pickupEndTime;
   }

   @JsonProperty("bussinessType")
   public void setBussinessType(Byte bussinessType) {
      this.bussinessType = bussinessType;
   }

   @JsonProperty("bussinessType")
   public Byte getBussinessType() {
      return this.bussinessType;
   }

   @JsonProperty("jdGrossWeight")
   public void setJdGrossWeight(BigDecimal jdGrossWeight) {
      this.jdGrossWeight = jdGrossWeight;
   }

   @JsonProperty("jdGrossWeight")
   public BigDecimal getJdGrossWeight() {
      return this.jdGrossWeight;
   }

   @JsonProperty("deliveryType")
   public void setDeliveryType(Byte deliveryType) {
      this.deliveryType = deliveryType;
   }

   @JsonProperty("deliveryType")
   public Byte getDeliveryType() {
      return this.deliveryType;
   }

   @JsonProperty("senderNickName")
   public void setSenderNickName(String senderNickName) {
      this.senderNickName = senderNickName;
   }

   @JsonProperty("senderNickName")
   public String getSenderNickName() {
      return this.senderNickName;
   }

   @JsonProperty("receiverNickName")
   public void setReceiverNickName(String receiverNickName) {
      this.receiverNickName = receiverNickName;
   }

   @JsonProperty("receiverNickName")
   public String getReceiverNickName() {
      return this.receiverNickName;
   }

   @JsonProperty("sSendpay")
   public void setSSendpay(SSendpay sSendpay) {
      this.sSendpay = sSendpay;
   }

   @JsonProperty("sSendpay")
   public SSendpay getSSendpay() {
      return this.sSendpay;
   }

   @JsonProperty("jdGrossVolume")
   public void setJdGrossVolume(BigDecimal jdGrossVolume) {
      this.jdGrossVolume = jdGrossVolume;
   }

   @JsonProperty("jdGrossVolume")
   public BigDecimal getJdGrossVolume() {
      return this.jdGrossVolume;
   }

   @JsonProperty("siteId")
   public void setSiteId(Long siteId) {
      this.siteId = siteId;
   }

   @JsonProperty("siteId")
   public Long getSiteId() {
      return this.siteId;
   }

   @JsonProperty("siteName")
   public void setSiteName(String siteName) {
      this.siteName = siteName;
   }

   @JsonProperty("siteName")
   public String getSiteName() {
      return this.siteName;
   }

   @JsonProperty("siteType")
   public void setSiteType(Integer siteType) {
      this.siteType = siteType;
   }

   @JsonProperty("siteType")
   public Integer getSiteType() {
      return this.siteType;
   }

   @JsonProperty("road")
   public void setRoad(String road) {
      this.road = road;
   }

   @JsonProperty("road")
   public String getRoad() {
      return this.road;
   }

   @JsonProperty("senderCompany")
   public void setSenderCompany(String senderCompany) {
      this.senderCompany = senderCompany;
   }

   @JsonProperty("senderCompany")
   public String getSenderCompany() {
      return this.senderCompany;
   }

   @JsonProperty("receiverCompany")
   public void setReceiverCompany(String receiverCompany) {
      this.receiverCompany = receiverCompany;
   }

   @JsonProperty("receiverCompany")
   public String getReceiverCompany() {
      return this.receiverCompany;
   }

   @JsonProperty("bdOwnerNo")
   public void setBdOwnerNo(String bdOwnerNo) {
      this.bdOwnerNo = bdOwnerNo;
   }

   @JsonProperty("bdOwnerNo")
   public String getBdOwnerNo() {
      return this.bdOwnerNo;
   }

   @JsonProperty("wbType")
   public void setWbType(Byte wbType) {
      this.wbType = wbType;
   }

   @JsonProperty("wbType")
   public Byte getWbType() {
      return this.wbType;
   }

   @JsonProperty("isprintFlag")
   public void setIsprintFlag(String isprintFlag) {
      this.isprintFlag = isprintFlag;
   }

   @JsonProperty("isprintFlag")
   public String getIsprintFlag() {
      return this.isprintFlag;
   }

   @JsonProperty("waybillSign")
   public void setWaybillSign(Integer waybillSign) {
      this.waybillSign = waybillSign;
   }

   @JsonProperty("waybillSign")
   public Integer getWaybillSign() {
      return this.waybillSign;
   }

   @JsonProperty("createType")
   public void setCreateType(Integer createType) {
      this.createType = createType;
   }

   @JsonProperty("createType")
   public Integer getCreateType() {
      return this.createType;
   }

   @JsonProperty("reserve1")
   public void setReserve1(String reserve1) {
      this.reserve1 = reserve1;
   }

   @JsonProperty("reserve1")
   public String getReserve1() {
      return this.reserve1;
   }

   @JsonProperty("backName")
   public void setBackName(String backName) {
      this.backName = backName;
   }

   @JsonProperty("backName")
   public String getBackName() {
      return this.backName;
   }

   @JsonProperty("backMobile")
   public void setBackMobile(String backMobile) {
      this.backMobile = backMobile;
   }

   @JsonProperty("backMobile")
   public String getBackMobile() {
      return this.backMobile;
   }

   @JsonProperty("backPhone")
   public void setBackPhone(String backPhone) {
      this.backPhone = backPhone;
   }

   @JsonProperty("backPhone")
   public String getBackPhone() {
      return this.backPhone;
   }

   @JsonProperty("backProvinceCode")
   public void setBackProvinceCode(String backProvinceCode) {
      this.backProvinceCode = backProvinceCode;
   }

   @JsonProperty("backProvinceCode")
   public String getBackProvinceCode() {
      return this.backProvinceCode;
   }

   @JsonProperty("backCityCode")
   public void setBackCityCode(String backCityCode) {
      this.backCityCode = backCityCode;
   }

   @JsonProperty("backCityCode")
   public String getBackCityCode() {
      return this.backCityCode;
   }

   @JsonProperty("backCountyCode")
   public void setBackCountyCode(String backCountyCode) {
      this.backCountyCode = backCountyCode;
   }

   @JsonProperty("backCountyCode")
   public String getBackCountyCode() {
      return this.backCountyCode;
   }

   @JsonProperty("backTownCode")
   public void setBackTownCode(String backTownCode) {
      this.backTownCode = backTownCode;
   }

   @JsonProperty("backTownCode")
   public String getBackTownCode() {
      return this.backTownCode;
   }

   @JsonProperty("backProvinceName")
   public void setBackProvinceName(String backProvinceName) {
      this.backProvinceName = backProvinceName;
   }

   @JsonProperty("backProvinceName")
   public String getBackProvinceName() {
      return this.backProvinceName;
   }

   @JsonProperty("backCityName")
   public void setBackCityName(String backCityName) {
      this.backCityName = backCityName;
   }

   @JsonProperty("backCityName")
   public String getBackCityName() {
      return this.backCityName;
   }

   @JsonProperty("backCountyName")
   public void setBackCountyName(String backCountyName) {
      this.backCountyName = backCountyName;
   }

   @JsonProperty("backCountyName")
   public String getBackCountyName() {
      return this.backCountyName;
   }

   @JsonProperty("backTownName")
   public void setBackTownName(String backTownName) {
      this.backTownName = backTownName;
   }

   @JsonProperty("backTownName")
   public String getBackTownName() {
      return this.backTownName;
   }

   @JsonProperty("backAddress")
   public void setBackAddress(String backAddress) {
      this.backAddress = backAddress;
   }

   @JsonProperty("backAddress")
   public String getBackAddress() {
      return this.backAddress;
   }

   @JsonProperty("wholeBackAddress")
   public void setWholeBackAddress(String wholeBackAddress) {
      this.wholeBackAddress = wholeBackAddress;
   }

   @JsonProperty("wholeBackAddress")
   public String getWholeBackAddress() {
      return this.wholeBackAddress;
   }

   @JsonProperty("pickupReturnReason")
   public void setPickupReturnReason(String pickupReturnReason) {
      this.pickupReturnReason = pickupReturnReason;
   }

   @JsonProperty("pickupReturnReason")
   public String getPickupReturnReason() {
      return this.pickupReturnReason;
   }

   @JsonProperty("saleContactPhone")
   public void setSaleContactPhone(String saleContactPhone) {
      this.saleContactPhone = saleContactPhone;
   }

   @JsonProperty("saleContactPhone")
   public String getSaleContactPhone() {
      return this.saleContactPhone;
   }

   @JsonProperty("productId")
   public void setProductId(String productId) {
      this.productId = productId;
   }

   @JsonProperty("productId")
   public String getProductId() {
      return this.productId;
   }

   @JsonProperty("associateSoNo")
   public void setAssociateSoNo(String associateSoNo) {
      this.associateSoNo = associateSoNo;
   }

   @JsonProperty("associateSoNo")
   public String getAssociateSoNo() {
      return this.associateSoNo;
   }

   @JsonProperty("isGuarantee")
   public void setIsGuarantee(Byte isGuarantee) {
      this.isGuarantee = isGuarantee;
   }

   @JsonProperty("isGuarantee")
   public Byte getIsGuarantee() {
      return this.isGuarantee;
   }

   @JsonProperty("statusSmallDesc")
   public void setStatusSmallDesc(String statusSmallDesc) {
      this.statusSmallDesc = statusSmallDesc;
   }

   @JsonProperty("statusSmallDesc")
   public String getStatusSmallDesc() {
      return this.statusSmallDesc;
   }

   @JsonProperty("lwbStatusObjFLas")
   public void setLwbStatusObjFLas(LwbStatusObjFLas lwbStatusObjFLas) {
      this.lwbStatusObjFLas = lwbStatusObjFLas;
   }

   @JsonProperty("lwbStatusObjFLas")
   public LwbStatusObjFLas getLwbStatusObjFLas() {
      return this.lwbStatusObjFLas;
   }

   @JsonProperty("isprintBoxFlag")
   public void setIsprintBoxFlag(Byte isprintBoxFlag) {
      this.isprintBoxFlag = isprintBoxFlag;
   }

   @JsonProperty("isprintBoxFlag")
   public Byte getIsprintBoxFlag() {
      return this.isprintBoxFlag;
   }

   @JsonProperty("jdExpressItemQty")
   public void setJdExpressItemQty(Integer jdExpressItemQty) {
      this.jdExpressItemQty = jdExpressItemQty;
   }

   @JsonProperty("jdExpressItemQty")
   public Integer getJdExpressItemQty() {
      return this.jdExpressItemQty;
   }

   @JsonProperty("sellerWarehouseCode")
   public void setSellerWarehouseCode(String sellerWarehouseCode) {
      this.sellerWarehouseCode = sellerWarehouseCode;
   }

   @JsonProperty("sellerWarehouseCode")
   public String getSellerWarehouseCode() {
      return this.sellerWarehouseCode;
   }

   @JsonProperty("projectName")
   public void setProjectName(String projectName) {
      this.projectName = projectName;
   }

   @JsonProperty("projectName")
   public String getProjectName() {
      return this.projectName;
   }

   @JsonProperty("actualSpId")
   public void setActualSpId(String actualSpId) {
      this.actualSpId = actualSpId;
   }

   @JsonProperty("actualSpId")
   public String getActualSpId() {
      return this.actualSpId;
   }

   @JsonProperty("predictReceiptDate")
   public void setPredictReceiptDate(Date predictReceiptDate) {
      this.predictReceiptDate = predictReceiptDate;
   }

   @JsonProperty("predictReceiptDate")
   public Date getPredictReceiptDate() {
      return this.predictReceiptDate;
   }

   @JsonProperty("upShelveTime")
   public void setUpShelveTime(Date upShelveTime) {
      this.upShelveTime = upShelveTime;
   }

   @JsonProperty("upShelveTime")
   public Date getUpShelveTime() {
      return this.upShelveTime;
   }

   @JsonProperty("downShelveTime")
   public void setDownShelveTime(Date downShelveTime) {
      this.downShelveTime = downShelveTime;
   }

   @JsonProperty("downShelveTime")
   public Date getDownShelveTime() {
      return this.downShelveTime;
   }

   @JsonProperty("addressExtentInfo")
   public void setAddressExtentInfo(AddressExtentInfo addressExtentInfo) {
      this.addressExtentInfo = addressExtentInfo;
   }

   @JsonProperty("addressExtentInfo")
   public AddressExtentInfo getAddressExtentInfo() {
      return this.addressExtentInfo;
   }
}
