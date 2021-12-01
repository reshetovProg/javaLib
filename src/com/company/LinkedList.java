package com.company;

/**
 *
 * <a name="begin"></a>
 * Класс односвязный список
 * @see
 * <ls>
 *     <li>
 *         @see LinkedList#LinkedList(int)
 *         <b>конструктор LinkedList(int)</b>
 *     </li>
 *     <li>
 *         @see LinkedList#push(Object)
 *         <b>добавление push(Object)</b>
 *     </li>
 *     <li>
 *         @see LinkedList#pop()
 *         <b>удаление pop()</b>
 *     </li>
 *     <li>
 *         @see LinkedList#peek()
 *         <b>верхний элемент peek()</b>
 *     </li>
 *     <li>
 *         @see LinkedList#empty()
 *         <b>наличие элементов empty()</b>
 *     </li>
 * </ls>

 * @autor Иван Решетов
 * @version 1.1
 *
 */

public class LinkedList<T> {
    private Node head = null;
    private int size=0;
    private int maxSize;

    /**
     * Конструктор списка
     * @param maxSize размер списка
     *
     *
     */
    public LinkedList(int maxSize){
        this.maxSize=maxSize;
    }

    /**
     * Количество элементов<br>
     * <a href="#begin">начало</a>
     * @return текущее количество элементов
     *
     */
    public int getSize(){
        return this.size;
    }

    /**
     * Добавление элемента в список
     *
     * @param el добавляемый элемент
     * <br><a href="#begin">начало</a>
     */
    public void push(T el){
        Node newEl = new Node(el);
        if(size<maxSize){
            if (head==null){
                head=newEl;
                size++;
            }
            else {
                Node buf=head;
                for(int i=0; i<=size-1; i++){
                    if(buf.getNext()==null){
                        buf.setNext(newEl);
                        size++;
                    }
                    else{
                        buf=buf.getNext();
                    }
                }
            }
        }


    }

    /**
     * Удаляет последний элемент списка<br>
     * и возвращает его значение<br>
     * <a href="#begin">начало</a>
     * @return удаляемый элемент
     */
    public T pop(){
        if (size!=0){
            Node buf = head;
            for(int i=0; i<size-1; i++){
                buf=buf.getNext();
            }
            T temp = (T)buf.getId();
            buf.setNext(null);
            size--;
            if(size==0) head=null;
            return temp;
        }
        else return null;

    }

    /**
     * Последний элемент<br>
     * <a href="#begin">начало</a>
     * @return последний элемент
     */
    public T peek(){
        if(size!=0){
            Node buf = head;
            for(int i=0; i<size-1; i++){
                buf=buf.getNext();
            }
            T temp = (T)buf.getId();
            return temp;
        }
        else return null;

    }

    /**
     * Определение пустой ли список<br>
     * <a href="#begin">начало</a>
     * @return bool значение пустой ли список
     */
    public boolean empty(){
        if (size==0) return true;
        else return false;
    }

    /**
     * Вывод списка
     */
    public void show(){
        Node buf=head;
        for(int i=0; i<size; i++){
            System.out.print(buf.getId()+" ");
            buf=buf.getNext();
        }
        System.out.println();
    }

}
