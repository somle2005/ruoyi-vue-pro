package cn.iocoder.yudao.module.system.convert.value;

import cn.iocoder.yudao.module.system.api.value.dto.SystemValueDTO;
import cn.iocoder.yudao.module.system.api.value.vo.SystemValueSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.value.SystemValueDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Named;

import java.util.List;

/**
 * @className: ValueConvert
 * @author: Wqh
 * @date: 2024/10/21 16:08
 * @Version: 1.0
 * @description:
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ValueConvert {

    @Mapping(target = "table", ignore = true)
    @Mapping(target = "classId", ignore = true)
    @Mapping(target = "value",source = "value", qualifiedByName = "objectToString")
    SystemValueDO reqVoToDO(SystemValueSaveReqVO reqVos);

    List<SystemValueDO> convertList(List<SystemValueSaveReqVO> reqVos);

    List<SystemValueDTO> convertList0(List<SystemValueDO> systemValueDos);


    @Named("objectToString")
    default String objectToString(Object value) {
        return value != null ? String.valueOf(value) : "";
    }

}
