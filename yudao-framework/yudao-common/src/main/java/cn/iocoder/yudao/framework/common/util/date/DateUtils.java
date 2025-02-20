package cn.iocoder.yudao.framework.common.util.date;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.LocalDateTimeUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 时间工具类
 *
 * @author 芋道源码
 */
@Slf4j
public class DateUtils {

    /**
     * 时区 - 默认
     */
    public static final String TIME_ZONE_DEFAULT = "GMT+8";

    /**
     * 秒转换成毫秒
     */
    public static final long SECOND_MILLIS = 1000;

    public static final String PURE_DATE_PATTERN = "yyyyMMdd";

    public static final String FORMAT_YEAR_MONTH_DAY = "yyyy-MM-dd";

    public static final String FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND = "yyyy-MM-dd HH:mm:ss";

    /**
    * @Author Wqh
    * @Description 将LocalDate转成String类型字符串，格式为yyyyMMdd
    * @Date 14:34 2024/10/10
    * @Param [date]
    * @return java.lang.String
    **/
    public static String formatLocalDate(LocalDate date) {
        return LocalDateTimeUtil.format(date, PURE_DATE_PATTERN);
    }

    /**
    * @Author Wqh
    * @Description 将localDateTime转成string类型字符串，格式为yyyy-MM-dd HH:mm:ss
    * @Date 10:12 2024/10/10
    * @Param [date]
    * @return java.lang.String
    **/
    public static String formatLocalDateTime(LocalDateTime date) {
        return LocalDateTimeUtil.format(date, FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND);
    }

    /**
     * 将 LocalDateTime 转换成 Date
     *
     * @param date LocalDateTime
     * @return LocalDateTime
     */
    public static Date of(LocalDateTime date) {
        if (date == null) {
            return null;
        }
        // 将此日期时间与时区相结合以创建 ZonedDateTime
        ZonedDateTime zonedDateTime = date.atZone(ZoneId.systemDefault());
        // 本地时间线 LocalDateTime 到即时时间线 Instant 时间戳
        Instant instant = zonedDateTime.toInstant();
        // UTC时间(世界协调时间,UTC + 00:00)转北京(北京,UTC + 8:00)时间
        return Date.from(instant);
    }

    /**
     * 将 Date 转换成 LocalDateTime
     *
     * @param date Date
     * @return LocalDateTime
     */
    public static LocalDateTime of(Date date) {
        if (date == null) {
            return null;
        }
        // 转为时间戳
        Instant instant = date.toInstant();
        // UTC时间(世界协调时间,UTC + 00:00)转北京(北京,UTC + 8:00)时间
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    public static Date addTime(Duration duration) {
        return new Date(System.currentTimeMillis() + duration.toMillis());
    }

    public static boolean isExpired(LocalDateTime time) {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(time);
    }

    /**
     * 创建指定时间
     *
     * @param year  年
     * @param mouth 月
     * @param day   日
     * @return 指定时间
     */
    public static Date buildTime(int year, int mouth, int day) {
        return buildTime(year, mouth, day, 0, 0, 0);
    }

    /**
     * 创建指定时间
     *
     * @param year   年
     * @param mouth  月
     * @param day    日
     * @param hour   小时
     * @param minute 分钟
     * @param second 秒
     * @return 指定时间
     */
    public static Date buildTime(int year, int mouth, int day,
                                 int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, mouth - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);
        calendar.set(Calendar.MILLISECOND, 0); // 一般情况下，都是 0 毫秒
        return calendar.getTime();
    }

    public static Date max(Date a, Date b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        return a.compareTo(b) > 0 ? a : b;
    }

    public static LocalDateTime max(LocalDateTime a, LocalDateTime b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        return a.isAfter(b) ? a : b;
    }

    /**
     * 是否今天
     *
     * @param date 日期
     * @return 是否
     */
    public static boolean isToday(LocalDateTime date) {
        return LocalDateTimeUtil.isSameDay(date, LocalDateTime.now());
    }

    /**
     * 是否昨天
     *
     * @param date 日期
     * @return 是否
     */
    public static boolean isYesterday(LocalDateTime date) {
        return LocalDateTimeUtil.isSameDay(date, LocalDateTime.now().minusDays(1));
    }


    //日期转换

    private static final String[] D_FMT= {"yyyy-M-d","yyyy-MM-dd","yyyy-M-dd","yyyy-MM-d","yyyy/MM/dd","yyyy/M/dd","yyyy/M/d","yyyy/MM/d","yyyyMMdd"};
    private static final String[] T_FMT= {"HH:mm:ss","HHmmss","HH:mm","HHmm","HH"};
    private static final String FMT_CHARS= "ymdHmsM";

    /**
     * 以下字符将被替换为空格
     * */
    private static final String SPACE_CHARS= "\t\nT　Z\r";

    private static final char COLON_FULL= '：';
    private static final char COLON_HALF= ':';
    private static final char SPACE_1_CHAR= ' ';
    private static final String SPACE_1_STR= " ";
    private static final String SPACE_2= "  ";
    /**
     * 循环时存在并发异常，修改为 ConcurrentHashMap 类型
     * */
    private static final Map<String, SimpleDateFormat> FMT_MAP=new ConcurrentHashMap<>();


