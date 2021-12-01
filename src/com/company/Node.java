package com.company;

public class Node<T> {
    private T id;
    private Node next=null;

    public Node(T id){
        this.id=id;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
    public T getId(){
        return this.id;
    }
}
