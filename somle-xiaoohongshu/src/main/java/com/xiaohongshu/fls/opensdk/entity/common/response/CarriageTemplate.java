package com.xiaohongshu.fls.opensdk.entity.common.response;

import java.util.ArrayList;
import java.util.List;

public class CarriageTemplate {
   public String templateId;
   public String templateName;
   public Integer templateType;
   public Integer costType;
   public Integer expressType;
   public Boolean supportNotDelivery;
   public List<String> notDeliveryAreas;
   public ExpressCostConfigDTO normalConfig;
   public Boolean enabled;
   public Long syncdAt;
   public String createBy;
   public Long createAt;
   public Long updateAt;
   public SendAddress sendAddress;

   public String getTemplateId() {
      return this.templateId;
   }

   public String getTemplateName() {
      return this.templateName;
   }

   public Integer getTemplateType() {
      return this.templateType;
   }

   public Integer getCostType() {
      return this.costType;
   }

   public Integer getExpressType() {
      return this.expressType;
   }

   public Boolean getSupportNotDelivery() {
      return this.supportNotDelivery;
   }

   public List<String> getNotDeliveryAreas() {
      return this.notDeliveryAreas;
   }

   public ExpressCostConfigDTO getNormalConfig() {
      return this.normalConfig;
   }

   public Boolean getEnabled() {
      return this.enabled;
   }

   public Long getSyncdAt() {
      return this.syncdAt;
   }

   public String getCreateBy() {
      return this.createBy;
   }

   public Long getCreateAt() {
      return this.createAt;
   }

   public Long getUpdateAt() {
      return this.updateAt;
   }

   public SendAddress getSendAddress() {
      return this.sendAddress;
   }

   public void setTemplateId(String templateId) {
      this.templateId = templateId;
   }

   public void setTemplateName(String templateName) {
      this.templateName = templateName;
   }

   public void setTemplateType(Integer templateType) {
      this.templateType = templateType;
   }

   public void setCostType(Integer costType) {
      this.costType = costType;
   }

   public void setExpressType(Integer expressType) {
      this.expressType = expressType;
   }

   public void setSupportNotDelivery(Boolean supportNotDelivery) {
      this.supportNotDelivery = supportNotDelivery;
   }

   public void setNotDeliveryAreas(List<String> notDeliveryAreas) {
      this.notDeliveryAreas = notDeliveryAreas;
   }

   public void setNormalConfig(ExpressCostConfigDTO normalConfig) {
      this.normalConfig = normalConfig;
   }

   public void setEnabled(Boolean enabled) {
      this.enabled = enabled;
   }

   public void setSyncdAt(Long syncdAt) {
      this.syncdAt = syncdAt;
   }

   public void setCreateBy(String createBy) {
      this.createBy = createBy;
   }

   public void setCreateAt(Long createAt) {
      this.createAt = createAt;
   }

   public void setUpdateAt(Long updateAt) {
      this.updateAt = updateAt;
   }

