package cn.iocoder.yudao.module.wms.service.quantity;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.mybatis.core.util.JdbcUtils;
import cn.iocoder.yudao.module.wms.controller.admin.stock.bin.vo.WmsStockBinRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.warehouse.vo.WmsWarehouseProductVO;
import cn.iocoder.yudao.module.wms.dal.dataobject.exchange.WmsExchangeDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.exchange.item.WmsExchangeItemDO;
import cn.iocoder.yudao.module.wms.enums.stock.WmsStockReason;
import cn.iocoder.yudao.module.wms.service.quantity.context.ExchangeContext;
import cn.iocoder.yudao.module.wms.service.stock.bin.WmsStockBinService;
import cn.iocoder.yudao.module.wms.service.stock.flow.WmsStockFlowService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

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
public class ExchangeSubmitExecutor extends QuantityExecutor<ExchangeContext> {

    @Resource
    @Lazy
    private WmsStockBinService stockBinService;

    @Resource
    protected WmsStockFlowService stockFlowService;

    public ExchangeSubmitExecutor() {
        super(WmsStockReason.STOCK_BIN_MOVE);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void execute(ExchangeContext context) {

        // 确认在事务内
        JdbcUtils.requireTransaction();

        // 准备需要的数据
        WmsExchangeDO exchangeDO = context.getExchangeDO();
        List<WmsExchangeItemDO> exchangeItemDOList = context.getExchangeItemDOList();
        if (CollectionUtils.isEmpty(exchangeItemDOList)) {
            throw exception(EXCHANGE_ITEM_ITEM_NOT_EXISTS);
        }

        List<WmsWarehouseProductVO> warehouseProductList = StreamX.from(exchangeItemDOList).toList(item ->
            WmsWarehouseProductVO.builder().warehouseId(exchangeDO.getWarehouseId()).productId(item.getProductId()).build());

        // 校验源库存是否充足
        List<WmsStockBinRespVO> stockBinList = stockBinService.selectStockBinList(warehouseProductList, false);

        Map<String, WmsStockBinRespVO> stockBinMap = StreamX.from(stockBinList).toMap(e -> makeStockKey(e.getBinId(), e.getProductId()));
        for (WmsExchangeItemDO itemDO : exchangeItemDOList) {

            if (itemDO.getQty() <= 0) {
                throw exception(EXCHANGE_QUANTITY_ERROR);
            }

            WmsStockBinRespVO stockBinRespVO = stockBinMap.get(makeStockKey(itemDO.getFromBinId(), itemDO.getProductId()));
            Integer availableQty = 0;
            if (stockBinRespVO != null) {
                availableQty = stockBinRespVO.getAvailableQty();
            }
            // 库存不足
            if (availableQty < itemDO.getQty()) {
                throw exception(STOCK_BIN_NOT_ENOUGH);
            }

        }
    }

    private String makeStockKey(Long binId, Long productId) {
        return binId + "-" + productId;
    }

}
