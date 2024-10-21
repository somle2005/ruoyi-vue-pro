package cn.iocoder.yudao.module.system.api.value.vo;

import lombok.*;


/**
 * @author Administrator
 */
@Data
public class SystemValueSaveReqVO {
    /**
    * id
    **/
    private Long id;
    /**
    * 字段id
     * */
    private Long fieldId;

    /**
    * 值
    **/
    private Object value;

}