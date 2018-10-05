package com.zzwtec.watchdog.model;

/***
 * @author onew
 * */
public class DogFood {
    /***
     * 看门狗状态
     */
    private int status;
    /***
     *
     *时间戳
     */
    private long timestamp;

    public DogFood(int status, long timestamp) {
        this.status = status;
        this.timestamp = timestamp;
    }

    public DogFood() {
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
