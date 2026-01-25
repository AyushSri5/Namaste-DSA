// Design Linked List
class MyLinkedList {
    Node head;
    Node tail;
    int length;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= length) return -1;

        Node curr = head;
        while(index-- > 0){
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        Node add = new Node(val);
        add.next = head;
        head = add;

        if(length == 0){
            tail = add;
        }
        length++;
    }

    public void addAtTail(int val) {
        Node add = new Node(val);

        if(length == 0){
            head = add;
            tail = add;
        } else {
            tail.next = add;
            tail = add;
        }

        length++;
    }

    public void addAtIndex(int index, int val) {

        if(index < 0 || index > length) return;

        if(index == 0){
            addAtHead(val);
            return;
        }

        if(index == length){
            addAtTail(val);
            return;
        }

        Node curr = head;

        for(int i=0;i<index-1;i++){
            curr = curr.next;
        }

        Node node = new Node(val);
        node.next = curr.next;
        curr.next = node;

        length++;
    }

    public void deleteAtIndex(int index) {

        if(index < 0 || index >= length) return;

        if(index == 0){
            head = head.next;
            length--;

            if(length == 0){
                tail = null;
            }
            return;
        }

        Node curr = head;

        for(int i=0;i<index-1;i++){
            curr = curr.next;
        }

        if(curr.next == tail){
            tail = curr;
        }

        curr.next = curr.next.next;
        length--;
    }
}

class Node {
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}
