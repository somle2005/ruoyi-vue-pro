package com.jd.security.tde.util;

public enum TDEStatus {
   SUCCESS(0, "Success."),
   INTERNAL_ERROR(1, "Internal system error."),
   DB_ERROR(2, "Internal database error."),
   INVALID_JSON(3, "Invalid json input."),
   INVALID_REQUEST_DATA(4, "Invalid data in the request json."),
   REQUEST_SIG_VERFIFY_ERROR(5, "Validation of the request signature failed."),
   KMS_INTERNAL_ERROR(100, "KMS internal system error."),
   KMS_NO_KEY_FOUND(101, "No key found on KMS."),
   KMS_KEY_CREATED_ALREADY(102, "MK already created for this service."),
   KMS_KEY_REGISTRATION_FAILED(103, "Failed to register key by RKS."),
   KMS_SERVICE_ALREADY_REGISTERED(104, "The service is already registered"),
   KMS_TMS_CONNECTION_ERROR(105, "Failed to connect to TMS server"),
   KMS_RKS_CONNECTION_ERROR(106, "Failed to connect to RKS server"),
   KMS_KEY_ALREADY_ACTIVATED(107, "Latest key already activated"),
   KMS_FAIL_TO_REMOVE_REDIS_CACHE(108, "KMS fail to remove redis cache."),
   SDK_INTERNAL_ERROR(200, "SDK generic exception error."),
   SDK_USE_INEFFECTIVE_TOKEN(201, "SDK uses an ineffective token."),
   SDK_USE_HARD_EXPIRED_TOKEN(202, "SDK uses an expired token with hard deadline."),
   SDK_USE_SOFT_EXPIRED_TOKEN(203, "SDK uses an expired token with soft deadline."),
   SDK_FAIL_TO_READ_BACKUP(204, "SDK cannot fetch any function keys from backup file."),
   SDK_RECEIVED_WRONG_KEYRESPONSE1(205, "SDK received key response with unmatched service name."),
   SDK_RECEIVED_WRONG_KEYRESPONSE2(206, "SDK received key response with unmatched token id."),
   SDK_CANNOT_REACH_KMS(207, "SDK cannot reach KMS server."),
   SDK_HAS_NO_AVAILABLE_ENC_KEYS(208, "SDK holds a decrypt-only token or has no key to encrypt data."),
   SDK_HAS_NO_CORRESPONDING_DEC_KEYS(209, "SDK has no corresponding key to decrypt data."),
   SDK_OPERATE_WITH_EXPIRED_KEYS(210, "SDK uses old keys to encrypt/decrypt data."),
   SDK_OPERATE_WITH_INACTIVE_KEYS(211, "SDK uses suspended/revoked keys to encrypt/decrypt data."),
   SDK_THROW_JDK_EXCEPTION(212, "SDK threw generic JDK exception."),
   SDK_USE_INVALID_TOKEN(213, "SDK uses an invalid token."),
   SDK_HAS_NO_AVAILABLE_KEYS(214, "SDK has no keys in internal cache."),
   SDK_HAS_CORRUPTED_KEYS(215, "SDK has corrupted keys in internal cache."),
   SDK_HAS_CORRUPTED_CIPHER(216, "SDK tries to decrypt corrupted cipher."),
   SDK_DIDNOT_SETUP_RPATH(217, "SDK did not set resource path correctly."),
   SDK_FAIL_TO_WRITE_KEYCACHE(218, "SDK cannot write key cache file to the given resource path."),
   SDK_FAIL_TO_DELETE_KEYCACHE(219, "SDK fails to delete all key cache files."),
   SDK_FAIL_TO_READ_KEYCACHE(220, "SDK cannot fetch any function keys from cache file."),
   SDK_FAIL_TO_DELETE_KEYBACKUP(221, "SDK fails to delete backup file."),
   SDK_FAILS_TO_FETCH_UPDATED_KEYS(227, "SDK failed to fetch rotated keys from KMS."),
   SDK_TRIGGER_ROTATED_KEY_FETCH(228, "SDK trigger key fetching because ciphertext is encrypted with newer keys."),
   SDK_REPORT_CUR_KEYVER(229, "CurKeyVer="),
   TMS_INTERNAL_ERROR(300, "TMS internal system error."),
   TMS_DB_DATA_NOTFOUND_ERROR(301, "TMS-db's data not found."),
   TMS_REQUEST_ARGS_ERROR(302, "Request argument error."),
   TMS_DB_DATA_ERROR(303, "Tms db data error."),
   TMS_KMS_REQUEST_EXPIRE(304, " KMS request timeout."),
   TMS_REQUEST_VERIFY_FAILED(305, "Request signature validation failed."),
   TMS_TOKEN_EXPIRE(306, "The request voucher is expired."),
   TMS_TOKEN_IS_FROZEN(307, "The request voucher is frozen."),
   TMS_TOKEN_IS_REVOKE(308, "The request voucher is revoked."),
   TMS_TOKEN_IS_NOT_IN_THE_EFFECT_TIME_RANGE(309, "The voucher is ineffective."),
   TMS_TOKEN_IN_DB_IS_NULL(310, "The voucher in the db is null."),
   TMS_NO_AVAILABLE_GRANTS_FOR_SERVICE(311, "The voucher has no granted service."),
   RKS_INTERNAL_ERROR(400, "RKS internal system error."),
   RKS_REQUEST_FORMAT_ERROR(401, "Registration request format error."),
   RKS_SIG_VERIFY_ERROR(402, "Registration request signature validation failed."),
   RKS_BACKUP_CLOSE(403, "Backup service is not available.");

   public int code = -1;
   public String message;

   private TDEStatus(int code, String message) {
      this.code = code;
      this.message = message;
   }
}
