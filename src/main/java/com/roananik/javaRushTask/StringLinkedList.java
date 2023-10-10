package com.roananik.javaRushTask;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;



        last.prev.next = node;
        node.prev = last.prev;
        last.prev = node;

//        Node lastNode = last.prev;
//        lastNode.next = node;
//        node.prev = lastNode;
//        last.prev = node;
    }

    public String get(int index) {
        int cur = 0;
        Node find = first.next;
        while ((find) != null) {
            if (cur == index) {
                return find.value;
            }
            find = find.next;
            cur++;

        }
        return null;
        //напишите тут ваш код
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}