   public void setSendAddress(SendAddress sendAddress) {
      this.sendAddress = sendAddress;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof CarriageTemplate)) {
         return false;
      } else {
         CarriageTemplate other = (CarriageTemplate)o;
         if (!other.canEqual(this)) {
            return false;
         } else {
            Object this$templateType = this.getTemplateType();
            Object other$templateType = other.getTemplateType();
            if (this$templateType == null) {
               if (other$templateType != null) {
                  return false;
               }
            } else if (!this$templateType.equals(other$templateType)) {
               return false;
            }

            Object this$costType = this.getCostType();
            Object other$costType = other.getCostType();
            if (this$costType == null) {
               if (other$costType != null) {
                  return false;
               }
            } else if (!this$costType.equals(other$costType)) {
               return false;
            }

            Object this$expressType = this.getExpressType();
            Object other$expressType = other.getExpressType();
            if (this$expressType == null) {
               if (other$expressType != null) {
                  return false;
               }
            } else if (!this$expressType.equals(other$expressType)) {
               return false;
            }

            Object this$supportNotDelivery = this.getSupportNotDelivery();
            Object other$supportNotDelivery = other.getSupportNotDelivery();
            if (this$supportNotDelivery == null) {
               if (other$supportNotDelivery != null) {
                  return false;
               }
            } else if (!this$supportNotDelivery.equals(other$supportNotDelivery)) {
               return false;
            }

            Object this$enabled = this.getEnabled();
            Object other$enabled = other.getEnabled();
            if (this$enabled == null) {
               if (other$enabled != null) {
                  return false;
               }
            } else if (!this$enabled.equals(other$enabled)) {
               return false;
            }

            Object this$syncdAt = this.getSyncdAt();
            Object other$syncdAt = other.getSyncdAt();
            if (this$syncdAt == null) {
               if (other$syncdAt != null) {
                  return false;
               }
            } else if (!this$syncdAt.equals(other$syncdAt)) {
               return false;
            }

            Object this$createAt = this.getCreateAt();
            Object other$createAt = other.getCreateAt();
            if (this$createAt == null) {
               if (other$createAt != null) {
                  return false;
               }
            } else if (!this$createAt.equals(other$createAt)) {
               return false;
            }

            Object this$updateAt = this.getUpdateAt();
            Object other$updateAt = other.getUpdateAt();
            if (this$updateAt == null) {
               if (other$updateAt != null) {
                  return false;
               }
            } else if (!this$updateAt.equals(other$updateAt)) {
               return false;
            }

            Object this$templateId = this.getTemplateId();
            Object other$templateId = other.getTemplateId();
            if (this$templateId == null) {
               if (other$templateId != null) {
                  return false;
               }
            } else if (!this$templateId.equals(other$templateId)) {
               return false;
            }

            Object this$templateName = this.getTemplateName();
            Object other$templateName = other.getTemplateName();
            if (this$templateName == null) {
               if (other$templateName != null) {
                  return false;
               }
            } else if (!this$templateName.equals(other$templateName)) {
               return false;
            }

            Object this$notDeliveryAreas = this.getNotDeliveryAreas();
            Object other$notDeliveryAreas = other.getNotDeliveryAreas();
            if (this$notDeliveryAreas == null) {
               if (other$notDeliveryAreas != null) {
                  return false;
               }
            } else if (!this$notDeliveryAreas.equals(other$notDeliveryAreas)) {
               return false;
            }

            Object this$normalConfig = this.getNormalConfig();
            Object other$normalConfig = other.getNormalConfig();
            if (this$normalConfig == null) {
               if (other$normalConfig != null) {
                  return false;
               }
            } else if (!this$normalConfig.equals(other$normalConfig)) {
               return false;
            }

            Object this$createBy = this.getCreateBy();
            Object other$createBy = other.getCreateBy();
            if (this$createBy == null) {
               if (other$createBy != null) {
                  return false;
               }
            } else if (!this$createBy.equals(other$createBy)) {
               return false;
            }

            Object this$sendAddress = this.getSendAddress();
            Object other$sendAddress = other.getSendAddress();
            if (this$sendAddress == null) {
               if (other$sendAddress != null) {
                  return false;
               }
            } else if (!this$sendAddress.equals(other$sendAddress)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof CarriageTemplate;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      Object $templateType = this.getTemplateType();
      result = result * 59 + ($templateType == null ? 43 : $templateType.hashCode());
      Object $costType = this.getCostType();
      result = result * 59 + ($costType == null ? 43 : $costType.hashCode());
      Object $expressType = this.getExpressType();
      result = result * 59 + ($expressType == null ? 43 : $expressType.hashCode());
      Object $supportNotDelivery = this.getSupportNotDelivery();
      result = result * 59 + ($supportNotDelivery == null ? 43 : $supportNotDelivery.hashCode());
      Object $enabled = this.getEnabled();
      result = result * 59 + ($enabled == null ? 43 : $enabled.hashCode());
      Object $syncdAt = this.getSyncdAt();
      result = result * 59 + ($syncdAt == null ? 43 : $syncdAt.hashCode());
      Object $createAt = this.getCreateAt();
      result = result * 59 + ($createAt == null ? 43 : $createAt.hashCode());
      Object $updateAt = this.getUpdateAt();
      result = result * 59 + ($updateAt == null ? 43 : $updateAt.hashCode());
      Object $templateId = this.getTemplateId();
      result = result * 59 + ($templateId == null ? 43 : $templateId.hashCode());
      Object $templateName = this.getTemplateName();
      result = result * 59 + ($templateName == null ? 43 : $templateName.hashCode());
      Object $notDeliveryAreas = this.getNotDeliveryAreas();
      result = result * 59 + ($notDeliveryAreas == null ? 43 : $notDeliveryAreas.hashCode());
      Object $normalConfig = this.getNormalConfig();
      result = result * 59 + ($normalConfig == null ? 43 : $normalConfig.hashCode());
      Object $createBy = this.getCreateBy();
      result = result * 59 + ($createBy == null ? 43 : $createBy.hashCode());
      Object $sendAddress = this.getSendAddress();
      result = result * 59 + ($sendAddress == null ? 43 : $sendAddress.hashCode());
      return result;
   }

   public String toString() {
      return "CarriageTemplate(templateId=" + this.getTemplateId() + ", templateName=" + this.getTemplateName() + ", templateType=" + this.getTemplateType() + ", costType=" + this.getCostType() + ", expressType=" + this.getExpressType() + ", supportNotDelivery=" + this.getSupportNotDelivery() + ", notDeliveryAreas=" + this.getNotDeliveryAreas() + ", normalConfig=" + this.getNormalConfig() + ", enabled=" + this.getEnabled() + ", syncdAt=" + this.getSyncdAt() + ", createBy=" + this.getCreateBy() + ", createAt=" + this.getCreateAt() + ", updateAt=" + this.getUpdateAt() + ", sendAddress=" + this.getSendAddress() + ")";
   }

   public static class ExpressCostConfigDTO {
      public Integer firstStandard;
      public Integer firstCost;
      public Integer addStandard;
      public Integer addCost;
      public List<AreaCostConfigDTO> areaCostConfigs = new ArrayList();

      public Integer getFirstStandard() {
         return this.firstStandard;
      }

      public Integer getFirstCost() {
         return this.firstCost;
      }

      public Integer getAddStandard() {
         return this.addStandard;
      }

      public Integer getAddCost() {
         return this.addCost;
      }

      public List<AreaCostConfigDTO> getAreaCostConfigs() {
         return this.areaCostConfigs;
      }

      public void setFirstStandard(Integer firstStandard) {
         this.firstStandard = firstStandard;
      }

      public void setFirstCost(Integer firstCost) {
         this.firstCost = firstCost;
      }

      public void setAddStandard(Integer addStandard) {
         this.addStandard = addStandard;
      }

      public void setAddCost(Integer addCost) {
         this.addCost = addCost;
      }

      public void setAreaCostConfigs(List<AreaCostConfigDTO> areaCostConfigs) {
         this.areaCostConfigs = areaCostConfigs;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof ExpressCostConfigDTO)) {
            return false;
         } else {
            ExpressCostConfigDTO other = (ExpressCostConfigDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$firstStandard = this.getFirstStandard();
               Object other$firstStandard = other.getFirstStandard();
               if (this$firstStandard == null) {
                  if (other$firstStandard != null) {
                     return false;
                  }
               } else if (!this$firstStandard.equals(other$firstStandard)) {
                  return false;
               }

               Object this$firstCost = this.getFirstCost();
               Object other$firstCost = other.getFirstCost();
               if (this$firstCost == null) {
                  if (other$firstCost != null) {
                     return false;
                  }
               } else if (!this$firstCost.equals(other$firstCost)) {
                  return false;
               }

               Object this$addStandard = this.getAddStandard();
               Object other$addStandard = other.getAddStandard();
               if (this$addStandard == null) {
                  if (other$addStandard != null) {
                     return false;
                  }
               } else if (!this$addStandard.equals(other$addStandard)) {
                  return false;
               }

               Object this$addCost = this.getAddCost();
               Object other$addCost = other.getAddCost();
               if (this$addCost == null) {
                  if (other$addCost != null) {
                     return false;
                  }
               } else if (!this$addCost.equals(other$addCost)) {
                  return false;
               }

               Object this$areaCostConfigs = this.getAreaCostConfigs();
               Object other$areaCostConfigs = other.getAreaCostConfigs();
               if (this$areaCostConfigs == null) {
                  if (other$areaCostConfigs != null) {
                     return false;
                  }
               } else if (!this$areaCostConfigs.equals(other$areaCostConfigs)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof ExpressCostConfigDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $firstStandard = this.getFirstStandard();
         result = result * 59 + ($firstStandard == null ? 43 : $firstStandard.hashCode());
         Object $firstCost = this.getFirstCost();
         result = result * 59 + ($firstCost == null ? 43 : $firstCost.hashCode());
         Object $addStandard = this.getAddStandard();
         result = result * 59 + ($addStandard == null ? 43 : $addStandard.hashCode());
         Object $addCost = this.getAddCost();
         result = result * 59 + ($addCost == null ? 43 : $addCost.hashCode());
         Object $areaCostConfigs = this.getAreaCostConfigs();
         result = result * 59 + ($areaCostConfigs == null ? 43 : $areaCostConfigs.hashCode());
         return result;
      }

      public String toString() {
         return "CarriageTemplate.ExpressCostConfigDTO(firstStandard=" + this.getFirstStandard() + ", firstCost=" + this.getFirstCost() + ", addStandard=" + this.getAddStandard() + ", addCost=" + this.getAddCost() + ", areaCostConfigs=" + this.getAreaCostConfigs() + ")";
      }
   }

   public static class AreaCostConfigDTO {
      public List<String> areas;
      public Integer firstStandard;
      public Integer firstCost;
      public Integer addStandard;
      public Integer addCost;

      public List<String> getAreas() {
         return this.areas;
      }

      public Integer getFirstStandard() {
         return this.firstStandard;
      }

      public Integer getFirstCost() {
         return this.firstCost;
      }

      public Integer getAddStandard() {
         return this.addStandard;
      }

      public Integer getAddCost() {
         return this.addCost;
      }

      public void setAreas(List<String> areas) {
         this.areas = areas;
      }

      public void setFirstStandard(Integer firstStandard) {
         this.firstStandard = firstStandard;
      }

      public void setFirstCost(Integer firstCost) {
         this.firstCost = firstCost;
      }

      public void setAddStandard(Integer addStandard) {
         this.addStandard = addStandard;
      }

      public void setAddCost(Integer addCost) {
         this.addCost = addCost;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof AreaCostConfigDTO)) {
            return false;
         } else {
            AreaCostConfigDTO other = (AreaCostConfigDTO)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$firstStandard = this.getFirstStandard();
               Object other$firstStandard = other.getFirstStandard();
               if (this$firstStandard == null) {
                  if (other$firstStandard != null) {
                     return false;
                  }
               } else if (!this$firstStandard.equals(other$firstStandard)) {
                  return false;
               }

               Object this$firstCost = this.getFirstCost();
               Object other$firstCost = other.getFirstCost();
               if (this$firstCost == null) {
                  if (other$firstCost != null) {
                     return false;
                  }
               } else if (!this$firstCost.equals(other$firstCost)) {
                  return false;
               }

               Object this$addStandard = this.getAddStandard();
               Object other$addStandard = other.getAddStandard();
               if (this$addStandard == null) {
                  if (other$addStandard != null) {
                     return false;
                  }
               } else if (!this$addStandard.equals(other$addStandard)) {
                  return false;
               }

               Object this$addCost = this.getAddCost();
               Object other$addCost = other.getAddCost();
               if (this$addCost == null) {
                  if (other$addCost != null) {
                     return false;
                  }
               } else if (!this$addCost.equals(other$addCost)) {
                  return false;
               }

               Object this$areas = this.getAreas();
               Object other$areas = other.getAreas();
               if (this$areas == null) {
                  if (other$areas != null) {
                     return false;
                  }
               } else if (!this$areas.equals(other$areas)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof AreaCostConfigDTO;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $firstStandard = this.getFirstStandard();
         result = result * 59 + ($firstStandard == null ? 43 : $firstStandard.hashCode());
         Object $firstCost = this.getFirstCost();
         result = result * 59 + ($firstCost == null ? 43 : $firstCost.hashCode());
         Object $addStandard = this.getAddStandard();
         result = result * 59 + ($addStandard == null ? 43 : $addStandard.hashCode());
         Object $addCost = this.getAddCost();
         result = result * 59 + ($addCost == null ? 43 : $addCost.hashCode());
         Object $areas = this.getAreas();
         result = result * 59 + ($areas == null ? 43 : $areas.hashCode());
         return result;
      }

      public String toString() {
         return "CarriageTemplate.AreaCostConfigDTO(areas=" + this.getAreas() + ", firstStandard=" + this.getFirstStandard() + ", firstCost=" + this.getFirstCost() + ", addStandard=" + this.getAddStandard() + ", addCost=" + this.getAddCost() + ")";
      }
   }

   public static class SendAddress {
      public String countryCode;
      public String countryName;
      public String provinceCode;
      public String provinceName;
      public String cityCode;
      public String cityName;
      public String areaCode;
      public String areaName;

      public String getCountryCode() {
         return this.countryCode;
      }

      public String getCountryName() {
         return this.countryName;
      }

      public String getProvinceCode() {
         return this.provinceCode;
      }

      public String getProvinceName() {
         return this.provinceName;
      }

      public String getCityCode() {
         return this.cityCode;
      }

      public String getCityName() {
         return this.cityName;
      }

      public String getAreaCode() {
         return this.areaCode;
      }

      public String getAreaName() {
         return this.areaName;
      }

      public void setCountryCode(String countryCode) {
         this.countryCode = countryCode;
      }

      public void setCountryName(String countryName) {
         this.countryName = countryName;
      }

      public void setProvinceCode(String provinceCode) {
         this.provinceCode = provinceCode;
      }

      public void setProvinceName(String provinceName) {
         this.provinceName = provinceName;
      }

      public void setCityCode(String cityCode) {
         this.cityCode = cityCode;
      }

      public void setCityName(String cityName) {
         this.cityName = cityName;
      }

      public void setAreaCode(String areaCode) {
         this.areaCode = areaCode;
      }

      public void setAreaName(String areaName) {
         this.areaName = areaName;
      }

      public boolean equals(Object o) {
         if (o == this) {
            return true;
         } else if (!(o instanceof SendAddress)) {
            return false;
         } else {
            SendAddress other = (SendAddress)o;
            if (!other.canEqual(this)) {
               return false;
            } else {
               Object this$countryCode = this.getCountryCode();
               Object other$countryCode = other.getCountryCode();
               if (this$countryCode == null) {
                  if (other$countryCode != null) {
                     return false;
                  }
               } else if (!this$countryCode.equals(other$countryCode)) {
                  return false;
               }

               Object this$countryName = this.getCountryName();
               Object other$countryName = other.getCountryName();
               if (this$countryName == null) {
                  if (other$countryName != null) {
                     return false;
                  }
               } else if (!this$countryName.equals(other$countryName)) {
                  return false;
               }

               Object this$provinceCode = this.getProvinceCode();
               Object other$provinceCode = other.getProvinceCode();
               if (this$provinceCode == null) {
                  if (other$provinceCode != null) {
                     return false;
                  }
               } else if (!this$provinceCode.equals(other$provinceCode)) {
                  return false;
               }

               Object this$provinceName = this.getProvinceName();
               Object other$provinceName = other.getProvinceName();
               if (this$provinceName == null) {
                  if (other$provinceName != null) {
                     return false;
                  }
               } else if (!this$provinceName.equals(other$provinceName)) {
                  return false;
               }

               Object this$cityCode = this.getCityCode();
               Object other$cityCode = other.getCityCode();
               if (this$cityCode == null) {
                  if (other$cityCode != null) {
                     return false;
                  }
               } else if (!this$cityCode.equals(other$cityCode)) {
                  return false;
               }

               Object this$cityName = this.getCityName();
               Object other$cityName = other.getCityName();
               if (this$cityName == null) {
                  if (other$cityName != null) {
                     return false;
                  }
               } else if (!this$cityName.equals(other$cityName)) {
                  return false;
               }

               Object this$areaCode = this.getAreaCode();
               Object other$areaCode = other.getAreaCode();
               if (this$areaCode == null) {
                  if (other$areaCode != null) {
                     return false;
                  }
               } else if (!this$areaCode.equals(other$areaCode)) {
                  return false;
               }

               Object this$areaName = this.getAreaName();
               Object other$areaName = other.getAreaName();
               if (this$areaName == null) {
                  if (other$areaName != null) {
                     return false;
                  }
               } else if (!this$areaName.equals(other$areaName)) {
                  return false;
               }

               return true;
            }
         }
      }

      protected boolean canEqual(Object other) {
         return other instanceof SendAddress;
      }

      public int hashCode() {
         int PRIME = 59;
         int result = 1;
         Object $countryCode = this.getCountryCode();
         result = result * 59 + ($countryCode == null ? 43 : $countryCode.hashCode());
         Object $countryName = this.getCountryName();
         result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
         Object $provinceCode = this.getProvinceCode();
         result = result * 59 + ($provinceCode == null ? 43 : $provinceCode.hashCode());
         Object $provinceName = this.getProvinceName();
         result = result * 59 + ($provinceName == null ? 43 : $provinceName.hashCode());
         Object $cityCode = this.getCityCode();
         result = result * 59 + ($cityCode == null ? 43 : $cityCode.hashCode());
         Object $cityName = this.getCityName();
         result = result * 59 + ($cityName == null ? 43 : $cityName.hashCode());
         Object $areaCode = this.getAreaCode();
         result = result * 59 + ($areaCode == null ? 43 : $areaCode.hashCode());
         Object $areaName = this.getAreaName();
         result = result * 59 + ($areaName == null ? 43 : $areaName.hashCode());
         return result;
      }

      public String toString() {
         return "CarriageTemplate.SendAddress(countryCode=" + this.getCountryCode() + ", countryName=" + this.getCountryName() + ", provinceCode=" + this.getProvinceCode() + ", provinceName=" + this.getProvinceName() + ", cityCode=" + this.getCityCode() + ", cityName=" + this.getCityName() + ", areaCode=" + this.getAreaCode() + ", areaName=" + this.getAreaName() + ")";
      }
   }
}
