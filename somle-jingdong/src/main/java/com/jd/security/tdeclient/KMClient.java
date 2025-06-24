package com.jd.security.tdeclient;

import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.request.directional.JosMasterKeyGetRequest;
import com.jd.open.api.sdk.response.directional.JosMasterKeyGetResponse;
import com.jd.security.tde.InvalidTokenException;
import com.jd.security.tde.KeyRequest;
import com.jd.security.tde.KeyResponse;
import com.jd.security.tde.MKData;
import com.jd.security.tde.MKey;
import com.jd.security.tde.MalformedException;
import com.jd.security.tde.ServiceKeyInfo;
import com.jd.security.tde.Token;
import com.jd.security.tde.util.Base64;
import com.jd.security.tde.util.TDEStatus;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class KMClient {
   private static final Logger LOGGER = Logger.getLogger(KMClient.class.getName());
   private static final String emptyStr = "";
   private Token userToken;
   private CacheKeyStore cacheKs;
   private Set<String> corruptKeylist;
   private HashMap<String, Integer> availableKeylist;
   private boolean keyChainIsReady = false;
   private int majorKeyVer;
   private int majorSdkVer = 0;
   private String serverUrl;
   private String accessToken;
   private String appKey;
   private String appSecret;

   public KMClient(CacheKeyStore ks, Token t, String version, String serverUrl, String accessToken, String appKey, String appSecret) {
      this.cacheKs = ks;
      this.userToken = t;
      this.corruptKeylist = new HashSet();
      this.availableKeylist = new HashMap();
      this.majorSdkVer = Integer.parseInt(version.substring(0, 1));
      this.serverUrl = serverUrl;
      this.accessToken = accessToken;
      this.appKey = appKey;
      this.appSecret = appSecret;
      LOGGER.fine("major_sdk_version = " + this.majorSdkVer);
   }

   public int getMajorKeyVersion() {
      return this.majorKeyVer;
   }

   public boolean isKeyChainReady() {
      return this.keyChainIsReady;
   }

   public void resetKeyChainFlag() {
      this.keyChainIsReady = false;
   }

   private void checkValidKeyChain() throws NoValidKeyException {
      this.keyChainIsReady = false;
      int total_keys = this.cacheKs.numOfKeys(CacheKeyStore.KStoreType.DEC_STROE) + this.cacheKs.numOfKeys(CacheKeyStore.KStoreType.ENC_STORE);
      if (total_keys == 0) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
      } else {
         LOGGER.fine("# of enc keys:" + this.cacheKs.numOfKeys(CacheKeyStore.KStoreType.ENC_STORE) + " and # of dec keys:" + this.cacheKs.numOfKeys(CacheKeyStore.KStoreType.DEC_STROE));
         LOGGER.fine("Max key version for major service:" + this.majorKeyVer);
         this.keyChainIsReady = true;
      }
   }

   private void ImportMKeys(KeyResponse kr) throws ServiceErrorException, MalformedException, NoSuchAlgorithmException, NoValidKeyException, CorruptKeyException {
      if (!kr.getEnc_service().equals(this.userToken.get_service_name())) {
         LOGGER.severe(TDEStatus.SDK_RECEIVED_WRONG_KEYRESPONSE1.message);
         throw new ServiceErrorException(TDEStatus.SDK_RECEIVED_WRONG_KEYRESPONSE1.message);
      } else if (!kr.getTid().equals(this.userToken.get_id())) {
         LOGGER.severe(TDEStatus.SDK_RECEIVED_WRONG_KEYRESPONSE2.message);
         throw new ServiceErrorException(TDEStatus.SDK_RECEIVED_WRONG_KEYRESPONSE2.message);
      } else {
         List<String> enc_rmv_list = this.cacheKs.getKeyIDList(CacheKeyStore.KStoreType.ENC_STORE);
         List<String> dec_rmv_list = this.cacheKs.getKeyIDList(CacheKeyStore.KStoreType.DEC_STROE);
         List<ServiceKeyInfo> list = kr.getService_key_list();
         this.cacheKs.resetFutureKeyIDs();

         for(ServiceKeyInfo service : list) {
            List<MKData> mkeys = service.getKeys();
            this.availableKeylist.put(service.getService(), mkeys.size() - 1);

            for(MKData key : mkeys) {
               MKey k = new MKey(service.getService(), Base64.decode(key.getId()), Base64.decode(key.getKey_string()), key.getKey_digest(), key.getVersion(), key.getKey_effective(), key.getKey_exp(), key.getKey_type(), service.getGrant_usage(), key.getKey_status());
               if (k.isValid()) {
                  if (service.getService().equals(this.userToken.get_service_name())) {
                     this.majorKeyVer = service.getCurrent_key_version();
                     this.cacheKs.updateKey(key.getId(), k, CacheKeyStore.KStoreType.ENC_STORE);
                     this.cacheKs.updateKey(key.getId(), k, CacheKeyStore.KStoreType.DEC_STROE);
                     enc_rmv_list.remove(key.getId());
                     dec_rmv_list.remove(key.getId());
                  } else {
                     this.cacheKs.updateKey(key.getId(), k, CacheKeyStore.KStoreType.DEC_STROE);
                     dec_rmv_list.remove(key.getId());
                  }
               } else {
                  this.corruptKeylist.add(Base64.encodeToString(k.getID()));
               }
            }

            this.cacheKs.updateFutureKeyIDs(service.getService(), service.getCurrent_key_version());
         }

         this.availableKeylist.clear();
         if (enc_rmv_list.size() > 0) {
            this.cacheKs.removeKeysViaList(enc_rmv_list, CacheKeyStore.KStoreType.ENC_STORE);
         }

         if (dec_rmv_list.size() > 0) {
            this.cacheKs.removeKeysViaList(dec_rmv_list, CacheKeyStore.KStoreType.DEC_STROE);
         }

         this.sendCorruptReport();
         this.checkValidKeyChain();
      }
   }

   private void sendCorruptReport() throws CorruptKeyException {
      if (!this.corruptKeylist.isEmpty()) {
         LOGGER.severe(TDEStatus.SDK_HAS_CORRUPTED_KEYS.message);
         throw new CorruptKeyException(TDEStatus.SDK_HAS_CORRUPTED_KEYS.message);
      }
   }

   public void FetchMKeys() throws ServiceErrorException, NoValidKeyException, MalformedException, RuntimeException, InvalidTokenException, NoSuchAlgorithmException, CorruptKeyException, IOException {
      try {
         KeyResponse kr = this.requestMk();
         this.corruptKeylist.clear();
         if (kr.getStatus_code() != 0) {
            LOGGER.fine("ERR CODE:" + kr.getStatus_code());
            LOGGER.fine(kr.getStatus_message());
            if (kr.getStatus_code() == TDEStatus.TMS_REQUEST_VERIFY_FAILED.code || kr.getStatus_code() == TDEStatus.TMS_TOKEN_EXPIRE.code || kr.getStatus_code() == TDEStatus.TMS_NO_AVAILABLE_GRANTS_FOR_SERVICE.code || kr.getStatus_code() == TDEStatus.TMS_TOKEN_IS_FROZEN.code || kr.getStatus_code() == TDEStatus.TMS_TOKEN_IS_REVOKE.code || kr.getStatus_code() == TDEStatus.TMS_DB_DATA_NOTFOUND_ERROR.code) {
               this.cacheKs.removeAllMKeys();
               this.keyChainIsReady = false;
            }

            throw new ServiceErrorException(kr.getStatus_message());
         }

         this.ImportMKeys(kr);
      } catch (Exception e) {
         LOGGER.severe(e.getLocalizedMessage());
      }

   }

   private KeyResponse requestMk() {
      KeyResponse response = null;
      FetchKeyException fetchKeyException = null;
      boolean hasConn = false;

      for(int i = 0; i < 2; ++i) {
         try {
            if (hasConn) {
               break;
            }

            KeyRequest keyRequest = KeyRequest.CreateNewKeyRequest(this.userToken, this.majorSdkVer);
            JosMasterKeyGetRequest josMasterKeyGetRequest = new JosMasterKeyGetRequest();
            josMasterKeyGetRequest.setTid(keyRequest.getData().getTid());
            josMasterKeyGetRequest.setSdk_ver(String.valueOf(this.majorSdkVer));
            josMasterKeyGetRequest.setTs(String.valueOf(keyRequest.getData().getTs()));
            josMasterKeyGetRequest.setSig(keyRequest.getSig());
            JdClient jdClient = new DefaultJdClient(this.serverUrl, this.accessToken, this.appKey, this.appSecret, 3000, 3000);
            JosMasterKeyGetResponse execute = (JosMasterKeyGetResponse)jdClient.execute(josMasterKeyGetRequest);
            if (!"0".equals(execute.getCode())) {
               throw new ServiceErrorException("gw platform error ->" + execute.getMsg());
            }

            hasConn = true;
            if (execute.getResponse().getStatus_code() != 0) {
               LOGGER.warning("mkey api error ->: " + execute.getResponse().getStatus_message());
            }

            response = execute.getResponse();
            LOGGER.fine("MKey Request Success: " + keyRequest);
         } catch (Exception e) {
            LOGGER.warning("MKey Request: " + e);
            fetchKeyException = new FetchKeyException(e);
         }
      }

      if (hasConn) {
         return response;
      } else {
         throw fetchKeyException;
      }
   }
}
