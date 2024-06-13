import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Thu");
        list.add("Tra");
        list.addFirst("Ha");
        list.addLast("Nam");
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

//        List<String> list = new ArrayList<>();
//        list.add("Ha");
//        list.add("Thu");
//        list.add("Nam");
//        list.add("Phuong");
//        ListIterator<String> listItrS = list.listIterator();
//        // order
//        int i =0;
//        while(listItrS.hasNext()){
//            String element = listItrS.next();
//            if(element.equals("Ha")){
//                listItrS.remove();
//            }else {
//                listItrS.set(element + " STT: " + ++i);
//            }
//        }
//        // after remove element "Ha"
//        Iterator<String> itr = list.listIterator();
//        while(itr.hasNext()){
//            String element = itr.next();
//            System.out.println(element);
//        }
//        // reverse order
//        while(listItrS.hasPrevious()){
//            String element = listItrS.previous();
//            System.out.println(element);
//        }



    }
}