package cn.iocoder.yudao.module.system.api.value.dto;


import com.fhs.core.trans.anno.Trans;
import com.fhs.core.trans.constant.TransType;
import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class SystemValueDTO {
    /**
     * id
     **/
    private Long id;
    /**
    * 字段id
    **/
    @Trans(type = TransType.SIMPLE, targetClassName = "cn.iocoder.yudao.module.system.dal.dataobject.field.SystemFieldDO",fields = {"attribute"},ref = "attribute")
    private Long fieldId;
    /**
     * 字段名称
     **/
    private String attribute;
    /**
     * 字段值
     **/
    private String value;
}