import jdk.jfr.Threshold;

import java.io.Serializable;
import java.util.Iterator;

public class DoublyLinkedList<T> implements MyList, Serializable,Cloneable,Iterable{


    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator iterator() {
        return null;
    }

    /**
191) Java program to convert a given binary tree to doubly linked list

 192) Java program to create a doubly linked list from a ternary tree
193) Java program to create a doubly linked list of n nodes and count the number of nodes
194) Java program to create a doubly linked list of n nodes and display it in reverse order
195) Java program to create and display a doubly linked list
196) Java program to delete a new node from the beginning of the doubly linked list
197) Java program to delete a new node from the end of the doubly linked list
198) Java program to delete a new node from the middle of the doubly linked list
199) Java program to find the maximum and minimum value node from a doubly linked list
200) Java program to insert a new node at the beginning of the Doubly Linked list
201) Java program to insert a new node at the end of the Doubly Linked List
202) Java program to insert a new node at the middle of the Doubly Linked List
203) Java program to remove duplicate elements from a Doubly Linked List
204) Java program to rotate doubly linked list by N nodes
205) Java program to search an element in a doubly linked list
206) Java program to sort the elements of the doubly linked list

**/
private class  Node<T>{
        Node<T> next;
        Node<T> prev;
        T value;
        Node(T value){
            this.value = value;
        }
    }
private  Node node;


    /**
     *
     */
    @Override
    public void add(Object value) {
        Node<T> temp = node;
        if(temp == null){
            node = new Node<>(value);
        }else{
            while (temp.next != null)
                temp = temp.next;

            Node p = new Node<>(value);
            p.prev = temp;
            temp.next = p;
        }
    }

    /**
     * @param value
     */
    @Override
    public void addAtBegning(Object value) {

    }

    /**
     * @param value
     */



    /**
     * @param arr
     */
    @Override
    public void addAll(Object[] arr) {
        Node temp = node;
        if (temp == null){
            int i = 1;
            Node p = new Node<>(arr[0]);
            node = temp = p;
            while(i < arr.length){
                p = new Node<>(arr[i]);
                p.prev = temp;
                temp.next = p;
            }
        }
    }

    /**
     * @return
     */
    @Override
    public int size() {
        Node temp = node;
        int size = 0;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    /**
     * @param index
     * @return
     */
    @Override
    public boolean delete(int index) {
        return false;
    }

    /**
     *
     */
    @Override
    public void reverse() {
        Node Temp = node;

    }

    /**
     * @param index
     */
    @Override
    public void insert(int index,Object value) {

    }

    /**
     * @return
     */
    @Override
    public boolean delete() {
        Node temp = node,t = null;
        while (temp.next != null){
            t = temp;
            temp = temp.next;
        }
        t.next = null;

        return true;
    }

    /**
     *
     */
    @Override
    public void deleteAll() {
        node = null;
    }

    /**
     * @return
     */
    @Override
    public boolean search(Object x) {
        Node temp = node;
        while (temp != null){
            if (temp.value == x) return true;
            temp = temp.next;
        }
        return false;
    }

    /**
     *
     */
    @Override
    public void printAllElements() {
        Node temp = node;
        while (temp.next != null){
            System.out.print(temp.value +" ");
            temp = temp.next;
        }
    }
}
