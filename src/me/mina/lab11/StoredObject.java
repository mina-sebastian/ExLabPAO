package me.mina.lab11;

import java.sql.Timestamp;

public class StoredObject {

    private Object myInfo;
    private boolean expired;
    private Timestamp expirationTime;

    public StoredObject(Object myInfo, boolean expired, Timestamp expirationTime) {
        this.myInfo = myInfo;
        this.expired = expired;
        this.expirationTime = expirationTime;
    }

    public Object getMyInfo() {
        return myInfo;
    }

    public boolean isExpired() {
        return expired;
    }

    public Timestamp getExpirationTime() {
        return expirationTime;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }


}
