package com.somle.eccang.controller;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.ObjUtil;
import com.somle.eccang.model.EccangOrderVO;
import com.somle.eccang.model.EccangResponse.BizContent;
import com.somle.eccang.model.EccangProduct;
import com.somle.eccang.service.EccangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/eccang")
public class EccangController {
    @Autowired 
    EccangService eccangService;

    @GetMapping("/getInventory")
    public List<BizContent> getInventory(
    ) {
        return eccangService.getInventory().toList();
    }

    @GetMapping("/getInventoryBatchLog")
    public List<BizContent> getInventoryBatchLog( 
        @RequestParam String startTime,
        @RequestParam String endTime
    ) {
        return eccangService.getInventoryBatchLog(LocalDateTime.parse(startTime), LocalDateTime.parse(endTime)).toList();
    }

//    @GetMapping("/getOrderShip")
//    public List<BizContent> getOrderShip(
//            @RequestParam String startTime,
//            @RequestParam String endTime
//    ) {
//        return eccangService.getOrderShipPage(LocalDateTime.parse(startTime), LocalDateTime.parse(endTime)).toList();
//    }

    @GetMapping("/getOrder")
    public List<BizContent> getOrder(
        @RequestParam EccangOrderVO order
    ) {
        return eccangService.getOrderPages(order).toList();
    }

    @GetMapping("/getProducts")
    public Object getProducts() {
        Stream<EccangProduct> products = eccangService.getProducts();
        System.err.println(products);
        if (ObjUtil.isEmpty(products)){
            return "暂无数据";
        }
        return products.toList();
    }



    @GetMapping("/list")
    public BizContent list(
        @RequestParam String endpoint
    ) {
        return eccangService.list(endpoint);
    }

    // @GetMapping("/listPage")
    // @ResponseBody
    // public List<BizContent> listPage(
    //     @RequestParam String endpoint
    // ) {
    //     return eccangService.listPage(endpoint).toList();
    // }

    @GetMapping("/post")
    public BizContent post(
        @RequestParam String endpoint,
        @RequestBody Object payload
    ) {
        return eccangService.post(endpoint, payload);
    }

}