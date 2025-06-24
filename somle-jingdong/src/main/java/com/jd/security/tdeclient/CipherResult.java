package com.jd.security.tdeclient;

public class CipherResult {
   public ResultType status;
   public byte[] keyid;
   public boolean isstrong;

   public CipherResult(ResultType st, byte[] keyID, boolean isStrong) {
      this.keyid = keyID;
      this.status = st;
      this.isstrong = isStrong;
   }

   public static enum ResultType {
      Decryptable,
      Malformed,
      Feasible,
      UnDecryptable;
   }
}
