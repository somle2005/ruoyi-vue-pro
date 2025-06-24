package com.somle.jingdong.service;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSON;
import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.request.order.PopOrderSearchRequest;
import com.jd.open.api.sdk.request.seller.SellerVenderInfoGetRequest;
import com.jd.open.api.sdk.request.ware.SkuReadSearchSkuListRequest;
import com.jd.open.api.sdk.response.order.PopOrderSearchResponse;
import com.jd.open.api.sdk.response.seller.SellerVenderInfoGetResponse;
import com.jd.open.api.sdk.response.ware.SkuReadSearchSkuListResponse;
import com.somle.jingdong.model.JingDongAccount;
import com.somle.jingdong.model.resp.JingDongSellerVenderInfoGetResp;
import com.somle.jingdong.model.resp.JingDongShopInfoResp;
import com.somle.jingdong.model.resp.JingDongShopProductResp;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
public class JingDongClient {


    public String accessToken;
    private String TIKTOK_TOKEN_URL = "https://auth.tiktok-shops.com/api/v2/token/refresh";
    private String JINGDONG_URL = "https://api.jd.com/routerjson";
    private JingDongAccount jingDongAccount;

    public JingDongClient(JingDongAccount jingDongAccount) {
        this.jingDongAccount = jingDongAccount;
    }


    /**
     * 授权链接：https://open-oauth.jd.com/oauth2/to_login?app_key=XXXXX&response_type=code&redirect_uri=XXXXX&state=随机数&scope=snsapi_base
     * <p>
     * https://passport.jd.com/oauth/login?platform_id=1&app_id=033C242D9C89243B6F0F7B16EB103159&app_name=5Lqs5LicUE9Q5bqX6ZO65bqU55So56iL5bqP&ReturnUrl=https%3A%2F%2Fopen-oauth.jd.com%2Foauth2%2Fauthorize%3FsessionToken%3DFhZS5vUjCfcEcbpb7zLpaLAjFHUnwU4e&icon_url=http%3A%2F%2Fimg10.360buyimg.com%2Fjdoopenconsole%2Fjfs%2Ft1%2F279632%2F7%2F27553%2F24052%2F68108056F6386a9cb%2F00aa128165bc0049.png&signature=848b44d6f12b1f368a6acc8fcb31bd9dcb28d7bd&nls=0&applabel=L_APP_H5,L_APP_OAUTH_AGREEMENT_LEVEL_THREE
     * <p>
     * 参数说明：
     * <p>
     * app_key：你的应用唯一标识（必须）
     * response_type：固定填写"code"（必须）
     * redirect_uri：回调地址，必须与应用中设置的一致（必须）
     * state：随机字符串，用于防止CSRF攻击（建议）
     * scope：授权范围，填写"snsapi_base"（必须）
     * <p>
     * <p>
     * <p>
     * 换取access_token
     * https://open-oauth.jd.com/oauth2/access_token?app_key=XXXXX&app_secret=XXXXX&grant_type=authorization_code&code=XXXXX
     */

    //获取店铺信息
    @SneakyThrows
    public JingDongSellerVenderInfoGetResp getShopInfo() {
        JdClient client = new DefaultJdClient(JINGDONG_URL, jingDongAccount.getAccessToken(), jingDongAccount.getAppKey(), jingDongAccount.getAppSecret());
        SellerVenderInfoGetRequest request = new SellerVenderInfoGetRequest();
        request.setExtJsonParam("扩展参数");
        SellerVenderInfoGetResponse response = client.execute(request);
        String msg = response.getMsg();
        JingDongShopInfoResp jingDongShopInfoResp = JSON.parseObject(msg, JingDongShopInfoResp.class);
        return jingDongShopInfoResp.getJingdongSellerVenderInfoGetResponce();
    }

    @SneakyThrows
    public JingDongShopProductResp getProductInfo(Integer pageNo) {
        JdClient client = new DefaultJdClient(JINGDONG_URL, jingDongAccount.getAccessToken(), jingDongAccount.getAppKey(), jingDongAccount.getAppSecret());
        SkuReadSearchSkuListRequest request = new SkuReadSearchSkuListRequest();
        request.setPageNo(pageNo);
        request.setPageSize(50);
        request.setField("stockNum,skuName");
        SkuReadSearchSkuListResponse response = client.execute(request);
        String msg = response.getMsg();
        JingDongShopProductResp  jingDongShopProductResp = JSON.parseObject(msg, JingDongShopProductResp.class);
        return jingDongShopProductResp;
    }

    @SneakyThrows
    public List<JingDongShopProductResp.SkuItem> getAllProduct() {
        List<JingDongShopProductResp.SkuItem> data = new ArrayList<>();
        Integer pageNo = 1;
        while (true) {
            JingDongShopProductResp jingDongShopProductResp = getProductInfo(pageNo);
            List<JingDongShopProductResp.SkuItem> skuItems = jingDongShopProductResp.getJingdongSkuReadSearchSkuListResponce().getPage().getData();
            if (CollectionUtil.isEmpty(skuItems)) {
                break;
            }
            data.addAll(skuItems);
            pageNo++;
        }
        return data;
    }

    @SneakyThrows
    public void  getOrder() {
        JdClient client = new DefaultJdClient(JINGDONG_URL, jingDongAccount.getAccessToken(), jingDongAccount.getAppKey(), jingDongAccount.getAppSecret());
        PopOrderSearchRequest request=new PopOrderSearchRequest();
        request.setStartDate("2018-11-14 10:00:00");
        request.setEndDate("2025-11-22 12:00:00");
        request.setOrderState("ALL");
        request.setOptionalFields("itemInfoList,orderId,isShipmenttype,scDT,idSopShipmenttype,orderStartTime");
        request.setPage("1");
        request.setPageSize("20");
        // 1为按创建时间
        request.setDateType(1);
        PopOrderSearchResponse response=client.execute(request);
        String msg = response.getMsg();
        System.out.println(msg);
    }

}

