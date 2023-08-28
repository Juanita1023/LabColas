/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackl;
import java.util.Iterator;

/**
 *
 * @author USUARIO
 */
public class Queue <Item>implements Iterable<Item> {
    //Atributos

    Node<Item> first, last;  

    private class Node<Item> {

        //Atributos
        Item item;
        Node<Item> next;

        //Constructor
        public Node(Item item) {
            this.item = item;
            this.next = null;
        }
    }
    public Queue() {
        
    }
    
    public void Encolar(Item item){
        Node<Item> nuevo = new Node<>(item);
        if (isEmpty()) {
            first = last = nuevo;
        } else {
            last.next = nuevo;
            last = nuevo;
        }
    }
    public Item desEncolar(){
        if (isEmpty()) {
            return null;
        } else {
            Item item = first.item;
            first = first.next;
            if (first == null) {
                last = null; 
            }
            return item;
    }
}
    
    public boolean isEmpty() {
        return first == null;
    }
     public int size() {
        int count = 0;
        Node<Item> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
     }
     public void showQueue() {
        Node<Item> current = first;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }

    public Iterator<Item> iterator() {
        return new ListIterator<>(first);
    }
     private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            this.current = first;
        }

        public boolean hasNext() {
            return current != null;
        }
      public Item next() {
            if (!hasNext()) {
                return null;
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}