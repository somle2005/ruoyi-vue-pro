package com.somle.overstock.controller;


import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import com.somle.overstock.service.OverstockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/overstock")
public class OverstockController {
    @Autowired
    OverstockService service;

    @GetMapping("/orders")
    public JSONObject orders() {
        return service.client.getOrders();
    }
}