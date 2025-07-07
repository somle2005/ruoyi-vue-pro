package cn.iocoder.yudao.module.srm.service.purchase.impl.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author wdy
 */
@Slf4j
@Service
public class SupplierProductAsyncUpdateService {

    @Async
    public void asyncUpdate() {
        // 执行慢操作，如发 MQ、记录审计、调用远程接口等
    }
}
