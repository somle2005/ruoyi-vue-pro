package cn.iocoder.yudao.module.oms.api.enums;

public enum OmsTenantId {
    DEFAULT(50001L);

    private final long id;

    OmsTenantId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}