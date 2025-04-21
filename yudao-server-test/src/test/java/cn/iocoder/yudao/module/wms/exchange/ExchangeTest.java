package cn.iocoder.yudao.module.wms.exchange;

import cn.hutool.core.lang.Assert;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.wms.controller.admin.exchange.defective.vo.WmsExchangeDefectiveRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.exchange.defective.vo.WmsExchangeDefectiveSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.exchange.vo.WmsExchangeRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.exchange.vo.WmsExchangeSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.bin.vo.WmsStockBinRespVO;
import cn.iocoder.yudao.module.wms.enums.exchange.WmsExchangeType;
import cn.iocoder.yudao.test.BaseRestIntegrationTest;
import cn.iocoder.yudao.test.Profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @author: LeeFJ
 * @date: 2025/4/18 9:56
 * @description:
 */
public class ExchangeTest extends BaseRestIntegrationTest {

    private final Long warehouseId = 32L;

    public void testExchange() {

        Map<Long, WmsExchangeDefectiveSaveReqVO> defectiveDOMap = generateDefectiveMap();

        WmsExchangeRespVO exchangeVO = createAndUpdate(defectiveDOMap);

        submit(exchangeVO);

        agree(exchangeVO);

        System.out.println();

    }


    private void agree(WmsExchangeRespVO exchangeVO) {

        Map<Long,Integer> fromBinQtyBeforeMap = new HashMap<>();
        Map<Long,Integer> toBinQtyBeforeMap = new HashMap<>();
        for (WmsExchangeDefectiveRespVO defectiveRespVO : exchangeVO.getDefectiveList()) {
            //
            CommonResult<List<WmsStockBinRespVO>> stockBinResult = this.wms().stockBinClient().getStockBin(exchangeVO.getWarehouseId(), defectiveRespVO.getFromBinId(), defectiveRespVO.getProductId());
            fromBinQtyBeforeMap.put(defectiveRespVO.getProductId(), stockBinResult.getData().get(0).getAvailableQty());
            //
            stockBinResult = this.wms().stockBinClient().getStockBin(exchangeVO.getWarehouseId(), defectiveRespVO.getToBinId(), defectiveRespVO.getProductId());
            if(stockBinResult.getData().isEmpty()) {
                toBinQtyBeforeMap.put(defectiveRespVO.getProductId(),0);
            } else {
                toBinQtyBeforeMap.put(defectiveRespVO.getProductId(), stockBinResult.getData().get(0).getAvailableQty());
            }
        }


        this.wms().exchangeClient().agree(exchangeVO.getId());

        Map<Long,Integer> fromBinQtyAfterMap = new HashMap<>();
        Map<Long,Integer> toBinQtyAfterMap = new HashMap<>();
        for (WmsExchangeDefectiveRespVO defectiveRespVO : exchangeVO.getDefectiveList()) {
            //
            CommonResult<List<WmsStockBinRespVO>> stockBinResult = this.wms().stockBinClient().getStockBin(exchangeVO.getWarehouseId(), defectiveRespVO.getFromBinId(), defectiveRespVO.getProductId());
            fromBinQtyAfterMap.put(defectiveRespVO.getProductId(), stockBinResult.getData().get(0).getAvailableQty());

            //
            stockBinResult = this.wms().stockBinClient().getStockBin(exchangeVO.getWarehouseId(), defectiveRespVO.getToBinId(), defectiveRespVO.getProductId());
            if(stockBinResult.getData().isEmpty()) {
                toBinQtyAfterMap.put(defectiveRespVO.getProductId(),0);
            } else {
                toBinQtyAfterMap.put(defectiveRespVO.getProductId(), stockBinResult.getData().get(0).getAvailableQty());
            }
        }


        // 出方库存校验
        for (WmsExchangeDefectiveRespVO defectiveRespVO : exchangeVO.getDefectiveList()) {
            // 出方库存校验
            Integer fromBinQtyBefore = fromBinQtyBeforeMap.get(defectiveRespVO.getProductId());
            Integer fromBinQtyAfter = fromBinQtyAfterMap.get(defectiveRespVO.getProductId());
            Assert.equals(fromBinQtyBefore-defectiveRespVO.getQty(),fromBinQtyAfter);

            // 入方库存校验
            Integer toBinQtyBefore = toBinQtyBeforeMap.get(defectiveRespVO.getProductId());
            Integer toBinQtyAfter = toBinQtyAfterMap.get(defectiveRespVO.getProductId());
            Assert.equals(toBinQtyBefore+defectiveRespVO.getQty(),toBinQtyAfter);
        }





    }


