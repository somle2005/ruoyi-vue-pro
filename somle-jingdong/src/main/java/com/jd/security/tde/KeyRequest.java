package com.jd.security.tde;

import com.jd.open.api.sdk.internal.JSON.JSONMapper;
import com.jd.security.tde.util.Base64;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class KeyRequest {
   private KeyRequestData data;
   private String sig;

   public KeyRequestData getData() {
      return this.data;
   }

   public String getSig() {
      return this.sig;
   }

   public KeyRequest() {
   }

   private KeyRequest(Token t, int major_sdk_ver) throws InvalidTokenException, InvalidKeyException, NoSuchAlgorithmException {
      this.data = new KeyRequestData(t.get_id(), major_sdk_ver);
      this.sig = Base64.encodeToString(t.do_sign(JSONMapper.toJSONString(this.data).getBytes()));
   }

   public static KeyRequest CreateNewKeyRequest(Token t, int major_sdk_ver) throws InvalidTokenException, InvalidKeyException, NoSuchAlgorithmException {
      return new KeyRequest(t, major_sdk_ver);
   }
}
