package cn.iocoder.yudao.module.srm.tool;

import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author: wdy
 */
public class TransactionUtils {

    /**
     * 在当前事务提交成功后执行给定的 Runnable 逻辑。
     * 如果当前没有事务，则立即执行。
     *
     * @param action 待执行的逻辑
     */
    public static void runAfterCommit(Runnable action) {
        if (TransactionSynchronizationManager.isSynchronizationActive()) {
            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronization() {
                @Override
                public void afterCommit() {
                    action.run();
                }
            });
        } else {
            // 没有事务，立即执行
            action.run();
        }
    }
}
