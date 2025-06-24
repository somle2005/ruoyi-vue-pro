package com.jd.open.api.sdk.request;

import com.jd.open.api.sdk.FileItem;
import com.jd.open.api.sdk.response.AbstractResponse;
import java.util.Map;

public interface JdUploadRequest<T extends AbstractResponse> extends JdRequest<T> {
   Map<String, FileItem> getFileParams();
}
