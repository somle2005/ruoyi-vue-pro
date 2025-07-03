package cn.iocoder.yudao.framework.common.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Schema(description = "分页结果（含汇总）")
@Data
public final class PageResultSummary<T, S> implements Serializable {

    @Schema(description = "数据列表", requiredMode = Schema.RequiredMode.REQUIRED)
    private List<T> list;

    @Schema(description = "总数量", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long total;

    @Schema(description = "汇总信息", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    private S summary;

    public PageResultSummary() {
    }

    public PageResultSummary(List<T> list, Long total) {
        this.list = list;
        this.total = total;
    }

    public PageResultSummary(List<T> list, Long total, S summary) {
        this.list = list;
        this.total = total;
        this.summary = summary;
    }

    public PageResultSummary(Long total) {
        this.list = new ArrayList<>();
        this.total = total;
    }

    public static <T, S> PageResultSummary<T, S> empty() {
        return new PageResultSummary<>(0L);
    }

    public static <T, S> PageResultSummary<T, S> empty(Long total) {
        return new PageResultSummary<>(total);
    }
}
