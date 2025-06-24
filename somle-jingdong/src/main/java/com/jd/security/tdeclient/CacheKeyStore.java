package com.jd.security.tdeclient;

import com.jd.security.tde.KeyDerivation;
import com.jd.security.tde.MKey;
import com.jd.security.tde.MalformedException;
import com.jd.security.tde.util.Base64;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CacheKeyStore {
   private ConcurrentHashMap<String, MKey> encKeystore = new ConcurrentHashMap();
   private ConcurrentHashMap<String, MKey> decKeystore = new ConcurrentHashMap();
   private Set<String> futureKeyIds = new HashSet();
   private static final int tvalue = 3;

   public MKey searchDecKey(byte[] mkIndex) {
      return (MKey)this.decKeystore.get(Base64.encodeToString(mkIndex));
   }

   public int numOfKeys(KStoreType t) {
      return t.equals(KStoreType.ENC_STORE) ? this.encKeystore.size() : this.decKeystore.size();
   }

   public MKey getEnckeyByVersion(int keyVer) {
      for(Map.Entry<String, MKey> entry : this.encKeystore.entrySet()) {
         MKey key = (MKey)entry.getValue();
         if (key.getVersion() == keyVer) {
            return key;
         }
      }

      return null;
   }

   public void updateKey(String b64Index, MKey k, KStoreType t) {
      if (t.equals(KStoreType.ENC_STORE)) {
         if (!this.encKeystore.containsKey(b64Index)) {
            this.encKeystore.put(b64Index, k);
         } else if (((MKey)this.encKeystore.get(b64Index)).getKeyStatus() != k.getKeyStatus()) {
            this.encKeystore.put(b64Index, k);
         }
      } else if (!this.decKeystore.containsKey(b64Index)) {
         this.decKeystore.put(b64Index, k);
      } else if (((MKey)this.decKeystore.get(b64Index)).getKeyStatus() != k.getKeyStatus()) {
         this.decKeystore.put(b64Index, k);
      }

   }

   public void removeAllMKeys() {
      this.encKeystore.clear();
      this.decKeystore.clear();
   }

   public void removeKeysViaList(List<String> target, KStoreType t) {
      for(String id : target) {
         if (t.equals(KStoreType.ENC_STORE)) {
            this.encKeystore.remove(id);
         } else {
            this.decKeystore.remove(id);
         }
      }

   }

   public List<String> getKeyIDList(KStoreType t) {
      return t.equals(KStoreType.ENC_STORE) ? Collections.list(this.encKeystore.keys()) : Collections.list(this.decKeystore.keys());
   }

   public void resetFutureKeyIDs() {
      this.futureKeyIds.clear();
   }

   public void updateFutureKeyIDs(String service, int maxVer) throws NoSuchAlgorithmException, MalformedException {
      int sindex = maxVer + 1;

      for(int i = sindex; i < sindex + 3; ++i) {
         this.futureKeyIds.add(Base64.encodeToString(KeyDerivation.keyid(service, i)));
      }

   }

   public boolean hasFutureKeyID(byte[] keyid) {
      return this.futureKeyIds.contains(Base64.encodeToString(keyid));
   }

   public static enum KStoreType {
      ENC_STORE,
      DEC_STROE;
   }
}
