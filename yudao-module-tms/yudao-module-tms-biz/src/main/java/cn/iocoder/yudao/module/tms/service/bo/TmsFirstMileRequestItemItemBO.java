package cn.iocoder.yudao.module.tms.service.bo;

import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequesItemtDO;
import lombok.Data;

@Data
public class TmsFirstMileRequestItemItemBO extends TmsFirstMileRequesItemtDO {

    //主表
    private cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO tmsFirstMileRequestDO;
}
