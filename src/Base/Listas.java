package Base;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;

public class Listas {
    public static void main(String[] args) {
        //ArrayList
        List<String> myList = new ArrayList<>();
        myList.add("holaaaa");
        System.out.println(myList.size()); 
        System.out.println(myList);
       //LinkedList
        List<Boolean> myLinkedList = new LinkedList<>();

        myLinkedList.add(false);
        myLinkedList.add(true);
        System.out.println(myLinkedList);
        //Vector
        List<Integer> myVector = new Vector<>();

        myVector.add(10);


    }
}
