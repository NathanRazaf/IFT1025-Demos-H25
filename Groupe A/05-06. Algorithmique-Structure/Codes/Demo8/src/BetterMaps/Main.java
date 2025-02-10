package Demo8.BetterMaps;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        AllPurposeMap<String, Cours> map = new AllPurposeMap<>();
        map.put("IFT2015", new Cours("Structures de données", 4.0f));
        map.put("IFT2125", new Cours("Intro à l'algorithmique", 3.5f));
        map.put("IFT2935", new Cours("Bases de données", 3.7f));
        map.put("IFT2905", new Cours("Interfaces personne-machine", 3.3f));

        System.out.println(map.get("IFT2015"));

        Iterator<APEntry<String, Cours>> it = map.iterator();
        while (it.hasNext()) {
            APEntry<String, Cours> entry = it.next();
            System.out.println(entry.getKey() + " : " + entry.getValue().getMoyenne());
        }
    }
}
