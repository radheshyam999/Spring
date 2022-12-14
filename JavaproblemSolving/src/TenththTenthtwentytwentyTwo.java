import java.io.Serializable;

public final class TenththTenthtwentytwentyTwo<T> implements MyList, Serializable,Cloneable,Comparable {
    TenththTenthtwentytwentyTwo(){}
    TenththTenthtwentytwentyTwo(T... arr){
            addAll(arr);
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    /**

164) Singly linked list Examples in Java
165) Java Program to create and display a singly linked list
166) Java program to create a singly linked list of n nodes and count the number of nodes
167) Java program to create a singly linked list of n nodes and display it in reverse order
168) Java program to delete a node from the beginning of the singly linked list
****169) Java program to delete a node from the middle of the singly linked list
170) Java program to delete a node from the end of the singly linked list
***171) Java program to determine whether a singly linked list is the palindrome
172) Java program to find the maximum and minimum value node from a linked list
***173) Java Program to insert a new node at the middle of the singly linked list
174) Java program to insert a new node at the beginning of the singly linked list

     175) Java program to insert a new node at the end of the singly linked list
176) Java program to remove duplicate elements from a singly linked list

     177) Java Program to search an element in a singly linked list

***/
    private class Node<T>{
        Node next;
        T value;
        Node(){}
        Node(T value){
            this.value = value;
            next = null;
        }
    }
    private Node node;
    public void add(Object value){
        if (node == null) {
        node = new Node(value);
    }else{
        Node temp = node;
        while (temp.next != null){
            temp = temp.next;
            }
            temp.next = new Node(value);
        }
    }

    /**
     * @param value
     */
    @Override
    public void addAtBegning(Object value){
        if (node == null) {
            node = new Node(value);
        }else{
            Node temp = node;
            node = new Node(value);
            node.next = temp;
        }
    }
    // There is bug inside addAll() function need to get fixed
    @Override
    public void addAll(Object[] arr){
        if (node == null) {
            node = new Node(arr[0]);
            Node temp = node;
            int i = 1, len = arr.length;
            while (i < len){
                temp.next = new Node(arr[i]);
                temp = temp.next;
                i++;
            }
        }else {
            Node temp = node;
            int i = 0, len = arr.length;
            while (i < len){
                temp.next = new Node(arr[i]);
                temp = temp.next;
                i++;
            }
        }
    }

    /**
     *
     */

    // insert at particluar location
    @Override
    public void insert(int index, Object value){
        if (node == null) {
            node = new Node(value);
        }else{
            Node temp = node;
            int i = 0;
            while (temp.next != null && i < index){
                temp = temp.next;
            i++;}
            if (temp.next != null) {
                // in that case we need to put that elements between two node
            }else {
            ////
            }
            while (temp.next == null && i < index){
                    temp.next = new Node(Integer.MIN_VALUE);
                    i++;
            }
        }
    }
    // need to delete
    public boolean delete(){
        return true;
    }

    @Override
    public void deleteAll() {
            node = null;
    }

    /**
     * @return
     */

    // for deleting at particular location
    @Override
    public boolean delete(int index){
        Node<T>  temp = node,curr = temp;
        int i = 1;
        temp = temp.next;
        while (temp.next != null){
                if(i == index){
                    curr.next = temp.next;
                }
            curr = temp;
            temp = temp.next;
        }
        return true;
    }


    @Override
    public void reverse(){
        Node  temp  = node;
        printInReverseOrder(temp);

    }
    private void printInReverseOrder(Node n){
        if (n == null) return;
        printInReverseOrder(n.next);
        System.out.print(n.value + " ");
    }

    @Override
    public void printAllElements() {
        Node temp = node;
        while (temp!= null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    @Override
    public int size(){
    Node<T> temp = node;
    int count = 0;
    while (temp != null){
        temp = temp.next;
        count++;
        }
    return count;
    }
    @Override
    public boolean search(Object x){
        int i = 0;
        Node temp  = node;
        while (temp.next != null){
            if (temp.value == x)
                return true;
            temp = temp.next;
        }
    return false;}
    int max() {
        Node <T> temp = node;
        int d = Integer.MIN_VALUE;
        while (temp.next != null){
            if (d < (int)temp.value)
                d = (int)temp.value;
            temp = temp.next;
        }
        return d;
    }
    int min(){
        Node <T> temp = node;
        int d = Integer.MAX_VALUE;
        while (temp.next != null){
            if (d > (int)temp.value)
                d = (int)temp.value;
            temp  = temp.next;
        }
        return d;
    }


    // there is ambiguity in programe
    void removeDuplicate(){
        Node temp = node,curr;
        int v = 0;
        while(temp.next != null){
            curr  = temp;
            v = (int)temp.value;
            Node nex = curr.next;
            while (nex.next != null){
                if (v == (int)nex.value) {
                    // need to remove
                    //curr.next = nex.next;
                }
                curr  = nex;
                System.out.println("curr :: "+curr.value);
                System.out.println("Next :: "+nex.value);
                nex = nex.next;
            }
            temp = temp.next;
        }
    }

}