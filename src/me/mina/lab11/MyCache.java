package me.mina.lab11;

import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends Thread {
    private Map<String, Object> cache = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try{
            while(true){
                Timestamp crt = new Timestamp(System.currentTimeMillis());
                for (String key : cache.keySet()) {
                    StoredObject storedObject = (StoredObject) cache.get(key);
                    if (crt.after(storedObject.getExpirationTime())){
                        storedObject.setExpired(true);
                    }
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void addObject(String key, Object object, int ms){
        Timestamp expirationTime = new Timestamp(System.currentTimeMillis() + ms);
        StoredObject storedObject = new StoredObject(object, false, expirationTime);
        cache.put(key, storedObject);
    }

    public void printCache(){
        System.out.println("Cache: ");
        for (String key : cache.keySet()) {
            StoredObject storedObject = (StoredObject) cache.get(key);
            System.out.println(key + " -> " + storedObject.getMyInfo() + " -> " + storedObject.isExpired());
        }
    }
}
