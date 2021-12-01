package com.company;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Integer> list = new LinkedList<Integer>(10);
        System.out.println(list.empty());
	    list.push(5);
        list.push(7);
        list.push(4);
        list.show();
        System.out.println(list.getSize());
        System.out.println(list.pop());
        list.show();
        System.out.println(list.peek());
        System.out.println(list.empty());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.peek());
        list.push(9);
        System.out.println(list.peek());



    }
}
