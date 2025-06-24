package com.doudian.open.core.material;

import com.doudian.open.api.materialgw.upload.BinaryMaterialUploadParam;
import com.doudian.open.api.materialgw.upload.BinaryMaterialUploadResponseWrapper;
import com.doudian.open.core.AccessToken;

import java.util.concurrent.Future;

public interface BinaryMaterialUploadExecutor {

    BinaryMaterialUploadResponseWrapper execute(BinaryMaterialUploadParam t, AccessToken accessToken);

    Future<BinaryMaterialUploadResponseWrapper> asyncExecute(BinaryMaterialUploadParam t, AccessToken accessToken);
}
