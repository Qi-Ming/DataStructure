package SequenceList;

public class Demo {
    public static void main(String[] args) {
       LinkList<String> linkList = new LinkList<String>();
       linkList.add("a");
       linkList.add("b");
       linkList.add("c");
       linkList.add("e");
       linkList.insert("d", 4);
       linkList.modify("D", 4);
       System.out.println(linkList.search(4));
       linkList.remove(1);
       linkList.clear();
       linkList.nextOrder();



    }

}
