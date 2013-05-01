package jp.gr.java_conf.t1732.util.time;

import java.util.concurrent.TimeUnit;

public class SplitMillis {

    private long day;
    private long hour;
    private long minute;
    private long second;
    private long millis;

    public SplitMillis(long fromMillis) {
        long diff = 0;
        day    = fromMillis / TimeUnit.DAYS.toMillis(1);
        diff   = fromMillis % TimeUnit.DAYS.toMillis(1);
        hour   = diff / TimeUnit.HOURS.toMillis(1);
        diff   = diff % TimeUnit.HOURS.toMillis(1);
        minute = diff / TimeUnit.MINUTES.toMillis(1);
        diff   = diff % TimeUnit.MINUTES.toMillis(1);
        second = diff / TimeUnit.SECONDS.toMillis(1);
        diff   = diff % TimeUnit.SECONDS.toMillis(1);
        millis = diff / 10; // 2桁表示にする
    }

    public long getDay() {
        return day;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public long getMillis() {
        return millis;
    }
}
