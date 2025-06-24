package com.doudian.open.spi.demo_spi;

import com.doudian.open.core.DoudianOpSpiRequest;
import com.doudian.open.core.DoudianOpSpiResponse;
import com.doudian.open.spi.demo_spi.param.DemoSpiParam;

public class DemoSpiRequest extends DoudianOpSpiRequest<DemoSpiParam> {
    @Override
    public Class<? extends DoudianOpSpiResponse<?>> getResponseClass() {
        return DemoSpiResponse.class;
    }

    public static DemoSpiRequest wrap(Object config) {
        DemoSpiRequest ret = new DemoSpiRequest();
        ret.initWithConfig(config);
        return ret;
    }
}
