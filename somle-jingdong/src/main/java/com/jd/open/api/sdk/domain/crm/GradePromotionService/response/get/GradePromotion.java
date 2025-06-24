package com.jd.open.api.sdk.domain.crm.GradePromotionService.response.get;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class GradePromotion implements Serializable {
   private String curGrade;
   private String curGradeName;
   private long nextUpgradeAmount;
   private int nextUpgradeCount;
   private String nextGradeName;
   private String nextGrade;

   @JsonProperty("cur_grade")
   public void setCurGrade(String curGrade) {
      this.curGrade = curGrade;
   }

   @JsonProperty("cur_grade")
   public String getCurGrade() {
      return this.curGrade;
   }

   @JsonProperty("cur_grade_name")
   public void setCurGradeName(String curGradeName) {
      this.curGradeName = curGradeName;
   }

   @JsonProperty("cur_grade_name")
   public String getCurGradeName() {
      return this.curGradeName;
   }

   @JsonProperty("next_upgrade_amount")
   public void setNextUpgradeAmount(long nextUpgradeAmount) {
      this.nextUpgradeAmount = nextUpgradeAmount;
   }

   @JsonProperty("next_upgrade_amount")
   public long getNextUpgradeAmount() {
      return this.nextUpgradeAmount;
   }

   @JsonProperty("next_upgrade_count")
   public void setNextUpgradeCount(int nextUpgradeCount) {
      this.nextUpgradeCount = nextUpgradeCount;
   }

   @JsonProperty("next_upgrade_count")
   public int getNextUpgradeCount() {
      return this.nextUpgradeCount;
   }

   @JsonProperty("next_grade_name")
   public void setNextGradeName(String nextGradeName) {
      this.nextGradeName = nextGradeName;
   }

   @JsonProperty("next_grade_name")
   public String getNextGradeName() {
      return this.nextGradeName;
   }

   @JsonProperty("next_grade")
   public void setNextGrade(String nextGrade) {
      this.nextGrade = nextGrade;
   }

   @JsonProperty("next_grade")
   public String getNextGrade() {
      return this.nextGrade;
   }
}
