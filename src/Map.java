import java.util.HashMap;
import java.util.Iterator;

public class Map<K, V> extends MyEntry<K, V> {

    private HashMap<K, V> map;

    public Map(K obKey, V obValue) {
        super(obKey, obValue);
        this.map = new HashMap<K, V>();
        this.map.put(obKey, obValue);
    }

    public Map() {
        super();
    }

    public void addEntry(K obKey, V obValue) {
        map.put(obKey, obValue);
    }

    public void removeByKey(K obKey) {
        map.remove(obKey);
    }

    public void removeByValue(K obKey) {
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            java.util.Map.Entry<K, V> next = iterator.next();

            if (next.getKey().equals(obKey)) {
                next.setValue((V) "");
            }
        }

 }


    public void showKey() {
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            java.util.Map.Entry<K, V> next = iterator.next();
            System.out.println(next.getKey().toString());
        }
        System.out.println();
    }

    public void showValueList() {
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            java.util.Map.Entry<K, V> next = iterator.next();

            System.out.println(next.getValue().toString());
        }
        System.out.println();
    }

    public void showMap() {
        Iterator<java.util.Map.Entry<K, V>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            java.util.Map.Entry<K, V> next = iterator.next();

            System.out.println(next.getKey().toString() + " " + next.getValue().toString());
        }
        System.out.println();
    }
}
