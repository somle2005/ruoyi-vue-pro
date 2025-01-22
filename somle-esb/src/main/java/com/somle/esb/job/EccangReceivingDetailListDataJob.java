package com.somle.esb.job;

import com.somle.eccang.model.req.EccangReceivingDetailReqVO;
import com.somle.esb.model.OssData;
import org.springframework.stereotype.Component;

@Component
public class EccangReceivingDetailListDataJob extends EccangDataJob {
    @Override
    public String execute(String param) throws Exception {
        setDate(param);

        eccangService.getReceivingDetailList(EccangReceivingDetailReqVO.builder()
                .dateFor(beforeYesterdayFirstSecond.toString())
                .dateTo(beforeYesterdayLastSecond.toString())
                .build())
            .forEach(page -> {
//                OssData data = OssData.builder()
//                    .database(DATABASE)
//                    .tableName("order_refund")
//                    .syncType("inc")
//                    .requestTimestamp(System.currentTimeMillis())
//                    .folderDate(beforeYesterday)
//                    .content(page)
//                    .headers(null)
//                    .build();
//                service.send(data);
                System.out.println("page = " + page);
            });

        return super.execute(param);
    }
}
