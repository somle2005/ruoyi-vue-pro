package com.xiaohongshu.fls.opensdk.entity;

public class BaseResponse<T> {
   public boolean success;
   public String code;
   public T data;
   public String msg;

   public void setSuccessResponse(T data) {
      this.success = true;
      this.data = data;
   }

   public void fillCodeAndMessage(String msg, String code) {
      this.msg = msg;
      this.code = code;
   }

   public void setFailResponse(String msg, String code) {
      this.success = false;
      this.msg = msg;
      this.code = code;
   }

   public boolean isSuccess() {
      return this.success;
   }

   public String getCode() {
      return this.code;
   }

   public T getData() {
      return this.data;
   }

   public String getMsg() {
      return this.msg;
   }

   public void setSuccess(boolean success) {
      this.success = success;
   }

   public void setCode(String code) {
      this.code = code;
   }

   public void setData(T data) {
      this.data = data;
   }

   public void setMsg(String msg) {
      this.msg = msg;
   }

   public boolean equals(Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof BaseResponse)) {
         return false;
      } else {
         BaseResponse<?> other = (BaseResponse)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.isSuccess() != other.isSuccess()) {
            return false;
         } else {
            Object this$code = this.getCode();
            Object other$code = other.getCode();
            if (this$code == null) {
               if (other$code != null) {
                  return false;
               }
            } else if (!this$code.equals(other$code)) {
               return false;
            }

            Object this$data = this.getData();
            Object other$data = other.getData();
            if (this$data == null) {
               if (other$data != null) {
                  return false;
               }
            } else if (!this$data.equals(other$data)) {
               return false;
            }

            Object this$msg = this.getMsg();
            Object other$msg = other.getMsg();
            if (this$msg == null) {
               if (other$msg != null) {
                  return false;
               }
            } else if (!this$msg.equals(other$msg)) {
               return false;
            }

            return true;
         }
      }
   }

   protected boolean canEqual(Object other) {
      return other instanceof BaseResponse;
   }

   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + (this.isSuccess() ? 79 : 97);
      Object $code = this.getCode();
      result = result * 59 + ($code == null ? 43 : $code.hashCode());
      Object $data = this.getData();
      result = result * 59 + ($data == null ? 43 : $data.hashCode());
      Object $msg = this.getMsg();
      result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
      return result;
   }

   public String toString() {
      return "BaseResponse(success=" + this.isSuccess() + ", code=" + this.getCode() + ", data=" + this.getData() + ", msg=" + this.getMsg() + ")";
   }
}
