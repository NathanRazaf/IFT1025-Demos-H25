package Demo8.Maps;

public class Main {
    public static void main(String[] args) {
        IntMap map = new SimpleIntMap();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);
        map.raiseAll();
        System.out.println(map);
    }
}
