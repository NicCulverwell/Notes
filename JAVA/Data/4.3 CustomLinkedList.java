package Data;

class CustomLinkedList {
    
    public static void main(String [] args) {

        MyLinkedList<String> list = new MyLinkedList<String>();


        list.append("Durban");
        list.append("Cape Town");
        list.append("Pretoria");
        list.append("Johannesburg");

        list.print();

    }

}

class MyLinkedList<E> {

    Node<E> head;

    public MyLinkedList() {
        this.head = null;
    }

    public void append(E data) {
        Node<E> node = new Node<>(data);

        if(head == null) {
            head = node;
            return;
        }


        Node<E> last = head;

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;

    }

    public void print() {

        Node<E> current = head;

        while(current != null) {
            System.out.println(current.getData() + " ");
            current = current.next;
        }
    }


}

class Node<E> {
    E element;
    Node<E> next;


    public Node(E element) {
        this.element = element;
    }


    public E getData() {
        return element;
    }
}