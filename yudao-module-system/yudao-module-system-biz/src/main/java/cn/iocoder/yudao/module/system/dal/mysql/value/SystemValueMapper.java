package cn.iocoder.yudao.module.system.dal.mysql.value;


import cn.iocoder.yudao.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.system.dal.dataobject.value.SystemValueDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 自定义字段值 Mapper
 *
 * @author 索迈管理员
 */
@Mapper
public interface SystemValueMapper extends BaseMapperX<SystemValueDO> {


    default List<SystemValueDO> selectValueIdsByClassIdAndTableName(Long classId, String tableName){
        return selectList(new LambdaQueryWrapperX<SystemValueDO>()
                .eq(SystemValueDO::getClassId, classId)
                .eq(SystemValueDO::getTable, tableName));
    }
}