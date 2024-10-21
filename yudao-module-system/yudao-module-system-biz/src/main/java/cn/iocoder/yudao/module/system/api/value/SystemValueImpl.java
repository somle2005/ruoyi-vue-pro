package cn.iocoder.yudao.module.system.api.value;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjUtil;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.system.api.value.dto.SystemValueDTO;
import cn.iocoder.yudao.module.system.api.value.vo.SystemValueSaveReqVO;
import cn.iocoder.yudao.module.system.convert.value.ValueConvert;
import cn.iocoder.yudao.module.system.dal.dataobject.value.SystemValueDO;
import cn.iocoder.yudao.module.system.dal.mysql.value.SystemValueMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className: SystemValueImpl
 * @author: Wqh
 * @date: 2024/10/21 15:59
 * @Version: 1.0
 * @description:
 */
@Service
@RequiredArgsConstructor
public class SystemValueImpl implements SystemValueApi{
    private final SystemValueMapper systemValueMapper;
    @Override
    public Boolean createValue(List<SystemValueSaveReqVO> createReqVO,Long classId,String tableName) {
        List<SystemValueDO> systemValueDO = getSystemValueDos(createReqVO, classId, tableName);
        return systemValueMapper.insertBatch(systemValueDO);
    }

    @Override
    public Boolean validateValuesExists(List<Long> ids) {
        for (Long id : ids){
            if (ObjUtil.isEmpty(systemValueMapper.selectById(id))){
                return false;
            }
        }
        return true;
    }

    @Override
    public Boolean updateValue(List<SystemValueSaveReqVO> updateReqVO, Long classId, String tableName) {
        List<SystemValueDO> systemValueDos = getSystemValueDos(updateReqVO, classId, tableName);
        return systemValueMapper.updateBatch(systemValueDos);
    }

    @Override
    public List<Long> selectValueIdsByClassIdAndTableName(Long classId, String tableName) {
        List<SystemValueDO> systemValueDos = systemValueMapper.selectValueIdsByClassIdAndTableName(classId, tableName);
        if (CollUtil.isNotEmpty(systemValueDos)){
            return systemValueDos.stream().map(SystemValueDO::getId).toList();
        }
        return null;
    }

    @Override
    public Integer deleteValueBatch(List<Long> ids) {
        return systemValueMapper.deleteByIds(ids);
    }

    @Override
    public List<SystemValueDTO> selectValueByClassIdAndTableName(Long classId, String tableName) {
        List<SystemValueDO> systemValueDos = systemValueMapper.selectValueIdsByClassIdAndTableName(classId, tableName);
        return ValueConvert.INSTANCE.convertList0(systemValueDos);
    }

    private static List<SystemValueDO> getSystemValueDos(List<SystemValueSaveReqVO> reqVos, Long classId, String tableName) {
        /*List<SystemValueDO> systemValueDos = ValueConvert.INSTANCE.convertList(reqVos);
        for (SystemValueDO systemValueDO : systemValueDos){
            systemValueDO.setClassId(classId);
            systemValueDO.setTable(tableName);
        }
        return systemValueDos;*/
        return null;
    }
}
