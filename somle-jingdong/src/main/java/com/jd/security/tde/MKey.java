package com.jd.security.tde;

import com.jd.security.tde.util.Base64;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class MKey {
   private String service_identifier;
   private byte[] id;
   private byte[] key;
   private int ver;
   private Constants.key_usage key_usage;
   private Constants.key_status key_status;
   private Constants.key_type key_type;
   private SecretKeySpec skey;
   private long expired;
   private long effective;
   private boolean isValid;
   private String key_digest;

   public MKey(String service, byte[] kid, byte[] key, String kdigest, int kver, long effective_ts, long exp_ts, String ktype, String kusage, int kstatus) throws MalformedException, NoSuchAlgorithmException {
      if (kid != null && service != null) {
         this.service_identifier = service;
         this.id = kid;
         this.ver = kver;
         if (kver < -1) {
            throw new MalformedException("Invalid key version.");
         } else {
            this.key_usage = Constants.key_usage.fromValue(kusage);
            this.key_status = Constants.key_status.fromValue(kstatus);
            this.key_type = Constants.key_type.fromValue(ktype);
            this.isValid = false;
            if (key != null) {
               this.key = key;
               this.expired = exp_ts;
               this.effective = effective_ts;
               this.skey = new SecretKeySpec(this.key, 0, 16, this.key_type.toString());
            }

            this.key_digest = kdigest;
            String digest = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(this.key));
            if (digest.equals(this.key_digest)) {
               this.isValid = true;
            }

         }
      } else {
         throw new MalformedException("ID and App fields cannot be null.");
      }
   }

   public boolean isValid() {
      return this.isValid;
   }

   public String getName() {
      return this.service_identifier;
   }

   public int getVersion() {
      return this.ver;
   }

   public byte[] getID() {
      return this.id;
   }

   public long getExpiredTime() {
      return this.expired;
   }

   public long getEffectiveTime() {
      return this.effective;
   }

   public Constants.key_type getKeyType() {
      return this.key_type;
   }

   public Constants.key_status getKeyStatus() {
      return this.key_status;
   }

   public Constants.key_usage getKeyUsage() {
      return this.key_usage;
   }

   public byte[] encrypt(byte[] pt) throws NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
      byte[] cipher = KeyEncryption.encrypt(this, pt);
      ByteBuffer b = ByteBuffer.allocate(2 + this.id.length + cipher.length);
      b.put(Constants.cipher_type.WEAK.id);
      b.put(Constants.algo_type.AES_CBC_128.id);
      b.put(this.id);
      b.put(cipher);
      return b.array();
   }

   public byte[] decrypt(byte[] ct) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, MalformedException {
      ByteBuffer b = ByteBuffer.wrap(ct);
      byte ciphertype = b.get();
      if (Constants.cipher_type.fromValue(ciphertype) != Constants.cipher_type.WEAK) {
         throw new MalformedException("Unmatch CipherText Type.");
      } else {
         byte atype = b.get();
         if (Constants.algo_type.fromValue(atype) != Constants.algo_type.AES_CBC_128) {
            throw new MalformedException("Unmatch Encryption Algorithm Type:" + atype);
         } else {
            byte[] eid = new byte[16];
            b.get(eid);
            if (!Arrays.equals(this.id, eid)) {
               throw new MalformedException("Unmatch MKey ID.");
            } else {
               byte[] cipher = new byte[ct.length - b.position()];
               b.get(cipher);
               byte[] pt = KeyEncryption.decrypt(this, cipher);
               return pt;
            }
         }
      }
   }

   public SecretKeySpec getKey() {
      return this.skey;
   }

   public byte[] getRawKey() {
      return this.key;
   }
}
