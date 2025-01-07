package com.somle.eccang.model.SyncLog;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class EccangInventorySyncLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 请求方法 (如: getProductInventory)
//    @Column(unique = true)  // 添加唯一约束
    private String endPoint;

    // 当前页码
    private Integer currentPage;

    // 请求状态 (成功/失败)
    private Boolean status;

    // 记录错误信息（如果请求失败）
    @Column(length = 2000)
    private String errorMessage;

    // 发起请求时间
    private LocalDateTime requestTime;

    @PrePersist
    public void generateRequestTime() {
        requestTime = LocalDateTime.now();
        status = false;
    }

    // 可选的：endpoint请求对应的返回数据总量
    private Integer totalItems;

    //起始更新时间（格式：YYYY-MM-DD）同步订单的开始更新时间
    private String updateTimeFrom;

    //结束更新时间（格式：YYYY-MM-DD）同步订单的最后更新时间
    private String updateTimeTo;

    // 标记日志完成
    private Boolean isCompleted;
}

