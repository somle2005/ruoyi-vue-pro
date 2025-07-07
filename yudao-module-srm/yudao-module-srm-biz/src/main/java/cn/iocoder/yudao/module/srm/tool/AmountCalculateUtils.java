package cn.iocoder.yudao.module.srm.tool;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.function.Function;

/**
 * 金额计算工具类，适用于采购订单、入库单、退货单等金额相关的公共逻辑
 */
public class AmountCalculateUtils {

    /**
     * 计算合计数量、商品金额、税额、折扣金额、最终金额等
     *
     * @param items           明细列表
     * @param getQty          数量getter
     * @param getTotalPrice   商品金额getter
     * @param getTax          税额getter
     * @param discountPercent 折扣率（可为null，默认0）
     * @param otherPrice      其他费用（如运费，可为null，默认0）
     * @return 结果对象
     */
    public static Result calculate(List<?> items,
                                   Function<Object, BigDecimal> getQty,
                                   Function<Object, BigDecimal> getTotalPrice,
                                   Function<Object, BigDecimal> getTax,
                                   BigDecimal discountPercent,
                                   BigDecimal otherPrice) {
        // 1. 合计数量
        BigDecimal totalCount = sum(items, getQty);
        // 2. 商品金额
        BigDecimal totalProductPrice = sum(items, getTotalPrice);
        // 3. 税额
        BigDecimal totalGrossPrice = sum(items, getTax);
        // 4. 折扣率
        BigDecimal discount = discountPercent != null ? discountPercent : BigDecimal.ZERO;
        // 5. 折扣金额（只对商品金额打折）
        BigDecimal discountPrice = totalProductPrice.multiply(discount).setScale(2, RoundingMode.HALF_UP);
        // 6. 折后商品金额
        BigDecimal netProductPrice = totalProductPrice.subtract(discountPrice);
        // 7. 其他费用
        BigDecimal other = otherPrice != null ? otherPrice : BigDecimal.ZERO;
        // 8. 最终金额 = 折后商品金额 + 税额 + 其他费用
        BigDecimal totalPrice = netProductPrice.add(totalGrossPrice).add(other).setScale(2, RoundingMode.HALF_UP);
        // 9. 返回结果
        return new Result(totalCount, totalProductPrice, totalGrossPrice, discount, discountPrice, totalPrice);
    }

    private static BigDecimal sum(List<?> items, Function<Object, BigDecimal> getter) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Object item : items) {
            BigDecimal val = getter.apply(item);
            if (val != null) {
                sum = sum.add(val);
            }
        }
        return sum;
    }

    /**
     * 结果封装
     */
    public static class Result {
        public final BigDecimal totalCount;
        public final BigDecimal totalProductPrice;
        public final BigDecimal totalGrossPrice;
        public final BigDecimal discountPercent;
        public final BigDecimal discountPrice;
        public final BigDecimal totalPrice;

        public Result(BigDecimal totalCount, BigDecimal totalProductPrice, BigDecimal totalGrossPrice,
                      BigDecimal discountPercent, BigDecimal discountPrice, BigDecimal totalPrice) {
            this.totalCount = totalCount;
            this.totalProductPrice = totalProductPrice;
            this.totalGrossPrice = totalGrossPrice;
            this.discountPercent = discountPercent;
            this.discountPrice = discountPrice;
            this.totalPrice = totalPrice;
        }
    }
} 