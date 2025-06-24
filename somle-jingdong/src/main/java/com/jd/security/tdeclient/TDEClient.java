package com.jd.security.tdeclient;

import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.internal.util.StringUtil;
import com.jd.open.api.sdk.request.directional.JosVoucherInfoGetRequest;
import com.jd.open.api.sdk.response.directional.JosVoucherInfoGetResponse;
import com.jd.security.tde.Constants;
import com.jd.security.tde.IndexCalculator;
import com.jd.security.tde.InvalidKeyPermission;
import com.jd.security.tde.InvalidTokenException;
import com.jd.security.tde.KeyEncryption;
import com.jd.security.tde.MKey;
import com.jd.security.tde.MalformedException;
import com.jd.security.tde.RequestVoucherException;
import com.jd.security.tde.Token;
import com.jd.security.tde.xsalsa20;
import com.jd.security.tde.util.Base64;
import com.jd.security.tde.util.TDEStatus;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class TDEClient {
   private static final Logger LOGGER = Logger.getLogger(TDEClient.class.getName());
   private static String version = "2.1.0";
   private final String emptyStr = "";
   private final byte[] salt = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   private final byte[] keyWordsalt = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
   private final CipherResult malformedCipher;
   private final CipherResult undecryptedCipher;
   private CacheKeyStore cache_ks;
   private Token t;
   private KMClient kmc;
   private String serverUrl;
   private String accessToken;
   private String appKey;
   private String appSecret;
   private long[] statistic;
   private static final char[] hexArray;

   public static String bytesToHex(byte[] bytes) {
      char[] hexChars = new char[bytes.length * 2];

      for(int j = 0; j < bytes.length; ++j) {
         int v = bytes[j] & 255;
         hexChars[j * 2] = hexArray[v >>> 4];
         hexChars[j * 2 + 1] = hexArray[v & 15];
      }

      return new String(hexChars);
   }

   private TDEClient(String serverUrl, String accessToken, String appKey, String appSecret) throws NoSuchAlgorithmException, SignatureException, InvalidTokenException, MalformedException, InvalidKeyException, ServiceErrorException, NoValidKeyException {
      this.malformedCipher = new CipherResult(CipherResult.ResultType.Malformed, (byte[])null, false);
      this.undecryptedCipher = new CipherResult(CipherResult.ResultType.UnDecryptable, (byte[])null, false);
      this.kmc = null;
      this.statistic = null;
      LOGGER.fine("Create client with a given new token string.");
      this.accessToken = accessToken;
      this.appKey = appKey;
      this.serverUrl = serverUrl;
      this.appSecret = appSecret;
      this.InitClient(serverUrl, accessToken, appKey, appSecret);
   }

   public static TDEClient getInstance(DefaultJdClient jdClient) throws NoSuchAlgorithmException, SignatureException, InvalidTokenException, MalformedException, InvalidKeyException, ServiceErrorException, NoValidKeyException {
      return new TDEClient(jdClient.getRequestUrl(), jdClient.getAccessToken(), jdClient.getAppKey(), jdClient.getAppSecret());
   }

   public static TDEClient getInstance(String serverUrl, String accessToken, String appKey, String appSecret) throws NoSuchAlgorithmException, SignatureException, InvalidTokenException, MalformedException, InvalidKeyException, ServiceErrorException, NoValidKeyException {
      return new TDEClient(serverUrl, accessToken, appKey, appSecret);
   }

   public static String getSDKVer() {
      return version;
   }

   private void InitClient(String serverUrl, String accessToken, String appKey, String appSecret) throws NoSuchAlgorithmException, SignatureException, InvalidTokenException, MalformedException, RuntimeException, InvalidKeyException, ServiceErrorException, NoValidKeyException {
      try {
         String token_str = this.requestVoucher(serverUrl, accessToken, appKey, appSecret);
         if (StringUtil.isEmpty(token_str)) {
            LOGGER.warning("TDE getInstance Request Voucher is null,accessToken = " + accessToken);
            throw new RuntimeException("Request Voucher is null");
         } else {
            this.t = Token.parseFromString(new String(Base64.decode(token_str)));
            LOGGER.info("Token ID:" + this.t.get_id() + ", its origin from " + this.t.getTokenOrigin());
            this.cache_ks = new CacheKeyStore();
            this.kmc = new KMClient(this.cache_ks, this.t, version, serverUrl, accessToken, appKey, appSecret);
            LOGGER.fine("IDC setting..");
            this.statistic = new long[4];
            this.kmc.FetchMKeys();
            if (!this.kmc.isKeyChainReady()) {
               throw new RuntimeException(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
            }
         }
      } catch (NoSuchAlgorithmException e) {
         LOGGER.severe(e.getLocalizedMessage());
         throw new NoSuchAlgorithmException(e.getLocalizedMessage());
      } catch (InvalidKeyException e) {
         LOGGER.severe(e.getLocalizedMessage());
         throw new InvalidKeyException(e.getLocalizedMessage());
      } catch (SignatureException e) {
         LOGGER.severe(e.getLocalizedMessage());
         throw new SignatureException(e.getLocalizedMessage());
      } catch (InvalidTokenException e) {
         LOGGER.severe(e.getLocalizedMessage());
         throw new InvalidTokenException(e.getLocalizedMessage());
      } catch (MalformedException e) {
         LOGGER.severe(e.getLocalizedMessage());
         throw new MalformedException(e.getLocalizedMessage());
      } catch (ServiceErrorException e) {
         throw new ServiceErrorException(e.getLocalizedMessage());
      } catch (NoValidKeyException e) {
         throw new NoValidKeyException(e.getLocalizedMessage());
      } catch (RuntimeException e) {
         LOGGER.severe(e.getLocalizedMessage());
         throw new RuntimeException(e.getLocalizedMessage());
      } catch (Exception e) {
         LOGGER.severe(e.getLocalizedMessage());
         throw new RuntimeException(e.getLocalizedMessage());
      }
   }

   private void validate_token() throws InvalidTokenException {
      if (!this.t.check_effective()) {
         LOGGER.severe("Please use this token after " + this.t.getEffectiveDate());
         throw new InvalidTokenException(TDEStatus.SDK_USE_INEFFECTIVE_TOKEN.message);
      } else {
         Token.state state = this.t.check_expired(2592000000L);
         if (state == Token.state.EXPIRED) {
            LOGGER.severe("Please apply for a new token online. The current token is already expired for more than 30 days.");
            throw new InvalidTokenException(TDEStatus.SDK_USE_HARD_EXPIRED_TOKEN.message);
         } else {
            if (state == Token.state.EXPIREWARNING) {
               LOGGER.warning("Token is already expired but less than 30 days. We still allow it to be operated.");
               LOGGER.warning("Token expired date:" + this.t.getExpiredDate());
            }

         }
      }
   }

   public String obtainWildCardKeyWordIndex(String spt) throws NoValidKeyException, IndexCalculateException {
      spt = IndexCalculationHelper.formatPlaintext(spt);
      MKey k0 = this.cache_ks.getEnckeyByVersion(0);
      if (k0 == null) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
      } else {
         try {
            byte[] key = KeyEncryption.wrap(k0, this.keyWordsalt);
            byte[] nonce = Arrays.copyOf(key, 24);
            byte[] pt = spt.getBytes("UTF-8");
            if (pt.length != spt.length()) {
               throw new Exception("plaintext format does not match!");
            } else {
               byte[] ct = new byte[pt.length];
               xsalsa20.crypto_stream_xor(ct, 0, pt, (long)pt.length, nonce, key);
               return bytesToHex(ct);
            }
         } catch (Exception e) {
            throw new IndexCalculateException(e.getClass().getSimpleName() + ":" + e.getMessage());
         }
      }
   }

   public String calculateWildCardKeyWord(String queryW) throws NoValidKeyException, IndexCalculateException {
      queryW = IndexCalculationHelper.formatQueryKeyword(queryW);
      MKey k0 = this.cache_ks.getEnckeyByVersion(0);
      if (k0 == null) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
      } else {
         try {
            byte[] key = KeyEncryption.wrap(k0, this.keyWordsalt);
            byte[] nonce = Arrays.copyOf(key, 24);
            byte[] pt = queryW.getBytes("UTF-8");
            if (pt.length != queryW.length()) {
               throw new Exception("keyword string contains non-ASCII character.");
            } else {
               byte[] ct = new byte[pt.length];
               xsalsa20.crypto_stream_xor(ct, 0, pt, (long)pt.length, nonce, key);
               int skip = 0;

               for(int i = 0; i < queryW.length(); ++i) {
                  if (queryW.charAt(i) == '*') {
                     ++skip;
                  }
               }

               if (skip == queryW.length()) {
                  throw new Exception("keyword format does not match!");
               } else {
                  return bytesToHex(Arrays.copyOfRange(ct, skip, ct.length));
               }
            }
         } catch (Exception e) {
            throw new IndexCalculateException(e.getClass().getSimpleName() + ":" + e.getMessage());
         }
      }
   }

   public String calculateWildCardKeyWord(String keyword, int asciiCharPrefixNumber) throws NoValidKeyException, IndexCalculateException {
      return this.calculateWildCardKeyWord(keyword, asciiCharPrefixNumber, 0);
   }

   public String calculateWildCardKeyWord(String keyword, int asciiCharPrefixNumber, int nonAsciiCharPrefixNumber) throws NoValidKeyException, IndexCalculateException {
      String queryW = IndexCalculationHelper.generateWildcardKeyword(keyword, asciiCharPrefixNumber, nonAsciiCharPrefixNumber);
      return this.calculateWildCardKeyWord(queryW);
   }

   public String obtainKeyWordIndex(String spt) throws NoValidKeyException, IndexCalculateException {
      MKey k0 = this.cache_ks.getEnckeyByVersion(0);
      if (k0 == null) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
      } else {
         try {
            byte[] key = KeyEncryption.wrap(k0, this.keyWordsalt);
            byte[] nonce = Arrays.copyOf(key, 24);
            int ret = 0;
            byte[] ct = new byte[spt.length() * 4];
            int offset = 0;
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < spt.length(); ++i) {
               byte[] wpt = spt.substring(i, i + 1).getBytes("UTF-8");
               if (wpt.length < 4) {
                  int padOffset = Math.abs(wpt[0]) % (key.length - 8);
                  int padSize = 4 - wpt.length;
                  wpt = Arrays.copyOf(wpt, 4);
                  System.arraycopy(key, 4 + padOffset, wpt, wpt.length - padSize, padSize);
               }

               xsalsa20.crypto_stream_xor(ct, offset, wpt, 4L, nonce, key);
               sb.append(Base64.encodeToString(Arrays.copyOfRange(ct, offset, offset + 4)).replace("==", ""));
               offset += 4;
            }

            return sb.toString();
         } catch (Exception e) {
            throw new IndexCalculateException(e.getClass().getSimpleName() + ":" + e.getMessage());
         }
      }
   }

   public String calculateKeyWord(String queryW) throws NoValidKeyException, IndexCalculateException {
      MKey k0 = this.cache_ks.getEnckeyByVersion(0);
      if (k0 == null) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
      } else {
         try {
            byte[] key = KeyEncryption.wrap(k0, this.keyWordsalt);
            byte[] nonce = Arrays.copyOf(key, 24);
            byte[] ct = new byte[queryW.length() * 4];
            int offset = 0;
            int ret = 0;
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < queryW.length(); ++i) {
               byte[] wpt = queryW.substring(i, i + 1).getBytes("UTF-8");
               if (wpt.length < 4) {
                  int padOffset = Math.abs(wpt[0]) % (key.length - 8);
                  int padSize = 4 - wpt.length;
                  wpt = Arrays.copyOf(wpt, 4);
                  System.arraycopy(key, 4 + padOffset, wpt, wpt.length - padSize, padSize);
               }

               xsalsa20.crypto_stream_xor(ct, offset, wpt, 4L, nonce, key);
               sb.append(Base64.encodeToString(Arrays.copyOfRange(ct, offset, offset + 4)).replace("==", ""));
               offset += 4;
            }

            return sb.toString();
         } catch (Exception e) {
            throw new IndexCalculateException(e.getClass().getSimpleName() + ":" + e.getMessage());
         }
      }
   }

   public byte[] calculateIndex(byte[] pt) throws NoValidKeyException, IndexCalculateException {
      MKey k0 = this.cache_ks.getEnckeyByVersion(0);
      if (k0 == null) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
      } else {
         byte[] index = null;

         try {
            byte[] compute_salt = KeyEncryption.wrap(k0, this.salt);
            index = IndexCalculator.sha256Index(pt, compute_salt);
            return index;
         } catch (Exception e) {
            throw new IndexCalculateException(e.getClass().getSimpleName() + ":" + e.getMessage());
         }
      }
   }

   public String calculateStringIndex(byte[] pt) throws NoValidKeyException, IndexCalculateException {
      MKey k0 = this.cache_ks.getEnckeyByVersion(0);
      if (k0 == null) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_AVAILABLE_KEYS.message);
      } else {
         byte[] index = null;

         try {
            byte[] compute_salt = KeyEncryption.wrap(k0, this.salt);
            index = IndexCalculator.sha256Index(pt, compute_salt);
         } catch (Exception e) {
            throw new IndexCalculateException(e.getClass().getSimpleName() + ":" + e.getMessage());
         }

         return Base64.encodeToString(index);
      }
   }

   public void manually_deletekeys() {
      this.cache_ks.removeAllMKeys();
      this.kmc.resetKeyChainFlag();
   }

   public boolean isKeyCacheReady() {
      return this.kmc.isKeyChainReady();
   }

   private void check_key_status_forEncryption(MKey k) throws NoValidKeyException, InvalidKeyException, InvalidKeyPermission {
      if (k == null) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_AVAILABLE_ENC_KEYS.message);
         int var5 = Math.toIntExact(this.statistic[2]++);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_AVAILABLE_ENC_KEYS.message);
      } else if (k.getKeyStatus() != Constants.key_status.ACTIVE) {
         LOGGER.severe(TDEStatus.SDK_OPERATE_WITH_INACTIVE_KEYS.message);
         int var4 = Math.toIntExact(this.statistic[2]++);
         throw new InvalidKeyException(TDEStatus.SDK_OPERATE_WITH_INACTIVE_KEYS.message);
      } else if (k.getKeyUsage() != Constants.key_usage.N && k.getKeyUsage() != Constants.key_usage.D) {
         long now = (new Date()).getTime();
         if (k.getExpiredTime() < now) {
            LOGGER.fine(TDEStatus.SDK_OPERATE_WITH_EXPIRED_KEYS.message);
         }

      } else {
         int var10002 = Math.toIntExact(this.statistic[2]++);
         throw new InvalidKeyPermission("Key Permission Invalid.");
      }
   }

   private void check_key_status_forDecryption(MKey k) throws NoValidKeyException, InvalidKeyException, InvalidKeyPermission {
      if (k == null) {
         LOGGER.severe(TDEStatus.SDK_HAS_NO_CORRESPONDING_DEC_KEYS.message);
         int var5 = Math.toIntExact(this.statistic[3]++);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_CORRESPONDING_DEC_KEYS.message);
      } else if (k.getKeyStatus() == Constants.key_status.REVOKED) {
         LOGGER.severe(TDEStatus.SDK_OPERATE_WITH_INACTIVE_KEYS.message);
         int var4 = Math.toIntExact(this.statistic[3]++);
         throw new InvalidKeyException(TDEStatus.SDK_OPERATE_WITH_INACTIVE_KEYS.message);
      } else if (k.getKeyUsage() != Constants.key_usage.N && k.getKeyUsage() != Constants.key_usage.E) {
         long now = (new Date()).getTime();
         if (k.getExpiredTime() < now) {
            LOGGER.fine(TDEStatus.SDK_OPERATE_WITH_EXPIRED_KEYS.message);
         }

      } else {
         int var10002 = Math.toIntExact(this.statistic[3]++);
         throw new InvalidKeyPermission("Key Permission Invalid.");
      }
   }

   public String encryptString(String pt) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, NoValidKeyException, InvalidKeyPermission, InvalidTokenException, MalformedException, ServiceErrorException, UnsupportedEncodingException, CorruptKeyException {
      byte[] ct = this.encrypt(pt.getBytes("UTF-8"));
      return Base64.encodeToString(ct);
   }

   public String encryptString(String pt, String encoding) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, NoValidKeyException, InvalidKeyPermission, InvalidTokenException, MalformedException, ServiceErrorException, UnsupportedEncodingException, CorruptKeyException {
      byte[] ct = this.encrypt(pt.getBytes(encoding));
      return Base64.encodeToString(ct);
   }

   public String decryptString(String base64ct, String encoding) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, MalformedException, IllegalArgumentException, InvalidAlgorithmParameterException, NoValidKeyException, InvalidKeyPermission, InvalidTokenException, ServiceErrorException, CorruptKeyException, IOException {
      try {
         byte[] decrypt = this.decrypt(base64ct);
         return new String(decrypt, encoding);
      } catch (Exception e) {
         LOGGER.warning(e.getLocalizedMessage() + ", Exception: " + e);
         return base64ct;
      }
   }

   public String decryptString(String base64ct) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, MalformedException, IllegalArgumentException, InvalidAlgorithmParameterException, NoValidKeyException, InvalidKeyPermission, InvalidTokenException, ServiceErrorException, CorruptKeyException, IOException {
      return this.decryptString(base64ct, "UTF-8");
   }

   public byte[] decrypt(String base64ct) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, MalformedException, IllegalArgumentException, InvalidAlgorithmParameterException, NoValidKeyException, InvalidKeyPermission, InvalidTokenException, ServiceErrorException, CorruptKeyException, IOException {
      byte[] decoded = this.base64Decode(base64ct);
      byte[] decrypt = this.decrypt(decoded);
      if (decoded == decrypt) {
         throw new RuntimeException("decrypt failed");
      } else {
         return decrypt;
      }
   }

   private byte[] base64Decode(String base64) {
      String base64Pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
      if (Pattern.matches(base64Pattern, base64)) {
         return Base64.decode(base64);
      } else {
         throw new RuntimeException(base64 + " is not base64");
      }
   }

   public byte[] encrypt(byte[] pt) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidAlgorithmParameterException, MalformedException, NoValidKeyException, InvalidKeyPermission, InvalidTokenException, ServiceErrorException {
      this.validate_token();
      MKey k = this.cache_ks.getEnckeyByVersion(this.kmc.getMajorKeyVersion());
      this.check_key_status_forEncryption(k);
      LOGGER.fine("Encrypt with key version: " + k.getVersion());

      byte[] ct;
      try {
         ct = k.encrypt(pt);
      } catch (InvalidAlgorithmParameterException e) {
         int var7 = Math.toIntExact(this.statistic[2]++);
         throw e;
      } catch (InvalidKeyException e) {
         int var10002 = Math.toIntExact(this.statistic[2]++);
         throw e;
      }

      int var8 = Math.toIntExact(this.statistic[0]++);
      return ct;
   }

   public CipherResult getCipherResult(byte[] ct) {
      try {
         byte ctype = ct[0];
         boolean flag = false;
         if (Constants.cipher_type.fromValue(ctype) == Constants.cipher_type.LARGE || Constants.cipher_type.fromValue(ctype) == Constants.cipher_type.REGULAR) {
            flag = true;
         }

         byte[] mkIdx = extractKeyId(ct, flag);
         if (mkIdx == null) {
            return this.malformedCipher;
         } else if (this.cache_ks.searchDecKey(mkIdx) != null) {
            return new CipherResult(CipherResult.ResultType.Decryptable, mkIdx, flag);
         } else {
            return this.cache_ks.hasFutureKeyID(mkIdx) ? new CipherResult(CipherResult.ResultType.Feasible, mkIdx, flag) : this.undecryptedCipher;
         }
      } catch (Exception var5) {
         return this.malformedCipher;
      }
   }

   public CipherResult getCipherResult(String base64ct) {
      try {
         CipherResult ret = this.getCipherResult(Base64.decode(base64ct));
         return ret;
      } catch (Exception var4) {
         return this.malformedCipher;
      }
   }

   public static boolean isEncryptData(byte[] ct) {
      try {
         byte ctype = ct[0];
         boolean flag = false;
         if (Constants.cipher_type.fromValue(ctype) == Constants.cipher_type.LARGE || Constants.cipher_type.fromValue(ctype) == Constants.cipher_type.REGULAR) {
            flag = true;
         }

         byte[] mkIdx = extractKeyId(ct, flag);
         if (mkIdx != null && mkIdx.length > 0) {
            return true;
         }
      } catch (Exception var4) {
      }

      return false;
   }

   public static boolean isEncryptData(String base64ct) {
      try {
         if (Base64.isBase64Value(base64ct)) {
            return isEncryptData(Base64.decode(base64ct));
         }
      } catch (Exception var2) {
      }

      return false;
   }

   public byte[] decrypt(byte[] ct) throws IOException, CorruptKeyException, NoSuchAlgorithmException, NoValidKeyException, InvalidKeyException, InvalidTokenException, InvalidAlgorithmParameterException, NoSuchPaddingException, BadPaddingException, ServiceErrorException, MalformedException, IllegalBlockSizeException, InvalidKeyPermission {
      try {
         return isEncryptData(ct) ? this.decrypt0(ct) : ct;
      } catch (Exception var3) {
         return ct;
      }
   }

   private byte[] decrypt0(byte[] ct) throws NoSuchPaddingException, InvalidKeyException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, MalformedException, InvalidAlgorithmParameterException, NoValidKeyException, InvalidKeyPermission, InvalidTokenException, ServiceErrorException, CorruptKeyException, IOException {
      this.validate_token();
      CipherResult st = this.getCipherResult(ct);
      if (st.status.equals(CipherResult.ResultType.UnDecryptable)) {
         int var18 = Math.toIntExact(this.statistic[3]++);
         throw new NoValidKeyException(TDEStatus.SDK_HAS_NO_CORRESPONDING_DEC_KEYS.message);
      } else {
         if (st.status.equals(CipherResult.ResultType.Feasible)) {
            LOGGER.fine("Feasible case: KMS client needs to fetch keys from KMS.");
            this.kmc.FetchMKeys();
            if (this.cache_ks.hasFutureKeyID(st.keyid)) {
               int var10002 = Math.toIntExact(this.statistic[3]++);
               throw new NoValidKeyException(TDEStatus.SDK_FAILS_TO_FETCH_UPDATED_KEYS.message);
            }
         } else if (st.status.equals(CipherResult.ResultType.Malformed)) {
            int var17 = Math.toIntExact(this.statistic[3]++);
            throw new MalformedException(TDEStatus.SDK_HAS_CORRUPTED_CIPHER.message);
         }

         MKey k = this.cache_ks.searchDecKey(st.keyid);
         LOGGER.fine("Decrypt with key version: " + k.getVersion());
         this.check_key_status_forDecryption(k);

         byte[] pt;
         try {
            pt = k.decrypt(ct);
         } catch (InvalidAlgorithmParameterException e) {
            int var15 = Math.toIntExact(this.statistic[3]++);
            throw e;
         } catch (InvalidKeyException e) {
            int var14 = Math.toIntExact(this.statistic[3]++);
            throw e;
         } catch (IllegalBlockSizeException e) {
            int var13 = Math.toIntExact(this.statistic[3]++);
            throw e;
         } catch (BadPaddingException e) {
            int var12 = Math.toIntExact(this.statistic[3]++);
            throw e;
         } catch (MalformedException e) {
            int var11 = Math.toIntExact(this.statistic[3]++);
            throw e;
         }

         int var16 = Math.toIntExact(this.statistic[1]++);
         return pt;
      }
   }

   private static byte[] extractKeyId(byte[] ct, boolean isStrong) {
      ByteBuffer b = ByteBuffer.wrap(ct);
      b.get();
      byte[] eid;
      if (isStrong) {
         short eidLen = b.getShort();
         eid = new byte[eidLen];
         if (ct.length - 3 < eidLen) {
            return null;
         }

         b.get(eid);
      } else {
         b.get();
         if (ct.length - 2 < 16) {
            return null;
         }

         eid = new byte[16];
         b.get(eid);
      }

      return eid;
   }

   public static String generateCustomerToken(long userId, String appKey) {
      return "_" + userId + "_" + appKey;
   }

   public String requestVoucher(String serverUrl, String accessToken, String appKey, String appSecret) {
      String voucher = null;
      RequestVoucherException requestVoucherException = null;
      boolean hasConn = false;
      JosVoucherInfoGetRequest josVoucherInfoGetRequest = new JosVoucherInfoGetRequest();
      JdClient jdClient;
      if (accessToken != null && accessToken.startsWith("_")) {
         String customerUserId = accessToken.substring(1, accessToken.lastIndexOf("_"));
         if (!StringUtil.isDigits(customerUserId)) {
            throw new IllegalArgumentException("token invalid");
         }

         josVoucherInfoGetRequest.setCustomerUserId(Long.valueOf(customerUserId));
         jdClient = new DefaultJdClient(serverUrl, (String)null, appKey, appSecret, 3000, 3000);
      } else {
         jdClient = new DefaultJdClient(serverUrl, accessToken, appKey, appSecret, 3000, 3000);
      }

      for(int i = 0; i < 2; ++i) {
         try {
            if (hasConn) {
               break;
            }

            JosVoucherInfoGetResponse execute = (JosVoucherInfoGetResponse)jdClient.execute(josVoucherInfoGetRequest);
            if (!"0".equals(execute.getCode())) {
               throw new ServiceErrorException("gw platform error -> " + execute.getMsg());
            }

            hasConn = true;
            if (!"0".equals(execute.getResponse().getErrorCode())) {
               LOGGER.warning("voucher api error -> " + execute.getResponse().getErrorMsg());
               requestVoucherException = new RequestVoucherException(execute.getResponse().getErrorMsg());
            } else {
               voucher = execute.getResponse().getData().getVoucher();
            }
         } catch (Exception e) {
            LOGGER.warning("Voucher Request error: " + e);
            requestVoucherException = new RequestVoucherException(e);
         }
      }

      if (requestVoucherException == null) {
         return voucher;
      } else {
         throw requestVoucherException;
      }
   }

   public long[] getStatistic() {
      long[] tmp = Arrays.copyOf(this.statistic, this.statistic.length);
      Arrays.fill(this.statistic, 0L);
      return tmp;
   }

   public String getServiceIdentifier() {
      String service = "Unknown Service";
      if (this.t != null) {
         service = this.t.get_service_name();
      }

      return service;
   }

   public String getServerUrl() {
      return this.serverUrl;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public String getAppKey() {
      return this.appKey;
   }

   public String getAppSecret() {
      return this.appSecret;
   }

   static {
      try {
         Package p = TDEClient.class.getPackage();
         String v = p.getImplementationVersion();
         if (v != null) {
            version = version + "-" + v.substring(0, 12) + "-java";
         }
      } catch (Exception var2) {
      }

      hexArray = "0123456789ABCDEF".toCharArray();
   }

   public static enum CipherStatus {
      Decryptable,
      Malformed,
      Feasible,
      UnDecryptable;
   }
}
