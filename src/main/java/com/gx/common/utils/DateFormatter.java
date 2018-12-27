package com.gx.common.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author inception
 *
 */
public final class DateFormatter {

    // ------------------------------ FIELDS ------------------------------

    private static final SimpleDateFormat YY_MM_DDHHmm = new SimpleDateFormat("yy-MM-dd HH:mm");

    private static final SimpleDateFormat YY_MM_DD = new SimpleDateFormat("yy-MM-dd");
    
    private static final SimpleDateFormat YYYY_MM_DDHHmm = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private static final SimpleDateFormat YYYY_MM_DDHH24miss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");

    private static final SimpleDateFormat YYYY = new SimpleDateFormat("yyyy");

    private static final SimpleDateFormat YY = new SimpleDateFormat("yy");

    private static final SimpleDateFormat MM = new SimpleDateFormat("MM");

    private static final SimpleDateFormat DD = new SimpleDateFormat("dd");

    private static final SimpleDateFormat YYMMDD = new SimpleDateFormat("yyMMdd");

    private static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");

    private static final SimpleDateFormat YYYYMMDDHHmmss = new SimpleDateFormat("yyyyMMddHHmmss");

    private static final SimpleDateFormat YYYYcnMMcnDDcn = new SimpleDateFormat("yyyy年MM月dd日");

    private static final SimpleDateFormat YYYYMM = new SimpleDateFormat("yyyyMM");
    private static final SimpleDateFormat YYYY_MM = new SimpleDateFormat("yyyy-MM");

    private static final SimpleDateFormat HHmm = new SimpleDateFormat("HH:mm");

    //public static String timeFormat = "yyyy-MM-dd HH:mm:ss";

    //public static String dateFormat = "yyyy-MM-dd";

    static {
        YY_MM_DDHHmm.setLenient(false);
        YY_MM_DD.setLenient(false);
        YYYY_MM_DDHHmm.setLenient(false);
        YYYY_MM_DD.setLenient(false);
        YYYY.setLenient(false);
        YY.setLenient(false);
        MM.setLenient(false);
        DD.setLenient(false);
        YYMMDD.setLenient(false);
        YYYYMMDD.setLenient(false);
        YYYYMMDDHHmmss.setLenient(false);
        YYYYcnMMcnDDcn.setLenient(false);
        YYYYMM.setLenient(false);
        HHmm.setLenient(false);
    }

    public static String getHHmm(Date time) {
        if (time == null) {
            return "";
        }
        return HHmm.format(time);
    }

    public static String getDDFromLong(Date time) {
        if (time == null) return "";
        return DD.format(time);
    }

    public static String getMMFromLong(Date time) {
        if (time == null) return "";
        return MM.format(time);
    }

    public static String getYYFromLong(Date time) {
        if (time == null) return "";
        return YY.format(time);
    }

    public static String getYYYYFromLong(Date time) {
        if (time == null) return "";
        return YYYY.format(time);
    }

    public static String getYYYYMMFromLong(Date time) {
        if (time == null) return "";
        return YYYYMM.format(time);
    }

    public static String long2YYMMDD(Date time) {
        if (time == null) return "";
        return YYMMDD.format(time);
    }

    public static String long2YYYYMMDD(Date time) {
        if (time == null) return "";
        return YYYYMMDD.format(time);
    }

    public static String long2YYYYMMDDHHmmss(Date time) {
        if (time == null) return "";
        return YYYYMMDDHHmmss.format(time);
    }

    public static String long2YYYY_MM_DDHH24miss(Date time) {
        if (time == null) return "";
        return YYYY_MM_DDHH24miss.format(time);
    }
    
    public static String long2YYYY_MM(Date time) {
        if (time == null) return "";
        return YYYY_MM.format(time);
    }
    
    public static String long2YYYY_MM_DD(Date time) {
        if (time == null) return "";
        return YYYY_MM_DD.format(time);
    }

    public static String long2YYYY_MM_DDHHmm(Date time) {
        if (time == null) return "";
        return YYYY_MM_DDHHmm.format(time);
    }

    public static String long2YYYYcnMMcnDDcn(Date time) {
        if (time == null) return "";
        return YYYYcnMMcnDDcn.format(time);
    }

    public static String long2YY_MM_DD(Date time) {
        if (time == null) return "";
        return YY_MM_DD.format(time);
    }

    public static String long2YY_MM_DDHHmm(Date time) {
        if (time == null) return "";
        return YY_MM_DDHHmm.format(time);
    }

    public static Timestamp yy_MM_DD2Timestamp(String yy_mm_dd) {
        try {
            return new Timestamp(YY_MM_DD.parse(yy_mm_dd).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yy_mm_dd + " ERROR." + e.getMessage());
        }
    }

    public static Timestamp yyyyMMDD2Timestamp(String yyyymmdd) {
        try {
            return new Timestamp(YYYYMMDD.parse(yyyymmdd).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyymmdd + " ERROR." + e.getMessage());
        }
    }

