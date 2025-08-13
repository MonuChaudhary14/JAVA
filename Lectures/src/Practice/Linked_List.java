package Practice;
import java.util.LinkedList;

public class Linked_List {

    public static void main(String[] args) {

        Node<Integer> head = new Node<>(10);
        Node<Integer> temp = head;

        Node<Integer> newnode = new Node<>(14);
        temp.next = newnode;
        newnode.prev = temp;

        temp = head;

        while(temp != null){

                System.out.print(temp.data + "-> ");
                temp = temp.next;

        }
        System.out.println();

        LinkedList list =  new LinkedList();

        list.add(14);
        list.add(12.4);
        list.add(23);
        list.add(34);
        list.add(2, 10);

        System.out.println(list);



    }

}

class Node<T>{

    T data;
    Node next;
    Node prev;

//    Node(){
//        this.data = 0;    We cannot do this , because 0 is the value for integer
//        this.next = null;
//        this.prev = null;
//    }

    Node(){
        this.data = null;
        this.next = null;
        this.prev = null;
    }

    Node(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }



}
