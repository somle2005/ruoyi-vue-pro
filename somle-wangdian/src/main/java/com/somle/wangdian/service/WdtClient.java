package com.somle.wangdian.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import com.somle.wangdian.model.WangdianTradeReqVO;
import com.somle.wangdian.model.resp.WangdianTradeRespVO;
import com.somle.wangdian.model.resp.WangdianProductResp;
import com.somle.wangdian.model.resp.WangdianShopResp;
import com.somle.wangdian.utils.WebUtils;
import lombok.SneakyThrows;

public class WdtClient {
	
	private String appkey;
	private String appsecret;
	private String sid;
	private final String baseUrl = "http://api.wangdian.cn/openapi2/";
	
	private int connectTimeout = 3000;//3秒
	private int readTimeout = 15000;//15秒
	
	public WdtClient(String sid, String appkey, String appsecret)
	{
		this.sid = sid;
		this.appkey = appkey;
		this.appsecret = appsecret;
	}
	
	public void setTimeout(int connectTimeout, int readTimeout)
	{
		this.connectTimeout = connectTimeout;
		this.readTimeout = readTimeout;
	}
	
	private static String getStringFromException(Throwable e) {
		String result = "";
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(bos);
		e.printStackTrace(ps);
		try {
			result = bos.toString("UTF-8");
		} catch (IOException ioe) {
		}
		return result;
	}
	
	private static byte[] encryptMD5(String data) throws IOException {
		byte[] bytes = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			bytes = md.digest(data.getBytes("UTF-8"));
		} catch (GeneralSecurityException gse) {
			String msg = getStringFromException(gse);
			throw new IOException(msg);
		}
		return bytes;
	}
	
	private static String byte2hex(byte[] bytes) {
		StringBuilder sign = new StringBuilder();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(bytes[i] & 0xFF);
			if (hex.length() == 1) {
				//保证所有的16进制都是两位：00-ff，其中[80~ff]代表[-128,-1]
				sign.append("0");
			}
			sign.append(hex);
		}
		return sign.toString();
	}
	
	/**
	 * 给TOP请求签名。
	 * 
	 * @param requestHolder 所有字符型的TOP请求参数
	 * @param secret 签名密钥
	 * @return 签名
	 * @throws IOException 
	 */
	public static String signRequest(Map<String, String> params, String appsecret) throws IOException {
		// 第一步：检查参数是否已经排序
		String[] keys = params.keySet().toArray(new String[0]);
		Arrays.sort(keys);

		// 第二步：把所有参数名和参数值串在一起
		StringBuilder query = new StringBuilder();
		for (String key : keys) {
			if("sign".equals(key))
				continue;
			
			if(query.length() > 0)
				query.append(';');
			
			int len = key.length();
			query.append(String.format("%02d", len)).append('-').append(key).append(':');
			
			String value = params.get(key);
			
			len = value.length();
			query.append(String.format("%04d", len)).append('-').append(value);
			
		}
		
		query.append(appsecret);
		
		// 第三步：使用MD5加密
		byte[] bytes = encryptMD5(query.toString());

		// 第四步：把二进制转化为大写的十六进制
		return byte2hex(bytes);
	}



	public String execute(String relativeUrl, Map<String, String> params) throws IOException {
		
		params.put("appkey", this.appkey);
		params.put("sid", this.sid);
		params.put("timestamp", Long.toString(System.currentTimeMillis()/1000));
		
		params.put("sign", signRequest(params, this.appsecret));
		
		return WebUtils.doPost(this.baseUrl + relativeUrl, params, "UTF-8", connectTimeout, readTimeout, null);
		
	}

	@SneakyThrows
	public JSONObject execute(String relativeUrl, Object reqVO) {

		var responseString = execute(relativeUrl, JsonUtilsX.toStringMap(reqVO));

		return JsonUtilsX.parseObject(responseString, JSONObject.class);

	}

	@SneakyThrows
	public List<WangdianShopResp.Shop> getShopInfo() {
		String result = execute("shop.php", new HashMap<>());
		WangdianShopResp wangdianShopResp = JsonUtilsX.parseObject(result, WangdianShopResp.class);
		List<WangdianShopResp.Shop> shoplist = wangdianShopResp.getShoplist();
		return shoplist;
	}

	@SneakyThrows
	public WangdianProductResp getProduct(LocalDateTime startTime, LocalDateTime endTime,Integer pageNo){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		HashMap params = new HashMap();
		params.put("start_time", startTime.format(formatter));
		params.put("end_time", endTime.format(formatter));
		params.put("page_no", String.valueOf(pageNo));
		params.put("page_size", "100");
//		String result = execute("goods_query.php", params);
		String result = execute("vip_api_goods_query.php", params);
		WangdianProductResp wangdianProductResp = JSONUtil.toBean(result, WangdianProductResp.class);
		return wangdianProductResp;
	}

	@SneakyThrows
	public List<WangdianProductResp.Goods>  getAllProduct(){
		List<WangdianProductResp.Goods> data = new ArrayList<>();
		LocalDateTime endTime = LocalDateTime.now().minusMinutes(1);
		while (true) {
			LocalDateTime startTime = endTime.minusDays(30);
			int pageNo = 0;
			List<WangdianProductResp.Goods> temp = new ArrayList<>();
			while (true) {
				WangdianProductResp wangdianProductResp = getProduct(startTime, endTime,pageNo);
				if (wangdianProductResp.getTotalCount() == 0) {
					break;
				}
				temp.addAll(wangdianProductResp.getGoodsList());
				pageNo++;
			}
			if (temp.size() == 0) {
				break;
			}
			data.addAll(temp);
			endTime = startTime;
		}
		return data;
	}

	@SneakyThrows
	public WangdianTradeRespVO getOrder(LocalDateTime startTime, LocalDateTime endTime,Integer pageNo){
		var reqVO = WangdianTradeReqVO.builder()
			.startTime(startTime)
			.endTime(endTime)
			.pageSize(100)
			.pageNo(pageNo)
			.build();
		String result = String.valueOf(execute("trade_query.php", reqVO));
		WangdianTradeRespVO wangdianTradeRespVO = JSONUtil.toBean(result, WangdianTradeRespVO.class);
		return wangdianTradeRespVO;
	}

	@SneakyThrows
	public  List<WangdianTradeRespVO.TradeVO> getAllOrder(LocalDateTime startTime, LocalDateTime endTime) {
		List<WangdianTradeRespVO.TradeVO> data = new ArrayList<>();
		Integer pageNo = 0;
		LocalDateTime endTimeTemp = startTime;
		while (endTimeTemp.isBefore(endTime)) {
			endTimeTemp = endTimeTemp.plusHours(1);
			List<WangdianTradeRespVO.TradeVO> tempOrder = new ArrayList<>();
			while (true) {
				WangdianTradeRespVO wangdianTradeRespVO = getOrder(startTime, endTimeTemp,pageNo);
				if (wangdianTradeRespVO.getTotalCount() == 0) {
					break;
				}
				tempOrder.addAll(wangdianTradeRespVO.getTrades());
				pageNo++;
			}

			if (CollUtil.isNotEmpty(tempOrder)) {
				data.addAll(tempOrder);
			}
			startTime = endTimeTemp;
		}
		return data;
	}
}