    public static Timestamp yyyy_MM_DD2Timestamp(String yyyy_mm_dd) {
        try {
            return new Timestamp(YYYY_MM_DD.parse(yyyy_mm_dd).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyy_mm_dd + " ERROR." + e.getMessage());
        }
    }


    public static Timestamp yyyycnMMcnDDcn2Timestamp(String yyyycnMMcnDDcn) {
        try {
            return new Timestamp(YYYYcnMMcnDDcn.parse(yyyycnMMcnDDcn).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyycnMMcnDDcn + " ERROR." + e.getMessage());
        }
    }


    public static Date yyyycnMMcnDDcn2Date(String yyyycnMMcnDDcn) {
        try {
            return YYYYcnMMcnDDcn.parse(yyyycnMMcnDDcn);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyycnMMcnDDcn + " ERROR." + e.getMessage());
        }
    }


    public static Date yyyyMMDD2Date(String yyyyMMDD) {
        try {
            return new Date(YYYYMMDD.parse(yyyyMMDD).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyyMMDD + " ERROR." + e.getMessage());
        }
    }

    public static synchronized Date yyyy_MM_DD2Date(String yyyy_MM_DD) {
        try {
            return new Date(YYYY_MM_DD.parse(yyyy_MM_DD).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyy_MM_DD + " ERROR." + e.getMessage());
        }
    }

    public static long yyyycnMMcnDDcn2Long(String yyyycnMMcnDDcn) {
        try {
            return YYYYcnMMcnDDcn.parse(yyyycnMMcnDDcn).getTime();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyycnMMcnDDcn + " ERROR." + e.getMessage());
        }
    }


    public static long yyyy_MM_DD2Long(String yyyy_MM_DD) {
        try {
            return YYYY_MM_DD.parse(yyyy_MM_DD).getTime();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyy_MM_DD + " ERROR." + e.getMessage());
        }
    }



    public static long yyyyMMDDHH24miss2Long(String yyyyMMDDHH24miss) {
        try {
            return YYYY_MM_DDHH24miss.parse(yyyyMMDDHH24miss).getTime();
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + yyyyMMDDHH24miss + " ERROR." + e.getMessage());
        }
    }

    /**
     * 
     * 日期转换XXXX年-MM月
     * 
     * @author cyq 2018年4月24日
     * @param yyyy_MM
     * @return
     */
    public static Date yyyy_MM2Date(String date) {
        try {
            return new Date(YYYY_MM.parse(date).getTime());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Formatter Date" + date + " ERROR." + e.getMessage());
        }
    }

    public static Date parseDate(String dateStr, String format) {
        Date date = null;
        try {
            java.text.DateFormat df = new SimpleDateFormat(format);
            date = (Date) df.parse(dateStr);
        } catch (Exception e) {
            throw new IllegalArgumentException("Formatter Date ERROR.");
        }
        return date;
    }
    /**
     * 判断时间格式 格式必须为“YYYY-MM-dd”
     * 2004-2-30 是无效的
     * 2003-2-29 是无效的
     * @param sDate
     * @return
     */
    public static boolean isValidDate(String str) {
        //String str = "2007-01-02";
        java.text.DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date date = (Date)formatter.parse(str);
//            DebugPrintf.Printf(str);
//            DebugPrintf.Printf(formatter.format(date));
            return str.equals(formatter.format(date));
        }catch(Exception e){
            return false;
        }
    }
    
    public static Date nowTime2yyyy_mm(Date date){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		return yyyy_MM_DD2Date(format);
    }

//
//    /**
//     * 将"2007-01-01 13:20:21"格式的日期转化成 Date 类型
//     */
//    public static java.util.Date str2Date(String timeStr) {
//        if (timeStr == null || "".equals(timeStr))
//            return null;
//        return parseDate(timeStr, dateFormat);
//    }
//
//    /**
//     * 将"2007-01-01"格式的日期转化成 Date 类型
//     */
//    public static java.util.Date str_t2Date(String timeStr) {
//        if (timeStr == null || "".equals(timeStr))
//            return null;
//        return parseDate(timeStr, timeFormat);
//    }
//
//    /**
//     * 将"2007-01-01"格式的日期转化成 Timestamp 类型
//     */
//    public static java.sql.Timestamp str2Timestamp(String timeStr) {
//        if (timeStr == null || "".equals(timeStr))
//            return null;
//        return long2Timestamp(parseDate(timeStr, dateFormat).getTime());
//    }
//
//    public static java.sql.Timestamp long2Timestamp(long time) {
//        java.sql.Timestamp timeTemp = new java.sql.Timestamp(time);
//        timeTemp.setNanos(0);
//        return timeTemp;
//    }
//
//    /**
//     * 将"2007-01-01 12:23:12"格式的日期转化成 Timestamp 类型
//     */
//    public static java.sql.Timestamp str_t2Timestamp(String timeStr) {
//		if(timeStr == null || "".equals(timeStr))
//			return null;
//		return long2Timestamp(parseDate(timeStr, timeFormat).getTime());
//	}
}