    private synchronized static void makeFormatsIf() {
        if(FMT_MAP.size()>0) {
            return;
        }


        String fmt=null;
        SimpleDateFormat sdf=null;

        fmt="yyyy-MM";
        sdf = new SimpleDateFormat(fmt);
        FMT_MAP.put(fmt, sdf);

        fmt="yyyy-M";
        sdf = new SimpleDateFormat(fmt);
        FMT_MAP.put(fmt, sdf);

        fmt="yyyy/MM";
        sdf = new SimpleDateFormat(fmt);
        FMT_MAP.put(fmt, sdf);

        fmt="yyyy/M";
        sdf = new SimpleDateFormat(fmt);
        FMT_MAP.put(fmt, sdf);

        fmt="yyyyMM";
        sdf = new SimpleDateFormat(fmt);
        FMT_MAP.put(fmt, sdf);

        fmt="yyyyM";
        sdf = new SimpleDateFormat(fmt);
        FMT_MAP.put(fmt, sdf);

        fmt="yyyy";
        sdf = new SimpleDateFormat(fmt);
        FMT_MAP.put(fmt, sdf);


        for (String d : D_FMT) {
            for (String t : T_FMT) {

                fmt=d;
                sdf = new SimpleDateFormat(d);
                FMT_MAP.put(fmt, sdf);

                fmt=d+" "+t;
                sdf = new SimpleDateFormat(fmt);
                FMT_MAP.put(fmt, sdf);

                fmt=d+" "+"H";
                sdf = new SimpleDateFormat(fmt);
                FMT_MAP.put(fmt, sdf);

                fmt=d+t;
                sdf = new SimpleDateFormat(fmt);
                FMT_MAP.put(fmt, sdf);

            }
        }
    }

    private static String dealDateStr(String value)
    {
        if(value!=null) value=value.trim();
        for (int i = 0; i < SPACE_CHARS.length(); i++) {
            char c=SPACE_CHARS.charAt(i);
            while(value.indexOf(c)!=-1)
            {
                value=value.replace(c, SPACE_1_CHAR);
            }
        }

        while(value.indexOf(COLON_FULL)!=-1)
        {
            value=value.replace(COLON_FULL, COLON_HALF);
        }
        //将两个空格替换为一个空格
        while(value.indexOf(SPACE_2)!=-1)
        {
            value=value.replaceAll(SPACE_2, SPACE_1_STR);
        }
        value=value.trim();
        return value;
    }

    private static boolean checkFormat(String val, String fmt) {

        int i=val.length();
        int j=fmt.length();
        if(i!=j) {
            return false;
        }


        i=fmt.indexOf(' ');
        j=val.indexOf(' ');
        if(i!=j) {
            return false;
        }

        i=fmt.indexOf('-');
        j=val.indexOf('-');
        if(i!=j) {
            return false;
        }

        i=fmt.indexOf('/');
        j=val.indexOf('/');
        if(i!=j) {
            return false;
        }

        i=fmt.indexOf(':');
        j=val.indexOf(':');
        if(i!=j) {
            return false;
        }

        i=fmt.indexOf('.');
        j=val.indexOf('.');
        if(i!=j) {
            return false;
        }

        char fc;
        char vc;
        for (int k = 0; k < fmt.length(); k++) {
            fc=fmt.charAt(k);
            vc=val.charAt(k);
            if(FMT_CHARS.indexOf(fc)==-1 && fc!=vc) {
                return false;
            }
        }
        return true;

    }
    /**
     * 字符串转日期
     * @param value 字符串
     * @return Date
     * */
    public static Date parse(String value) {
        if(StrUtil.isBlank(value)) return null;
        value=value.trim();
        makeFormatsIf();
        value = dealDateStr(value);
        String[] parts=value.split("\\.");
        String msFmt=null;
        String dt=parts[0];
        if(parts.length>1) {
            msFmt=".S";
        }
        Date datetime = null;
        for (Map.Entry<String, SimpleDateFormat> en : FMT_MAP.entrySet()) {
            if (checkFormat(dt, en.getKey())) {
                SimpleDateFormat fmt = FMT_MAP.get(en.getKey());
                try {
                    synchronized (fmt) {
                        if(msFmt==null) {
                            datetime = fmt.parse(dt);
                        } else {
                            String key=en.getKey()+msFmt;
                            fmt = FMT_MAP.get(key);
                            if(fmt==null) {
                                fmt = new SimpleDateFormat(key);
                                FMT_MAP.put(key,fmt);
                            }
                            datetime = fmt.parse(value);
                        }
                    }
                    break;
                } catch (Exception e) {
                    log.error("日期转换失败,无法转换 "+value+" 为日期格式",e);
                    datetime = null;
                }
            }
        }
        return datetime;
    }


    public static void main(String[] args) {
        DateUtils.parse("2023-08-15T18:58:32-07:00");

        String dateStr = "2023-08-15T18:57:43-07:00";
        // 定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        try {
            // 解析字符串为 Date 对象
            Date date = sdf.parse(dateStr);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


}
