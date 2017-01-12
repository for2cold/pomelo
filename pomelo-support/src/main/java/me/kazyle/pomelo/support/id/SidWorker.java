package me.kazyle.pomelo.support.id;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * <p>pomelo</p>
 * <p>
 * <b>SidWorker</b> is from <a href="https://github.com/adyliu/idcenter">https://github.com/adyliu/idcenter</a>
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2017/1/12 10:08
 */
public class SidWorker {

    private static long lastTimestamp = -1L;
    private static int sequence = 0;
    private static final long MAX_SEQUENCE = 100;
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    /**
     * 19 bits number with timestamp (20160628175532000002)
     *
     * @return 19 bits number with timestamp
     */
    public static synchronized long nextSid() {
        long now = timeGen();
        if (now == lastTimestamp) {
            if (sequence++ > MAX_SEQUENCE) {
                now = tilNextMillis(lastTimestamp);
                sequence = 0;
            }
        } else {
            sequence = 0;
        }
        lastTimestamp = now;
        //
        return 100L * Long.parseLong(format.format(new Date(now))) + sequence;
    }

    private static long tilNextMillis(long lastTimestamp) {
        long timestamp = timeGen();
        while (timestamp <= lastTimestamp) {
            timestamp = timeGen();
        }
        return timestamp;
    }

    private static long timeGen() {
        return System.currentTimeMillis();
    }
}
