public class MyEntry <K,V> {
    K obKey;
    V obValue;

    public MyEntry(K obKey, V obValue) {
        this.obKey = obKey;
        this.obValue = obValue;
    }

    public MyEntry() {

    }

    public K getObKey() {
        return obKey;
    }

    public void setObKey(K obKey) {
        this.obKey = obKey;
    }

    public V getObValue() {
        return obValue;
    }

    public void setObValue(V obValue) {
        this.obValue = obValue;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "obKey=" + obKey +
                ", obValue=" + obValue +
                '}';
    }
}