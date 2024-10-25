package com.somle.kingdee.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.somle.kingdee.model.KingDeeDetail;
import com.somle.kingdee.model.KingDeeRsp;
import com.somle.kingdee.model.KingdeeToken;
import com.somle.kingdee.repository.KingdeeTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.*;

import static com.somle.kingdee.util.SignatureUtils.*;

/**
 * @author: Wqh
 * @date: 2024/10/24 14:28
 * @Version: 1.0
 * @description:
 */
@Service
@RequiredArgsConstructor
public class KingDeeDataServiceImpl implements KingDeeDataService{
    private final RestTemplate restTemplate;
    private final KingdeeTokenRepository tokenRepository;
    @Override
    public List<KingDeeRsp> getPurchaseApplyList() {
        List<KingDeeRsp> kingDeeRspList = new ArrayList<>();
        List<KingdeeToken> allCompany = getAllCompany();
        String fullUrl = BASE_HOST + PUR_REQUEST;
        TreeMap<String, String> params = new TreeMap<>();
        String ctime = String.valueOf(System.currentTimeMillis());
        String apiSignature = getApiSignature(GET, PUR_REQUEST, params, ctime);
        for (KingdeeToken token : allCompany){
            try {
                //封装请求头
                HttpEntity<MultiValueMap<String, Object>> formEntity = new HttpEntity<>(null,getApiRestHeaders(ctime,apiSignature,token.getAppToken()));
                //请求数据
                ResponseEntity<Map> response = restTemplate.exchange(fullUrl, HttpMethod.GET, formEntity, Map.class);
                if (response.getStatusCode().is2xxSuccessful()){
                    //封装成功的数据
                    Map body = response.getBody();
                    //过滤请求体为空的数据
                    if (CollUtil.isNotEmpty(body)){
                        //将data转成JsonObject
                        JSONObject jsonObject = JSONUtil.parseObj(body.get("data"));
                        //获取总条数和总页数
                        Integer totalCount = jsonObject.getInt("count");
                        Integer totalPage = jsonObject.getInt("total_page");
                        if (totalCount <= 0){
                            //如果总条数和总页数小于等于0
                            KingDeeRsp kingDeeRsp = new KingDeeRsp();
                            kingDeeRsp.setCompanyName(token.getAccountName());
                            KingDeeDetail kingDeeDetail = new KingDeeDetail();
                            kingDeeDetail.setTotal(totalCount);
                            kingDeeDetail.setRows(jsonObject.getJSONArray("rows"));
                            kingDeeDetail.setHeaders(jsonObject.getObj("headers"));
                            kingDeeRsp.setData(kingDeeDetail);
                            kingDeeRspList.add(kingDeeRsp);
                        }else {
                            KingDeeRsp kingDeeRsp = new KingDeeRsp();
                            kingDeeRsp.setCompanyName(token.getAccountName());
                            KingDeeDetail kingDeeDetail = new KingDeeDetail();
                            kingDeeDetail.setTotal(totalCount);
                            kingDeeDetail.setHeaders(jsonObject.getObj("headers"));
                            //获取第一页的数据
                            JSONArray rows = jsonObject.getJSONArray("rows");
                            for (int i = 1; i < totalPage; i++) {
                                //拼接请求url
                                String url = fullUrl + "?page=" + i;
                                TreeMap<String, String> params1 = new TreeMap<>();
                                params1.put("page", String.valueOf(i));
                                String ctime1 = String.valueOf(System.currentTimeMillis());
                                String apiSignature1 = getApiSignature(GET, PUR_REQUEST, params1, ctime1);
                                HttpEntity<MultiValueMap<String, Object>> formEntity1 = new HttpEntity<>(null,getApiRestHeaders(ctime1,apiSignature1,token.getAppToken()));
                                //请求数据
                                ResponseEntity<Map> response1 = restTemplate.exchange(url, HttpMethod.GET, formEntity1, Map.class);
                                //封装成功的数据
                                Map body1 = response1.getBody();
                                if (CollUtil.isNotEmpty(body1)){
                                    JSONObject jsonObject1 = JSONUtil.parseObj(body1.get("data"));
                                    //获取第二页的数据
                                    JSONArray rows1 = jsonObject1.getJSONArray("rows");
                                    //合并数据
                                    rows.addAll(rows1);
                                }
                           }
                            kingDeeDetail.setRows(rows);
                            kingDeeRsp.setData(kingDeeDetail);
                            kingDeeRspList.add(kingDeeRsp);
                        }
                    }
                }else {
                    throw new RuntimeException("Failed to get app token: " + response.getStatusCode());
                }
            } catch (RuntimeException e) {
                System.err.println(token.getAccountName());
                System.err.println(e.getMessage());
            }
        }
        return kingDeeRspList;
    }

    /**
    * @Author Wqh
    * @Description 获取所有公司实体
    * @Date 9:14 2024/10/25
    * @return java.util.List<com.somle.kingdee.model.KingdeeToken>
    **/
    private List<KingdeeToken> getAllCompany() {
        return tokenRepository.findAll();
    }
}
