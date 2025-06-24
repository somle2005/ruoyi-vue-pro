package com.jd.open.api.sdk.domain.B2B.B2BOrderProvider.request.submitPo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class PoReq implements Serializable {
   private String thirdOrderId;
   private String remark;
   private PaymentReq payment;
   private List<ShipmentReq> shipments;
   private FreightReq freight;
   private InvoiceReq invoice;
   private ConsigneeReq consignee;
   private PreOccupyReq preOccupyRep;

   @JsonProperty("thirdOrderId")
   public void setThirdOrderId(String thirdOrderId) {
      this.thirdOrderId = thirdOrderId;
   }

   @JsonProperty("thirdOrderId")
   public String getThirdOrderId() {
      return this.thirdOrderId;
   }

   @JsonProperty("remark")
   public void setRemark(String remark) {
      this.remark = remark;
   }

   @JsonProperty("remark")
   public String getRemark() {
      return this.remark;
   }

   @JsonProperty("payment")
   public void setPayment(PaymentReq payment) {
      this.payment = payment;
   }

   @JsonProperty("payment")
   public PaymentReq getPayment() {
      return this.payment;
   }

   @JsonProperty("shipments")
   public void setShipments(List<ShipmentReq> shipments) {
      this.shipments = shipments;
   }

   @JsonProperty("shipments")
   public List<ShipmentReq> getShipments() {
      return this.shipments;
   }

   @JsonProperty("freight")
   public void setFreight(FreightReq freight) {
      this.freight = freight;
   }

   @JsonProperty("freight")
   public FreightReq getFreight() {
      return this.freight;
   }

   @JsonProperty("invoice")
   public void setInvoice(InvoiceReq invoice) {
      this.invoice = invoice;
   }

   @JsonProperty("invoice")
   public InvoiceReq getInvoice() {
      return this.invoice;
   }

   @JsonProperty("consignee")
   public void setConsignee(ConsigneeReq consignee) {
      this.consignee = consignee;
   }

   @JsonProperty("consignee")
   public ConsigneeReq getConsignee() {
      return this.consignee;
   }

   @JsonProperty("preOccupyRep")
   public void setPreOccupyRep(PreOccupyReq preOccupyRep) {
      this.preOccupyRep = preOccupyRep;
   }

   @JsonProperty("preOccupyRep")
   public PreOccupyReq getPreOccupyRep() {
      return this.preOccupyRep;
   }
}
