package cn.iocoder.yudao.module.system.api.value;

import cn.iocoder.yudao.module.system.api.value.dto.SystemValueDTO;
import cn.iocoder.yudao.module.system.api.value.vo.SystemValueSaveReqVO;

import java.util.List;

/**
 * @author Administrator
 */
public interface SystemValueApi {
    /**
    * @Author Wqh
    * @Description 新增自定义值
    * @Date 16:05 2024/10/21
    * @Param [createReqVO]
    * @return java.lang.Integer
    **/
    Boolean createValue(List<SystemValueSaveReqVO> createReqVO,Long classId,String tableName);

    /**
    * @Author Wqh
    * @Description 校验id的存在性
    * @Date 16:41 2024/10/21
    * @Param [ids]
    * @return java.lang.Boolean
    **/
    Boolean validateValuesExists (List<Long> ids);

    /**
    * @Author Wqh
    * @Description 修改自定义值
    * @Date 16:46 2024/10/21
    * @Param [updateReqVO, classId, tableName]
    * @return java.lang.Boolean
    **/
    Boolean updateValue(List<SystemValueSaveReqVO> updateReqVO,Long classId,String tableName);

    /**
    * @Author Wqh
    * @Description 根据类id和表名称查询自定义值id集合
    * @Date 16:51 2024/10/21
    * @Param [classId]
    * @return java.util.List<java.lang.Long>
    **/
    List<Long> selectValueIdsByClassIdAndTableName(Long classId,String tableName);

    /**
    * @Author Wqh
    * @Description 批量删除自定义值
    * @Date 16:52 2024/10/21
    * @Param [ids]
    * @return java.lang.Boolean
    **/
    Integer deleteValueBatch(List<Long> ids);

    /**
     * @Author Wqh
     * @Description 根据类id和表名称查询自定义值集合
     * @Date 16:51 2024/10/21
     * @Param [classId]
     * @return java.util.List<java.lang.Long>
     **/
    List<SystemValueDTO> selectValueByClassIdAndTableName(Long classId, String tableName);
}
