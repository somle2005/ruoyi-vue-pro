package com.doudian.open;

import com.doudian.open.api.token.AccessTokenData;
import com.doudian.open.api.token.AccessTokenRequest;
import com.doudian.open.api.token.AccessTokenResponse;
import com.doudian.open.core.*;

import com.doudian.open.spi.demo_spi.DemoSpiRequest;
import com.doudian.open.spi.demo_spi.DemoSpiResponse;
import com.doudian.open.spi.demo_spi.data.DemoSpiData;
import com.doudian.open.spi.demo_spi.param.DemoSpiParam;
import com.doudian.open.utils.JsonUtil;
import jakarta.servlet.http.HttpServletRequest;

import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Example {

    static {
        GlobalConfig.initAppKey("xxxxxxxxxxxxx");
        GlobalConfig.initAppSecret("xxxxxxxxxxxxxxxx");
    }

    /**
     * ===================SPI使用说明===================
     * SDK会根据接口名称自动生成对应的Request和Response实体类，
     * 开发者对接时只需像Request里注册业务处理handler，SDK会自
     * 动完成签名计算和校验逻辑
     *
     * 假设需要实现的SPI为：demo/spi GET，以Spring MVC为例：
     */
    //@RequestMapping(path = "demo/spi", method = {RequestMethod.GET})
    //@ResponseBody
    public String demoSpi(HttpServletRequest httpServletRequest) {
        return DoudianOpSpi.config(DemoSpiRequest.class, bizHandler, httpServletRequest).responseJson();
    }

    public void demoApi() {
        GlobalConfig.initAppKey("xxxxxxxxxxxxx");
        GlobalConfig.initAppSecret("xxxxxxxxxxxxxxxx");
        AccessToken accessToken= AccessTokenBuilder.parse("xxxxxxxxxx", "123123");

    }

    /**
     * 定义bizHandler，bizHandler用来处理接收到服务器请求之后，
     * 需要处理的业务逻辑，SDK会将服务器下发的业务参数（param_json）
     * 封装成对应的Param类实例，并放入DoudianOpSpiContext中，开发
     * 者可以通过context获取封装好的数据。SDK也会将需要返回的数据封
     * 装成Data类实例，开发者可以通过context.getData()获取该实例，
     * 并设置其中的字段，最终返回给开放平台服务器。
     *
     * 在本示例中（demo/spi），Param对象为 DemoSpiParam，Data对象
     * 为 DemoSpiData
     */
    private final DoudianOpSpiBizHandler bizHandler = new DoudianOpSpiBizHandler() {
        @Override
        public void handle(DoudianOpSpiContext context) {

            // 1. 获取入参对象
            DemoSpiParam param = context.getParam();

            // 2. 业务处理逻辑
            // ...

            // 3. 设置data数据(可选)
            DemoSpiData data = context.getData();
            // data.setXXX()

            // 4. 设置处理结果（成功还是失败，二选一）
            // a.处理成功
            context.wrapSuccess();
            // b. 处理失败
            context.wrapError(100002L, "系统错误");
        }
    };

}


