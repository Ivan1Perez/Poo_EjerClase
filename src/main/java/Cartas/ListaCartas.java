package Cartas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaCartas {

    private int size;
    private Node head;

    public ListaCartas(){
        size = 0;
        head = null;
    }

    public void shuffle(Carta[] cartas){
        List<Carta> cartaList = Arrays.asList(cartas);
        Collections.shuffle(cartaList);
        cartaList.toArray(cartas);

        clear();

        for(Carta c : cartas)
            add(c);
    }
    private void clear() {
        size=0;
        head=null;
    }

    public void add(Carta c){
        Node node = new Node(c);

        if(head==null)
            head = node;
        else {
            node.setNext(head);
            head = node;
        }

        size++;
    }

    public Carta[] toArray(){
        Carta[] aux = new Carta[size];
        int i = 0;

        while(head.getNext()!=null){
            aux[i] = head.getInfo();
            head = head.getNext();
            i++;
        }
        return aux;
    }

    @Override
    public String toString() {
        return "ListaCartas{" +
                "size=" + size +
                ", head=" + head +
                '}';
    }

    public class Node{

        private Carta info;
        private Node next;

        public Node (Carta info){
            this.info = info;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Carta getInfo() {
            return info;
        }

        @Override
        public String toString() {
            return info + ((next!=null)?", "+next:" }");
        }
    }

}
