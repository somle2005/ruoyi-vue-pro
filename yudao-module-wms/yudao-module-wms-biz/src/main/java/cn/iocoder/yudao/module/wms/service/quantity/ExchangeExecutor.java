package cn.iocoder.yudao.module.wms.service.quantity;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.mybatis.core.util.JdbcUtils;
import cn.iocoder.yudao.module.wms.controller.admin.stock.bin.vo.WmsStockBinRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.warehouse.vo.WmsWarehouseProductVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.exchange.WmsExchangeDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.exchange.defective.WmsExchangeDefectiveDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.bin.WmsStockBinDO;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockFlowDirection;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockReason;
import cn.iocoder.yudao.module.wms.service.exchange.WmsExchangeService;
import cn.iocoder.yudao.module.wms.service.quantity.context.ExchangeContext;
import cn.iocoder.yudao.module.wms.service.stock.bin.WmsStockBinService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.wms.enums.WmsErrorCodeConstants.*;

/**
 * @author: LeeFJ
 * @date: 2025/3/25 9:34
 * @description: 库位移动数量执行器
 */
@Slf4j
@Component
public class ExchangeExecutor extends QuantityExecutor<ExchangeContext> {



    @Resource
    @Lazy
    private WmsStockBinService stockBinService;

    @Resource
    @Lazy
    private WmsExchangeService exchangeService;

    public ExchangeExecutor() {
        super(WmsStockReason.STOCK_BIN_MOVE);
    }



    @Override
    public void execute(ExchangeContext context) {

        // 确认在事务内
        JdbcUtils.requireTransaction();

        // 准备需要的数据
        WmsExchangeDO exchangeDO = context.getExchangeDO();
        List<WmsExchangeDefectiveDO> exchangeDefectiveDOList = context.getExchangeDefectiveDOList();
        if(CollectionUtils.isEmpty(exchangeDefectiveDOList)) {
            throw exception(EXCHANGE_DEFECTIVE_ITEM_NOT_EXISTS);
        }

        List<WmsWarehouseProductVO> warehouseProductList = StreamX.from(exchangeDefectiveDOList).toList(item->{
            return WmsWarehouseProductVO.builder().warehouseId(exchangeDO.getWarehouseId()).productId(item.getProductId()).build();
        });

        // 校验源库存是否充足
        List<WmsStockBinRespVO> stockBinList = stockBinService.selectStockBinList(warehouseProductList, false);

        Map<String,WmsStockBinRespVO> stockBinMap = StreamX.from(stockBinList).toMap(e-> makeStockKey(e.getBinId(),e.getProductId()));
        for (WmsExchangeDefectiveDO defectiveDO : exchangeDefectiveDOList) {

            if(defectiveDO.getQty()<=0) {
                throw exception(EXCHANGE_QUANTITY_ERROR);
            }

            WmsStockBinRespVO stockBinRespVO= stockBinMap.get(makeStockKey(defectiveDO.getFromBinId(),defectiveDO.getProductId()));
            Integer availableQty = 0;
            if(stockBinRespVO!=null) {
                availableQty = stockBinRespVO.getAvailableQty();
            }
            // 库存不足
            if(availableQty<defectiveDO.getQty()) {
                throw exception(STOCK_BIN_NOT_ENOUGH);
            }

        }


        // 逐行处理
        for (WmsExchangeDefectiveDO defectiveDO : exchangeDefectiveDOList) {
            WmsStockBinRespVO fromStockBin = stockBinMap.get(makeStockKey(defectiveDO.getFromBinId(),defectiveDO.getProductId()));
            WmsStockBinRespVO toStockBin = stockBinMap.get(makeStockKey(defectiveDO.getToBinId(),defectiveDO.getProductId()));
            this.processStockBin(exchangeDO.getWarehouseId(),defectiveDO,fromStockBin,toStockBin);
        }

        // 完成库位移动
        exchangeService.finishExchange(exchangeDO,exchangeDefectiveDOList);

    }



    /**
     * 处理仓位库存
     **/
    private void processStockBin(Long warehouseId,WmsExchangeDefectiveDO defectiveDO,WmsStockBinRespVO fromStockBinVO,WmsStockBinRespVO toStockBinVO) {

        JdbcUtils.requireTransaction();

        // 处理出方
        WmsStockBinDO fromStockBinDO = BeanUtils.toBean(fromStockBinVO,WmsStockBinDO.class);
        //


        fromStockBinDO.setAvailableQty(fromStockBinDO.getAvailableQty()-defectiveDO.getQty());
        if(fromStockBinDO.getAvailableQty()<0) {
            throw exception(STOCK_BIN_NOT_ENOUGH);
        }
        //
        fromStockBinDO.setSellableQty(fromStockBinDO.getSellableQty()-defectiveDO.getQty());
        if(fromStockBinDO.getSellableQty()<0) {
            throw exception(STOCK_BIN_NOT_ENOUGH);
        }
        // 保存
        stockBinService.insertOrUpdate(fromStockBinDO);
        // 记录流水
        stockFlowService.createForStockBin(this.getReason(), WmsStockFlowDirection.OUT, defectiveDO.getProductId(), fromStockBinDO , defectiveDO.getQty(), defectiveDO.getExchangeId(), defectiveDO.getId(),null);


        // 入方
        WmsStockBinDO toStockBinDO = stockBinService.getStockBin(defectiveDO.getToBinId(),defectiveDO.getProductId(), true);
        // 可用库存
        toStockBinDO.setAvailableQty(toStockBinDO.getAvailableQty() + defectiveDO.getQty());
        // 可售库存
        toStockBinDO.setSellableQty(toStockBinDO.getSellableQty() + defectiveDO.getQty());
        // 保存
        stockBinService.insertOrUpdate(toStockBinDO);
        // 记录流水
        stockFlowService.createForStockBin(this.getReason(),WmsStockFlowDirection.IN, defectiveDO.getProductId(),toStockBinDO , defectiveDO.getQty(), defectiveDO.getExchangeId(), defectiveDO.getId(),null);
    }


    private String makeStockKey(Long binId,Long productId) {
        return binId+"-"+productId;
    }



}
