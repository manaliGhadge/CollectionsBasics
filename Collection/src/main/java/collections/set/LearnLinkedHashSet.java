package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {

    // linked hash set - adds data in sequence unlike hashset
    public static void main(String args[]) {
        Set<Integer> hs = new LinkedHashSet<>();

        // add() - add data
        hs.add(1);
        hs.add(3);
        hs.add(5);
        hs.add(7);
        hs.add(9);
        hs.add(7); // skip

        System.out.println(hs);

        // remove() - remove element
        hs.remove(3);

        System.out.println(hs);

        // contains() - checks if element available.
        System.out.println(hs.contains(100));
        System.out.println(hs.contains(7));

        hs.clear();
        System.out.println(hs);
    }
}
