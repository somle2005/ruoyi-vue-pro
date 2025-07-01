package com.somle.lingxing.model.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LingXingOutboundOrderDetailReq {

        /**
         * 出库单号列表 (多个以英文逗号分割)
         */
        private List<String> outboundOrderNoList;

        /**
         * 三方单号列表 (多个以英文逗号分割)
         */
        private List<String> thirdOrderNoList;

        /**
         * 参考单号列表 (多个以英文逗号分割)
         */
        private List<String> referOrderNoList;
}