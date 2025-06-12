package com.somle.mediamarkt.model.resp;

import lombok.Data;

import java.util.List;

@Data
public class MediaMarktCommonInvoicesResp<T> {
    Integer total_count;
    private List<T> invoices;
}
