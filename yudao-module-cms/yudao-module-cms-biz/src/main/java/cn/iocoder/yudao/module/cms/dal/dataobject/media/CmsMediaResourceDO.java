package cn.iocoder.yudao.module.cms.dal.dataobject.media;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.*;

import java.util.List;

/**
 * 文件 DO
 *
 * @author 谷毛毛
 */
//autoResultMap = true 开启确保MyBatis-Plus生成的ResultMap自动包含JacksonTypeHandler处理逻辑，storagePath查询不会为null
@TableName(value = "cms_media_resource",autoResultMap = true)
@KeySequence("cms_media_resource_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CmsMediaResourceDO extends BaseDO {

    /**
     * 编号
     */
    @TableId
    private Long id;
    /**
     * 应用编码
     */
    private Integer appCode;
    /**
     * 模块编码
     */
    private Integer moduleCode;
    /**
     * 资源标题
     */
    private String title;
    /**
     * 资源描述
     */
    private String description;
    /**
     * 存储路径
     */
    @TableField(typeHandler = JacksonTypeHandler.class)
    private List<String> storagePath;
    /**
     * 资源类型1图片2视频3音频4文档
     */
    private Integer mediaType;

}