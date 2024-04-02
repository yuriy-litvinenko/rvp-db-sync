package kz.izipaq.rvpdbsync.config;

public class DBContextHolder {

    private static final ThreadLocal<ClientNames> contextHolder = new ThreadLocal<>();

    public static ClientNames getCurrentDb() {
        return contextHolder.get();
    }

    public static void setCurrentDb(ClientNames dbType) {
        contextHolder.set(dbType);
    }

    public static void clear() {
        contextHolder.remove();
    }

}
