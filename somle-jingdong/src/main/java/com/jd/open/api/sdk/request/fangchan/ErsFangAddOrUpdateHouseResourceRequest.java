package com.jd.open.api.sdk.request.fangchan;

import com.jd.open.api.sdk.internal.util.JsonUtil;
import com.jd.open.api.sdk.request.AbstractRequest;
import com.jd.open.api.sdk.request.JdRequest;
import com.jd.open.api.sdk.response.fangchan.ErsFangAddOrUpdateHouseResourceResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class ErsFangAddOrUpdateHouseResourceRequest extends AbstractRequest implements JdRequest<ErsFangAddOrUpdateHouseResourceResponse> {
   private Long channelId;
   private Long plotId;
   private String number;
   private String title;
   private String labels;
   private Short estateType;
   private Short room;
   private Short hall;
   private Short toilet;
   private Short kitchen;
   private BigDecimal downPayment;
   private Double structureArea;
   private Double usableArea;
   private Short orientation;
   private Short fitmentType;
   private String buildYear;
   private Short totalFloor;
   private Short locationFloor;
   private Short floorLabel;
   private String recordNumber;
   private Date housePutawayTime;
   private Date houseUpdateTime;
   private Short houseStatus;
   private Short houseTerm;
   private Integer propertyYear;
   private Short tradeAffiliation;
   private Integer cityCode;
   private Long sourceId;
   private Long storeId;
   private String vrUrl;
   private Long brandId;
   private Short elevatorLabel;

   public void setChannelId(Long channelId) {
      this.channelId = channelId;
   }

   public Long getChannelId() {
      return this.channelId;
   }

   public void setPlotId(Long plotId) {
      this.plotId = plotId;
   }

   public Long getPlotId() {
      return this.plotId;
   }

   public void setNumber(String number) {
      this.number = number;
   }

   public String getNumber() {
      return this.number;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getTitle() {
      return this.title;
   }

   public void setLabels(String labels) {
      this.labels = labels;
   }

   public String getLabels() {
      return this.labels;
   }

   public void setEstateType(Short estateType) {
      this.estateType = estateType;
   }

   public Short getEstateType() {
      return this.estateType;
   }

   public void setRoom(Short room) {
      this.room = room;
   }

   public Short getRoom() {
      return this.room;
   }

   public void setHall(Short hall) {
      this.hall = hall;
   }

   public Short getHall() {
      return this.hall;
   }

   public void setToilet(Short toilet) {
      this.toilet = toilet;
   }

   public Short getToilet() {
      return this.toilet;
   }

   public void setKitchen(Short kitchen) {
      this.kitchen = kitchen;
   }

   public Short getKitchen() {
      return this.kitchen;
   }

   public void setDownPayment(BigDecimal downPayment) {
      this.downPayment = downPayment;
   }

   public BigDecimal getDownPayment() {
      return this.downPayment;
   }

   public void setStructureArea(Double structureArea) {
      this.structureArea = structureArea;
   }

   public Double getStructureArea() {
      return this.structureArea;
   }

   public void setUsableArea(Double usableArea) {
      this.usableArea = usableArea;
   }

   public Double getUsableArea() {
      return this.usableArea;
   }

   public void setOrientation(Short orientation) {
      this.orientation = orientation;
   }

   public Short getOrientation() {
      return this.orientation;
   }

   public void setFitmentType(Short fitmentType) {
      this.fitmentType = fitmentType;
   }

   public Short getFitmentType() {
      return this.fitmentType;
   }

   public void setBuildYear(String buildYear) {
      this.buildYear = buildYear;
   }

   public String getBuildYear() {
      return this.buildYear;
   }

   public void setTotalFloor(Short totalFloor) {
      this.totalFloor = totalFloor;
   }

   public Short getTotalFloor() {
      return this.totalFloor;
   }

   public void setLocationFloor(Short locationFloor) {
      this.locationFloor = locationFloor;
   }

   public Short getLocationFloor() {
      return this.locationFloor;
   }

   public void setFloorLabel(Short floorLabel) {
      this.floorLabel = floorLabel;
   }

   public Short getFloorLabel() {
      return this.floorLabel;
   }

   public void setRecordNumber(String recordNumber) {
      this.recordNumber = recordNumber;
   }

   public String getRecordNumber() {
      return this.recordNumber;
   }

   public void setHousePutawayTime(Date housePutawayTime) {
      this.housePutawayTime = housePutawayTime;
   }

   public Date getHousePutawayTime() {
      return this.housePutawayTime;
   }

   public void setHouseUpdateTime(Date houseUpdateTime) {
      this.houseUpdateTime = houseUpdateTime;
   }

   public Date getHouseUpdateTime() {
      return this.houseUpdateTime;
   }

   public void setHouseStatus(Short houseStatus) {
      this.houseStatus = houseStatus;
   }

   public Short getHouseStatus() {
      return this.houseStatus;
   }

   public void setHouseTerm(Short houseTerm) {
      this.houseTerm = houseTerm;
   }

   public Short getHouseTerm() {
      return this.houseTerm;
   }

   public void setPropertyYear(Integer propertyYear) {
      this.propertyYear = propertyYear;
   }

   public Integer getPropertyYear() {
      return this.propertyYear;
   }

   public void setTradeAffiliation(Short tradeAffiliation) {
      this.tradeAffiliation = tradeAffiliation;
   }

   public Short getTradeAffiliation() {
      return this.tradeAffiliation;
   }

   public void setCityCode(Integer cityCode) {
      this.cityCode = cityCode;
   }

   public Integer getCityCode() {
      return this.cityCode;
   }

   public void setSourceId(Long sourceId) {
      this.sourceId = sourceId;
   }

   public Long getSourceId() {
      return this.sourceId;
   }

   public void setStoreId(Long storeId) {
      this.storeId = storeId;
   }

   public Long getStoreId() {
      return this.storeId;
   }

   public void setVrUrl(String vrUrl) {
      this.vrUrl = vrUrl;
   }

   public String getVrUrl() {
      return this.vrUrl;
   }

   public void setBrandId(Long brandId) {
      this.brandId = brandId;
   }

   public Long getBrandId() {
      return this.brandId;
   }

   public void setElevatorLabel(Short elevatorLabel) {
      this.elevatorLabel = elevatorLabel;
   }

   public Short getElevatorLabel() {
      return this.elevatorLabel;
   }

   public String getApiMethod() {
      return "jingdong.ers.fang.addOrUpdateHouseResource";
   }

   public String getAppJsonParams() throws IOException {
      Map<String, Object> pmap = new TreeMap();
      pmap.put("channelId", this.channelId);
      pmap.put("plotId", this.plotId);
      pmap.put("number", this.number);
      pmap.put("title", this.title);
      pmap.put("labels", this.labels);
      pmap.put("estateType", this.estateType);
      pmap.put("room", this.room);
      pmap.put("hall", this.hall);
      pmap.put("toilet", this.toilet);
      pmap.put("kitchen", this.kitchen);
      pmap.put("downPayment", this.downPayment);
      pmap.put("structureArea", this.structureArea);
      pmap.put("usableArea", this.usableArea);
      pmap.put("orientation", this.orientation);
      pmap.put("fitmentType", this.fitmentType);
      pmap.put("buildYear", this.buildYear);
      pmap.put("totalFloor", this.totalFloor);
      pmap.put("locationFloor", this.locationFloor);
      pmap.put("floorLabel", this.floorLabel);
      pmap.put("recordNumber", this.recordNumber);

      try {
         if (this.housePutawayTime != null) {
            pmap.put("housePutawayTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.housePutawayTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         if (this.houseUpdateTime != null) {
            pmap.put("houseUpdateTime", (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(this.houseUpdateTime));
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      pmap.put("houseStatus", this.houseStatus);
      pmap.put("houseTerm", this.houseTerm);
      pmap.put("propertyYear", this.propertyYear);
      pmap.put("tradeAffiliation", this.tradeAffiliation);
      pmap.put("cityCode", this.cityCode);
      pmap.put("sourceId", this.sourceId);
      pmap.put("storeId", this.storeId);
      pmap.put("vrUrl", this.vrUrl);
      pmap.put("brandId", this.brandId);
      pmap.put("elevatorLabel", this.elevatorLabel);
      return JsonUtil.toJson(pmap);
   }

   public Class<ErsFangAddOrUpdateHouseResourceResponse> getResponseClass() {
      return ErsFangAddOrUpdateHouseResourceResponse.class;
   }
}
