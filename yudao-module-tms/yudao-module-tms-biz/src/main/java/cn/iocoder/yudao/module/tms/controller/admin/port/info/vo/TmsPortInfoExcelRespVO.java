package cn.iocoder.yudao.module.tms.controller.admin.port.info.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.aop.ExcelMergeGroup;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.tms.enums.TmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TmsPortInfoExcelRespVO {
    @ExcelProperty("港口信息编号")
    @ExcelMergeGroup(unique = true)
    private Long id;

    @ExcelProperty("港口编码")
    @ExcelMergeGroup
    private String code;

    @ExcelProperty("港口中文名")
    @ExcelMergeGroup
    private String name;

    @ExcelProperty("港口英文名")
    @ExcelMergeGroup
    private String nameEn;

    @ExcelProperty(value = "国家代码", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.COUNTRY_CODE)
    @ExcelMergeGroup
    private Integer countryCode;

    @ExcelProperty("国家描述")
    @ExcelMergeGroup
    private String countryName;

    @ExcelProperty("城市中文名")
    @ExcelMergeGroup
    private String cityName;

    @ExcelProperty("城市英文名")
    @ExcelMergeGroup
    private String cityNameEn;

    @ExcelProperty("备注")
    @ExcelMergeGroup
    private String remark;

    @ExcelProperty(value = "启用/禁用状态", converter = DictConvert.class)
    @DictFormat(TmsDictTypeConstants.BOOLEAN_STATUS)
    @ExcelMergeGroup
    private Boolean status;

    @ExcelProperty("创建时间")
    @ExcelMergeGroup
    private LocalDateTime createTime;

    @ExcelProperty("更新时间")
    @ExcelMergeGroup
    private LocalDateTime updateTime;

    @ExcelProperty("创建人")
    @ExcelMergeGroup
    private String creator;

    @ExcelProperty("更新人")
    @ExcelMergeGroup
    private String updater;
} 