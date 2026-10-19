package collection;

import java.util.ArrayList;                       // needed for ArrayList
import java.util.LinkedList;                      // needed for LinkedList

public class ArrayListLinkedList {                               // class that holds main
    public static void main(String[] args) {      // program starts here
        ArrayList<Integer> a = new ArrayList<>(); // empty ArrayList
        LinkedList<Integer> l = new LinkedList<>(); // empty LinkedList
        for (int i = 0; i < 10; i++) {        // repeat 10 times
            a.add(0, i);                          // add at the start: ArrayList shifts everything (slow)
            l.addFirst(i);   						// add at the start: LinkedList changes links only (fast)
            System.out.println("Array" + a);  
            System.out.println("LL"+ l);      
        }          									// end of loop
    }                                             // end of main
}                                                 // end of class