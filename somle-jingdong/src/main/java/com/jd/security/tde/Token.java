package com.jd.security.tde;

import com.jd.open.api.sdk.internal.JSON.JSONMapper;
import com.jd.security.tde.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class Token implements TokenCipher, TokenSignature {
   private String label;
   private long effectiveTs;
   private long expiredTs;
   private int minutesBuffer = 600000;
   private String id;
   private byte[] key;
   private String service = "Unknown";
   private int stype;
   private boolean isVerify = false;
   private static X509Certificate scert = null;
   private String zone = "CN-0";
   private DataEncryption de;

   private static void loadCert() {
      try {
         CertificateFactory fact = CertificateFactory.getInstance("X.509");
         byte[] certbytes = "-----BEGIN CERTIFICATE-----\nMIIEcDCCA1igAwIBAgIJAKCBMSvIHNiEMA0GCSqGSIb3DQEBBQUAMIGAMQswCQYD\nVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzEPMA0G\nA1UEChMGSkQuQ09NMQwwCgYDVQQLEwNKT1MxEzARBgNVBAMTCmpvcy5qZC5jb20x\nGTAXBgkqhkiG9w0BCQEWCmpvc0BqZC5jb20wIBcNMTkwMzE1MDQ1NTM2WhgPMjA1\nOTAzMDUwNDU1MzZaMIGAMQswCQYDVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQ\nMA4GA1UEBxMHQmVpamluZzEPMA0GA1UEChMGSkQuQ09NMQwwCgYDVQQLEwNKT1Mx\nEzARBgNVBAMTCmpvcy5qZC5jb20xGTAXBgkqhkiG9w0BCQEWCmpvc0BqZC5jb20w\nggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDf9jdFbaYJLb6H/B1EEtuO\nokkjrU1taQSudZhuBlnzCiKeUjK6vYDoqGgJSzRI86slU/rkK/7o4mc8LOvmAJRv\nULWLUdM9EzI+6+M6eVLwuWnm3QMIJJl1y7dQqwnAMLl3T/P6UGP1g19R7D8LcaEw\n289Y8i/qJaVdobaM822xcW4Wv+QIldlWo6YlDoE7dfY9pXTlAkTP/GzO+LOnCzp1\n/VA3Q6Xl1Cl4Kvk0wFWnGiMEbVEZx9yEknwPV1Viq3QGjMPoEGEau6x9srCcEitC\nlllqXHOWkIVNt//qN2ubx90wjyHKZTe3HrQ/LFSIWLTeNo738iR8tFzxSfa5hitZ\nAgMBAAGjgegwgeUwHQYDVR0OBBYEFHYHDa2moq7nEccftSm3x72QBWWJMIG1BgNV\nHSMEga0wgaqAFHYHDa2moq7nEccftSm3x72QBWWJoYGGpIGDMIGAMQswCQYDVQQG\nEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzEPMA0GA1UE\nChMGSkQuQ09NMQwwCgYDVQQLEwNKT1MxEzARBgNVBAMTCmpvcy5qZC5jb20xGTAX\nBgkqhkiG9w0BCQEWCmpvc0BqZC5jb22CCQCggTEryBzYhDAMBgNVHRMEBTADAQH/\nMA0GCSqGSIb3DQEBBQUAA4IBAQAr9qLL6qkNJjtcOzYM5afdyt+KBF9iwIcKG8ca\nNUPNXwOFnOFw/JBKR4svjafvV3rSGs7ZtVMmASLUhrtStwfJJvXV7tdyqC0p44u/\nsWK6SHoTNIHX+kXbzKrkwggqeTiUlHDTw60BP/mmbrYhIwOiTNvI247iWZ4IxxyD\nbpFULv0gBfTVuc/ATWrHTI2pT78lIectDgUCpTOAhQIvE0PLK9nZjrsSCvW7tRED\nPC+6KCPYQAzxmKvRRMCHXkAVeqb/0M6GEXBIT0aYEBHKdQ7s4g1VSGrbMUL5mQsA\n+3fYhR+QEhE8PboH5kVct1V9tiMpx7kymJQKVfNufC3FIlyr\n-----END CERTIFICATE-----".getBytes();
         InputStream is = new ByteArrayInputStream(certbytes);
         scert = (X509Certificate)fact.generateCertificate(is);
         is.close();
      } catch (CertificateException var3) {
         scert = null;
      } catch (IOException var4) {
         scert = null;
      }

   }

   public Token(String label, String id, byte[] key, long effectiveTs, long expiredTs, int stype, String service, String zone) throws NoSuchAlgorithmException, InvalidKeyException {
      this.label = label;
      this.effectiveTs = effectiveTs;
      this.expiredTs = expiredTs;
      this.id = id;
      this.key = key;
      this.service = service;
      this.stype = stype;
      this.isVerify = true;
      if (zone != null) {
         this.zone = zone;
      }

      this.de = new DataEncryption(this.key);
   }

   public static Token parseFromString(String input) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, InvalidTokenException {
      Map json = (Map)JSONMapper.parseString(input, Map.class);
      String data = JSONMapper.toJSONString(json.get("data"));
      byte[] sigbytes = Base64.decode((String)((String)json.get("sig")), 2);
      Map d = (Map)json.get("data");
      String label = (String)d.get("act");
      Long startTs = (Long)d.get("effective");
      Long endTs = (Long)d.get("expired");
      String id = (String)d.get("id");
      byte[] key = Base64.decode((String)((String)d.get("key")), 2);
      String service = (String)d.get("service");
      Integer stype = (Integer)d.get("stype");
      String zone = null;
      loadCert();
      if (scert == null) {
         throw new RuntimeException("No Trust Anchor Certificate Available");
      } else {
         Signature sig = Signature.getInstance("SHA256withRSA");
         sig.initVerify(scert.getPublicKey());
         sig.update(data.getBytes());
         if (!sig.verify(sigbytes)) {
            throw new InvalidTokenException("Token Signature Validation Failed.");
         } else {
            return new Token(label, id, key, startTs, endTs, stype, service, zone);
         }
      }
   }

   public String get_id() {
      return this.id;
   }

   public String get_service_name() {
      return this.service;
   }

   public int getOriginType() {
      return this.stype;
   }

   public boolean check_effective() {
      long cur = (new Date()).getTime();
      return cur >= this.effectiveTs - (long)this.minutesBuffer;
   }

   public state check_expired(long delta) {
      long now = (new Date()).getTime();
      if (this.expiredTs >= now) {
         return state.VALID;
      } else {
         return this.expiredTs + delta >= now ? state.EXPIREWARNING : state.EXPIRED;
      }
   }

   public String getExpiredDate() {
      return (new Date(this.expiredTs)).toString();
   }

   public long getExpiredDateInLong() {
      return this.expiredTs;
   }

   public String getEffectiveDate() {
      return (new Date(this.effectiveTs)).toString();
   }

   public String getZone() {
      return this.zone;
   }

   public String getTokenOrigin() {
      String ret;
      if (this.stype >= 0 && this.stype < origin.values().length) {
         ret = origin.values()[this.stype].name();
      } else {
         ret = origin.UNDEFINED.name();
      }

      return ret;
   }

   public byte[] do_sign(byte[] input) throws InvalidTokenException, InvalidKeyException, NoSuchAlgorithmException {
      if (!this.isVerify) {
         throw new InvalidTokenException("Not a verified token.");
      } else {
         Mac se = Mac.getInstance("HmacSHA256");
         se.init(new SecretKeySpec(this.key, "HmacSHA256"));
         byte[] sig = se.doFinal(input);
         se.reset();
         return sig;
      }
   }

   public boolean do_verify(byte[] input, byte[] sig) throws InvalidTokenException, InvalidKeyException, NoSuchAlgorithmException {
      if (!this.isVerify) {
         throw new InvalidTokenException("Not a verified token.");
      } else {
         Mac se = Mac.getInstance("HmacSHA256");
         se.init(new SecretKeySpec(this.key, "HmacSHA256"));
         byte[] cal_sig = se.doFinal(input);
         se.reset();
         return Arrays.equals(sig, cal_sig);
      }
   }

   public byte[] do_encrypt(byte[] plaintext) throws BadPaddingException, InvalidKeyException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidTokenException, NoSuchPaddingException, InvalidAlgorithmParameterException {
      if (!this.isVerify) {
         throw new InvalidTokenException("Not a verified token.");
      } else {
         byte[] ct = this.de.encrypt(plaintext);
         return ct;
      }
   }

   public byte[] do_decrypt(byte[] ciphertext) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, IllegalArgumentException, NoSuchPaddingException, InvalidTokenException, IllegalBlockSizeException, BadPaddingException {
      if (!this.isVerify) {
         throw new InvalidTokenException("Not a verified token.");
      } else {
         byte[] pt = this.de.decrypt(ciphertext);
         return pt;
      }
   }

   public static enum state {
      VALID,
      EXPIREWARNING,
      EXPIRED;
   }

   static enum origin {
      UNDEFINED(0),
      IDC(1),
      BETA(2),
      DEV(3);

      int val;

      private origin(int v) {
         this.val = v;
      }
   }
}
