package com.xiaohongshu.fls.opensdk.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
   public static Date getNowTime() {
      return new Date();
   }

   public static long getTimestamp() {
      return getNowTime().getTime();
   }

   public static Calendar getNowDate() {
      Calendar dt = Calendar.getInstance();
      dt.set(11, 0);
      dt.set(12, 0);
      dt.set(13, 0);
      dt.set(14, 0);
      return dt;
   }

   public static String formatToDatetime(Date dt) {
      return formatToDatetime(dt, (String)null);
   }

   public static Date getDateByTimeDelta(Date date, int timeDelta) {
      Calendar dt = Calendar.getInstance();
      dt.setTime(date);
      dt.add(5, timeDelta);
      return dt.getTime();
   }

   public static String formatToDatetime(Date dt, String dtFormat) {
      if (dtFormat == null) {
         dtFormat = "yyyy-MM-dd HH:mm:ss";
      }

      SimpleDateFormat ft = new SimpleDateFormat(dtFormat);
      return ft.format(dt.getTime());
   }

   public static Date convertDatetime(String dtStr) {
      return convertDatetime(dtStr, (String)null);
   }

   public static Date convertDatetime(String dtStr, String dtFormat) {
      try {
         if (null == dtStr) {
            return null;
         } else {
            if (dtFormat == null) {
               dtFormat = "yyyy-MM-dd HH:mm:ss";
            }

            SimpleDateFormat ft = new SimpleDateFormat(dtFormat);
            return ft.parse(dtStr);
         }
      } catch (ParseException var3) {
         return null;
      }
   }

   public static Date datetimeStr2DateFormat(String datetimeStr) {
      Date date = convertDatetime(datetimeStr);
      Calendar dt = Calendar.getInstance();
      dt.setTime(date);
      dt.set(11, 0);
      dt.set(12, 0);
      dt.set(13, 0);
      dt.set(14, 0);
      return dt.getTime();
   }

   public static long datetime2Microtimestamp(Date dt) {
      return dt.getTime();
   }

   public static long datetime2Timestamp(Date dt) {
      String timestamp = String.valueOf(dt.getTime());
      int length = timestamp.length();
      return (long)Integer.valueOf(timestamp.substring(0, length - 3));
   }

   public static Date timestamp2Datetime(int timestamp) {
      long temp = (long)timestamp * 1000L;
      return new Date(temp);
   }

   public static Date microtimestamp2Datetime(long timestamp) {
      return new Date(timestamp);
   }
}
