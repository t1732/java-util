package jp.gr.java_conf.t1732.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {

    /**
     * to - from の差
     *
     * @param fromMillis   long
     * @param toStrTime    日時文字列 yyyy-MM-dd HH:mm:ss
     * @return 2つの時間の差 long (ミリ秒)
     * @throws ParseException 日付フォーマットが不正な場合
     */
    public static long differenceMillis(long fromMillis, String toStrTime) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date toDate = format.parse(toStrTime);
        return differenceMillis(fromMillis, toDate);
    }

    /**
     * to - from の差
     *
     * @param fromMillis   ミリ秒 long
     * @param toDate       日付   java.util.Date
     * @return 2つの日付の差 long (ミリ秒)
     */
    public static long differenceMillis(long fromMillis, Date toDate) {
        long toDateTime = toDate.getTime();
        long diffMillis = toDateTime - fromMillis;
        return diffMillis;
    }

}
