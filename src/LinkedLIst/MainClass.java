package LinkedLIst;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<String> x = new LinkedList<>();
        var  list = new LinkLists();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        x.removeFirst();

        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(20));
        System.out.println(list.indexOf(30));


        System.out.println(list.contains(40));
        System.out.println(list.contains(10));



    }
}
