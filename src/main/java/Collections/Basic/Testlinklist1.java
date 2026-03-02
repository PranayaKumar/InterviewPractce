package Collections.Basic;

import java.util.LinkedList;

public class Testlinklist1 {

    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(2);//0(n)
        linkList.addLast(4);//0(1)
        linkList.addFirst(0);//0(1)

        linkList.getFirst();
        linkList.getLast();
        System.out.println(linkList);


    }
}
