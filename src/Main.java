public class Main {
    public static void main(String[] args) {
        Map<Integer, String> m = new Map<>(30,"Orest");

        m.addEntry(30, "Andrew");
        m.addEntry(44, "Andy");
        m.addEntry(32, "Petter");
        m.addEntry(63, "Henry");
        m.addEntry(3, "Hest");

        m.showMap();
        m.removeByKey(44);
        m.showMap();
        m.removeByValue(3);
        m.showMap();
        m.showKey();
        m.showValueList();

    }
}