package collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    // Dynamic size change which is not possible in normal Array.
    public static void main(String args[]) {
        ArrayList<String> studentsName = new ArrayList<>();
        // until here empty array.

        // add()
        studentsName.add("student1");
        studentsName.add("student2");
        // after first add it will create array of 10.
        // At the time of adding 11th element. Internally (10+10/2) = 16
        // new array of size 16 & copy old array in new.
        // add function - adds elements in end.
        studentsName.add(1, "newStudent");

        System.out.println(studentsName);

        // Iterate

        for(int i = 0; i <studentsName.size(); i++) {
            System.out.println("The element is:" +studentsName.get(i));
        }

        for (String element: studentsName) {
            System.out.println("ForEach element is:" +element);
        }

        Iterator<String> iterator = studentsName.iterator();
        while (iterator.hasNext()) {
            System.out.println("ForEach element is:" +iterator.next());
        }
        // addAll()
        // adds new list in old list.

        ArrayList<Integer> oldList = new ArrayList<>();
        oldList.add(1);
        oldList.add(2);

        ArrayList<Integer> newList = new ArrayList<>();
        oldList.add(10);
        oldList.add(20);
        oldList.addAll(newList);
        System.out.println(oldList);

        // set()
        oldList.set(1, 1000); // set value 1000 at index 1.

        // contains()
        System.out.println(oldList.contains(20)); // to check if element available.

        // get()
        System.out.println(oldList.get(3)); // get element at index 3.

        // remove()
        oldList.remove(3); // remove element at index 3.
        System.out.println(oldList);

        oldList.remove(Integer.valueOf(1)); // this is used for removing element 1.
        System.out.println(oldList);

        // clear()
        oldList.clear(); // clears complete list.
        System.out.println(oldList);
    }
}
