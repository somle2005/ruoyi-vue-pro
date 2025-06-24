package com.jd.security.tde;

public class Constants {
   public static final String MD5SIGN = "md5";
   public static final String HMACMD5 = "hmacmd5";
   public static final String HMACSHA256 = "hmacsha256";
   public static final String default_kdf_algo = "HmacSHA256";
   public static final String default_kid_algo = "MD5";
   public static final String default_certdigest_algo = "SHA-256";
   public static final String default_token_sign_algo = "HmacSHA256";
   public static final String default_token_verify_algo = "SHA256withRSA";
   public static final int default_dkey_len = 16;
   public static final int default_keyid_len = 16;
   public static final int default_cipherblk_len = 16;
   public static final int min_salt_len = 16;
   public static final int http_timeout = 5000;
   public static final int http_retry_count = 2;
   public static final long token_exp_delta = 2592000000L;
   public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
   public static final String DATE_TIMEZONE = "GMT+8";
   public static final String default_character = "UTF-8";
   public static final String TMS_PROD_TOKEN_CERT = "-----BEGIN CERTIFICATE-----\nMIIEcDCCA1igAwIBAgIJAKCBMSvIHNiEMA0GCSqGSIb3DQEBBQUAMIGAMQswCQYD\nVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzEPMA0G\nA1UEChMGSkQuQ09NMQwwCgYDVQQLEwNKT1MxEzARBgNVBAMTCmpvcy5qZC5jb20x\nGTAXBgkqhkiG9w0BCQEWCmpvc0BqZC5jb20wIBcNMTkwMzE1MDQ1NTM2WhgPMjA1\nOTAzMDUwNDU1MzZaMIGAMQswCQYDVQQGEwJDTjEQMA4GA1UECBMHQmVpamluZzEQ\nMA4GA1UEBxMHQmVpamluZzEPMA0GA1UEChMGSkQuQ09NMQwwCgYDVQQLEwNKT1Mx\nEzARBgNVBAMTCmpvcy5qZC5jb20xGTAXBgkqhkiG9w0BCQEWCmpvc0BqZC5jb20w\nggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDf9jdFbaYJLb6H/B1EEtuO\nokkjrU1taQSudZhuBlnzCiKeUjK6vYDoqGgJSzRI86slU/rkK/7o4mc8LOvmAJRv\nULWLUdM9EzI+6+M6eVLwuWnm3QMIJJl1y7dQqwnAMLl3T/P6UGP1g19R7D8LcaEw\n289Y8i/qJaVdobaM822xcW4Wv+QIldlWo6YlDoE7dfY9pXTlAkTP/GzO+LOnCzp1\n/VA3Q6Xl1Cl4Kvk0wFWnGiMEbVEZx9yEknwPV1Viq3QGjMPoEGEau6x9srCcEitC\nlllqXHOWkIVNt//qN2ubx90wjyHKZTe3HrQ/LFSIWLTeNo738iR8tFzxSfa5hitZ\nAgMBAAGjgegwgeUwHQYDVR0OBBYEFHYHDa2moq7nEccftSm3x72QBWWJMIG1BgNV\nHSMEga0wgaqAFHYHDa2moq7nEccftSm3x72QBWWJoYGGpIGDMIGAMQswCQYDVQQG\nEwJDTjEQMA4GA1UECBMHQmVpamluZzEQMA4GA1UEBxMHQmVpamluZzEPMA0GA1UE\nChMGSkQuQ09NMQwwCgYDVQQLEwNKT1MxEzARBgNVBAMTCmpvcy5qZC5jb20xGTAX\nBgkqhkiG9w0BCQEWCmpvc0BqZC5jb22CCQCggTEryBzYhDAMBgNVHRMEBTADAQH/\nMA0GCSqGSIb3DQEBBQUAA4IBAQAr9qLL6qkNJjtcOzYM5afdyt+KBF9iwIcKG8ca\nNUPNXwOFnOFw/JBKR4svjafvV3rSGs7ZtVMmASLUhrtStwfJJvXV7tdyqC0p44u/\nsWK6SHoTNIHX+kXbzKrkwggqeTiUlHDTw60BP/mmbrYhIwOiTNvI247iWZ4IxxyD\nbpFULv0gBfTVuc/ATWrHTI2pT78lIectDgUCpTOAhQIvE0PLK9nZjrsSCvW7tRED\nPC+6KCPYQAzxmKvRRMCHXkAVeqb/0M6GEXBIT0aYEBHKdQ7s4g1VSGrbMUL5mQsA\n+3fYhR+QEhE8PboH5kVct1V9tiMpx7kymJQKVfNufC3FIlyr\n-----END CERTIFICATE-----";
   public static final String UNDERLINE = "_";

   public static enum cipher_type {
      WEAK((byte)0),
      REGULAR((byte)1),
      LARGE((byte)2);

      byte id;

      private cipher_type(byte i) {
         this.id = i;
      }

      public static cipher_type fromValue(byte x) throws MalformedException {
         switch (x) {
            case 0:
               return WEAK;
            case 1:
               return REGULAR;
            case 2:
               return LARGE;
            default:
               throw new MalformedException("unknown cipher type.");
         }
      }
   }

   public static enum algo_type {
      AES_CBC_128((byte)4);

      byte id;

      private algo_type(byte i) {
         this.id = i;
      }

      public static algo_type fromValue(byte x) {
         switch (x) {
            case 4:
               return AES_CBC_128;
            default:
               return null;
         }
      }
   }

   public static enum key_type {
      AES(0);

      int id;

      private key_type(int v) {
         this.id = v;
      }

      public static key_type fromValue(String x) throws MalformedException {
         if (x == null) {
            throw new MalformedException("key type is null.");
         } else if (x.equals("AES")) {
            return AES;
         } else {
            throw new MalformedException("unknown key type.");
         }
      }
   }

   public static enum key_usage {
      N(-1),
      E(0),
      D(1),
      ED(2);

      int id;

      private key_usage(int v) {
         this.id = v;
      }

      public static key_usage fromValue(String x) throws MalformedException {
         if (x == null) {
            throw new MalformedException("key usage is null.");
         } else if (x.equals("N")) {
            return N;
         } else if (x.equals("E")) {
            return E;
         } else if (x.equals("D")) {
            return D;
         } else if (x.equals("ED")) {
            return ED;
         } else {
            throw new MalformedException("unknown key usage.");
         }
      }
   }

   public static enum key_status {
      ACTIVE(0),
      SUSPENDED(1),
      REVOKED(2);

      public int id;

      private key_status(int v) {
         this.id = v;
      }

      public static key_status fromValue(int x) throws MalformedException {
         switch (x) {
            case 0:
               return ACTIVE;
            case 1:
               return SUSPENDED;
            case 2:
               return REVOKED;
            default:
               throw new MalformedException("unknown key status.");
         }
      }
   }
}
