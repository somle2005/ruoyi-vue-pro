package com.somle.eccang.service;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Service;
import java.io.ByteArrayInputStream;
import java.io.IOException;


@Slf4j
@Service
public class EccangWMSService {

    private final OkHttpClient client = new OkHttpClient();

    private final String appToken = "d35dc26b31f2c0e94afe32c8236001d5";

    private final String appKey = "2a098b65c598bc02f432ab1f238a9a70";

    private final String url = "http://somle.yunwms.com/default/svc/web-service";

    public JSONObject getSpecialOrdersList() throws IOException, DocumentException {

       //请求报文 xml格式
        String serviceMethod = "getSpecialOrdersList";
        String requestBody =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                        "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.example.org/Ec/\">\n" +
                        "    <SOAP-ENV:Body>\n" +
                        "        <ns1:callService>\n" +
                        "            <paramsJson>{\"pageSize\":\"20\",\"page\":\"1\"}</paramsJson>\n" +
                        "            <appToken>" + appToken + "</appToken>\n" +
                        "            <appKey>" + appKey +"</appKey>\n" +
                        "            <service>" + serviceMethod + "</service>\n" +
                        "        </ns1:callService>\n" +
                        "    </SOAP-ENV:Body>\n" +
                        "</SOAP-ENV:Envelope>";

        // 请求体
        RequestBody body = RequestBody.create(requestBody, MediaType.get("text/xml; charset=utf-8"));

        // 创建请求
        Request request = new Request.Builder()
                .url(url) // 替换为实际的服务URL
                .post(body)
                .addHeader("Content-Type", "text/xml; charset=utf-8")
                .build();

        // 发送请求
        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
            // 输出响应结果
            String responseBody = response.body().string();
            // 创建一个Dom4J框架提供的解析器对象
            SAXReader saxReader = new SAXReader();
            //2.使用saxReader对象把需要解析的XML文件读成一个Document对象。
            Document document = saxReader.read(new ByteArrayInputStream(responseBody.getBytes()));
            // 3、获得根元素对象
            Element root = document.getRootElement();

            // 获取<reponse>标签中的内容，即返回结果
            String responseText = root.elements().get(0).elements().get(0).elements().get(0).getText();
            JSONObject result = JSONObject.parseObject(responseText);
            return result;
        }
    }

}
