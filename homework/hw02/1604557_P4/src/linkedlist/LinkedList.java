package linkedlist;

import linkedlist.Node;

public class LinkedList {
    protected Node head;

    public <T> LinkedList() {
        this.head = new Node(null);
    }

    public String toString() {
        return this.head.toString();
    }

    public void addLink(Node data) {
        this.head.setNext(data);
    }
}
