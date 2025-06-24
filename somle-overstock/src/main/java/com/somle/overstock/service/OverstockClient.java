package com.somle.overstock.service;

import cn.hutool.core.util.XmlUtil;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.overstock.model.DataBean;
import com.somle.overstock.model.OverstockOrderResVO;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.stereotype.Service;
import org.w3c.dom.Element;

import java.util.Map;

@Slf4j
@Service
public class OverstockClient {

    private OkHttpClient client = new OkHttpClient();
    //Overstock平台API请求路径
    private final String URL = "https://api.supplieroasis.com";
//    private final String URL = "https://api.test.supplieroasis.com";

    //    private final String username = "FITUEYESI";
    private final String username = "fitotus";

    private final String password = "Oos87522956*Os&";
//    private final String password = "Beyond@24!Overstock";

    @Setter
    private OkHttpClient webClient;

    public OverstockClient() {
        this.webClient = new OkHttpClient();
    }

    @SneakyThrows
    public Map<String, String> getHeaders() {
        System.out.println(username);
        return Map.of(
            "Content-Type", "application/xml",
            "Accept", "application/xml",
            "Authorization", Credentials.basic(username, password)
        );
    }

    @SneakyThrows
    public JSONObject getOrders() {
        var endpoint = "/salesorders" + "?startTime=2025-06-22" + "&endTime=2025-06-23";
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(URL + endpoint)
            .headers(getHeaders())
            .build();
        var response = WebUtils.sendRequest(request);
        var bodyString = response.body().string();
        // 将xml转换为java对象
        Element rootElement = XmlUtil.getRootElement(XmlUtil.parseXml(bodyString));
        DataBean dataBean = XmlUtil.xmlToBean(rootElement, DataBean.class);
        OverstockOrderResVO overstockOrderResVO = XmlUtil.xmlToBean(rootElement, OverstockOrderResVO.class);
//        发货代码，暂时先注释掉
//        List<OverstockOrderResVO.OrderInfoDTO> list = overstockOrderResVO.getList();
//        for (OverstockOrderResVO.OrderInfoDTO orderInfoDTO : list) {
//            postShipments(orderInfoDTO);
//        }

        return JsonUtilsX.toJSONObject(overstockOrderResVO);
    }


    @SneakyThrows
    public String postShipments(OverstockOrderResVO.OrderInfoDTO orderInfoDTO) {
        var endpoint = "/shipments";

        var requestBody = postShipmentsRequestBody(orderInfoDTO);
        //            // 请求体
        RequestBody body = RequestBody.create(requestBody, MediaType.get("text/xml; charset=utf-8"));

        // 创建请求
        Request request = new Request.Builder()
            .url(URL + endpoint) // 替换为实际的服务URL
            .post(body)
            .addHeader("Content-Type", "text/xml; charset=utf-8")
            .addHeader("Accept", "application/xml")
            .addHeader("Authorization", Credentials.basic(username, password))
            .build();
        var response = client.newCall(request).execute();
        String string = response.body().string();
        return "success";
    }

    protected String postShipmentsRequestBody(OverstockOrderResVO.OrderInfoDTO orderInfoDTO) {

        String requestBody = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
            "  <supplierShipmentMessage xmlns=\"api.supplieroasis.com\">\n" +
            "    <supplierShipment>\n" +
            "      <salesChannelName>" + orderInfoDTO.getSalesChannelName() + "</salesChannelName>\n" +
            "      <salesChannelOrderNumber>" + orderInfoDTO.getSalesChannelOrderNumber() + "</salesChannelOrderNumber>\n" +
            "      <salesChannelLineNumber>" + orderInfoDTO.getProcessedSalesOrderLine().get(0).getSalesChannelLineNumber() + "</salesChannelLineNumber>\n" +
            "      <warehouse>\n" +
            "        <code>" + orderInfoDTO.getWarehouseName().get(0).getCode() + "</code>\n" +
            "      </warehouse>\n" +
            "      <supplierShipConfirmation>\n" +
            "        <quantity>" + orderInfoDTO.getProcessedSalesOrderLine().get(0).getQuantity() + "</quantity>\n" +
//            "        <carrier>\n" +
//            "          <code>UPS</code>\n" +
//            "        </carrier>\n" +
//            "        <trackingNumber>"+orderInfoDTO.+"</trackingNumber>\n" +
//            "        <shipDate>2017-07-12T15:16:14.498-06:00</shipDate>\n" +
            "        <serviceLevel>\n" +
            "          <code>GROUND</code>\n" +
            "        </serviceLevel>\n" +
            "        </supplierShipConfirmation>\n" +
            "    </supplierShipment>\n" +
            "  </supplierShipmentMessage>";
        return requestBody;
    }

    @SneakyThrows
    private Response sendRequest(RequestX request) {
        // Define the proxy details
        return webClient.newCall(WebUtils.toOkHttp(request)).execute();
    }

}
