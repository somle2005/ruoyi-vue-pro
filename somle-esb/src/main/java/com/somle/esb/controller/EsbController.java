package com.somle.esb.controller;

import cn.iocoder.yudao.module.srm.api.supplier.SrmSupplierApi;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierDTO;
import cn.iocoder.yudao.module.srm.enums.SrmChannelEnum;
import com.somle.esb.service.EsbService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/esb")
public class EsbController {

    @Autowired
    private EsbService service;
    @Resource(name = SrmChannelEnum.SUPPLIER)
    MessageChannel purchaseOrderChannel;
    @Autowired
    private SrmSupplierApi srmSupplierApi;

    @PostMapping("/getBeans")
    public void printAllBeans() {
        service.printAllBeans();
    }



//    @PostMapping("/dataCollect")
//    public String dataCollect(LocalDate scheduleDate, String database) {
//        if (database == null) {
//            service.dataCollect(scheduleDate);
//        } else {
//            service.dataCollect(scheduleDate, Domain.fromString(database));
//        }
//        return "success";
//    }



    @PostMapping("/syncUsers")
    public String syncUsers() {
        /*ErpProductDTO a = new ErpProductDTO();
        a.setProductDeptId(50007L);
        service.handleProductsToKingdee(MessageBuilder.withPayload(List.of(a)).build());*/
        return "success";
    }

    /**
     * 同步所有供应商->金蝶
     */
    @PostMapping("/syncSuppliers")
    public String syncSuppliers() {
        List<Long> list = srmSupplierApi.getSupplierList().stream().map(SrmSupplierDTO::getId).distinct().toList();
        purchaseOrderChannel.send(MessageBuilder.withPayload(list).build());
        return "success";
    }

}