    private void submit(WmsExchangeRespVO exchangeVO) {
        this.wms().exchangeClient().submit(exchangeVO.getId());
    }


    private WmsExchangeRespVO createAndUpdate(Map<Long, WmsExchangeDefectiveSaveReqVO> defectiveDOMap) {

        WmsExchangeSaveReqVO saveReqVO = new WmsExchangeSaveReqVO();
        saveReqVO.setWarehouseId(warehouseId);
        saveReqVO.setType(WmsExchangeType.TO_DEFECTIVE.getValue());
        saveReqVO.setDefectiveList(new ArrayList<>(defectiveDOMap.values()));

        CommonResult<Long> exchangeCreateResult = this.wms().exchangeClient().createExchange(saveReqVO);

        CommonResult<WmsExchangeRespVO> exchangeGetResult = this.wms().exchangeClient().getExchange(exchangeCreateResult.getData());

        saveReqVO = BeanUtils.toBean(exchangeGetResult.getData(), WmsExchangeSaveReqVO.class);
        this.wms().exchangeClient().updateExchange(saveReqVO);

        return this.wms().exchangeClient().getExchange(exchangeCreateResult.getData()).getData();

    }

    /**
     *
     **/
    private Map<Long, WmsExchangeDefectiveSaveReqVO> generateDefectiveMap() {

        Map<Long, WmsExchangeDefectiveSaveReqVO> map = new HashMap<>();

        CommonResult<PageResult<WmsStockBinRespVO>> binListResult = this.wms().stockBinClient().getStockBinPage(this.warehouseId);
        List<WmsStockBinRespVO> allStockBinList = binListResult.getData().getList();
        List<WmsStockBinRespVO> validBinList = allStockBinList.stream().filter(e -> e.getSellableQty() > 0 && e.getAvailableQty() > 0).toList();

        Random random = new Random();
        Integer itemCount = random.nextInt(validBinList.size());
        if(itemCount<4) {
            itemCount=4;
        }
        itemCount=2;

        Set<Long> binIds = new HashSet<>();
        Integer index=-1;
        Integer loops=0;
        for (int i = 0; i < itemCount; i++) {


            // 获得 fromBin
            Long binId = null;
            WmsStockBinRespVO fromBin = null;
            loops=0;
            while (true) {
                loops++;
                if(loops>64) {
                    throw new RuntimeException("循环次数过多");
                }
                index = random.nextInt(validBinList.size());
                binId = validBinList.get(index).getBinId();
                if (binIds.contains(binId)) {
                    continue;
                }
                binIds.add(binId);
                fromBin = validBinList.get(index);
                break;
            }


            WmsExchangeDefectiveSaveReqVO itemVO=new WmsExchangeDefectiveSaveReqVO();

            itemVO.setProductId(fromBin.getProductId());
            itemVO.setFromBinId(fromBin.getBinId());

            // 设置数量
            Integer qty = 0;
            loops=0;
            if(fromBin.getSellableQty()<=3) {
                qty = 1;
            } else {
                while (qty == 0) {
                    loops++;
                    if (loops > 64) {
                        throw new RuntimeException("循环次数过多");
                    }
                    qty = random.nextInt(fromBin.getSellableQty());
                }
            }
            itemVO.setQty(qty);

            WmsStockBinRespVO toBin = null;
            loops=0;
            while (true) {
                loops++;
                if(loops>64) {
                    throw new RuntimeException("循环次数过多");
                }
                index = random.nextInt(allStockBinList.size());
                binId = allStockBinList.get(index).getBinId();
                if (binIds.contains(binId)) {
                    continue;
                }
                binIds.add(binId);
                toBin = allStockBinList.get(index);
                break;
            }

            itemVO.setToBinId(toBin.getBinId());

            map.put(binId, itemVO);

        }

        return map;
    }


    public static void main(String[] args) {
        ExchangeTest wmsInventoryTest = new ExchangeTest();
        wmsInventoryTest.setProfile(Profile.LOCAL);
        wmsInventoryTest.testExchange();
    }

}
