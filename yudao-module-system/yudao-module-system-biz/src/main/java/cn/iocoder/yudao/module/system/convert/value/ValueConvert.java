package cn.iocoder.yudao.module.system.convert.value;

import cn.iocoder.yudao.module.system.api.value.dto.SystemValueDTO;
import cn.iocoder.yudao.module.system.api.value.vo.SystemValueSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.value.SystemValueDO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

/**
 * @className: ValueConvert
 * @author: Wqh
 * @date: 2024/10/21 16:08
 * @Version: 1.0
 * @description:
 */
@Mapper(componentModel = "spring", typeConversionPolicy = ReportingPolicy.ERROR)
public interface ValueConvert {
    ValueConvert INSTANCE = org.mapstruct.factory.Mappers.getMapper(ValueConvert.class);

    //List<SystemValueDO> convertList(List<SystemValueSaveReqVO> reqVos);

    List<SystemValueDTO> convertList0(List<SystemValueDO> systemValueDos);
}
