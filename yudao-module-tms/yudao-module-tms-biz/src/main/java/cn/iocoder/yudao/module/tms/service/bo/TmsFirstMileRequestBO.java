package cn.iocoder.yudao.module.tms.service.bo;

import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequesItemtDO;
import lombok.Data;

import java.util.List;

@Data
public class TmsFirstMileRequestBO extends cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO {
    //1:N 主子表
    private List<TmsFirstMileRequesItemtDO> items;
}
