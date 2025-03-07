package com.somle.esb.job;


import com.somle.eccang.model.reps.EccangStpoListNewRespVO;
import com.somle.eccang.model.req.EccangStpoListNewReqVo;
import com.somle.esb.model.OssData;
import org.springframework.stereotype.Component;


/**
 * @className: EccangGetStpoListNewDataJob
 * @author: gumaomao
 * @date: 2025/02/28
 * @Version: 1.0
 * @description: 获取海外仓头程单(待发货)上传到数仓
 */
@Component
public class EccangStpoListNewDataJob extends EccangDataJob{

    @Override
    public String execute(String param) throws Exception {
       setDate(param);
       eccangService.getStpoListNew(EccangStpoListNewReqVo.builder()
                .dateFor(beforeYesterday.toString())
                .dateTo(yesterday.toString())
                .build()).forEach(
                        eccangStpoListNewRespVO -> {
                        var data = OssData.builder()
                        .database(DATABASE)
                        .tableName("stpo_list_new")
                        .syncType("inc")
                        .requestTimestamp(System.currentTimeMillis())
                        .folderDate(today)
                        .content(eccangStpoListNewRespVO)
                        .headers(null)
                        .build();
                        service.send(data);
                        });
        return "data upload success";
    }
}

