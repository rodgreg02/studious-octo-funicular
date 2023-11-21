public class List<T> {

    Node<T> first;
    int length;


    public T add(T value) {
        Node<T> node = new Node<>(value);
        if (first == null) {
            first = node;
        } else {
            Node<T> temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        length++;
        return value;
    }


    public T add(T value, int index) {
        if (index < 0 || index >= length+1 || first == null) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> node = new Node<>(value);
        if(index == 0){
            node.next = first;
            first = node;
            length++;
            return null;
        }
        Node<T> previous = null;
        Node<T> current = first;
        int currentIndex = 0;
        while(currentIndex < index){
            previous = current;
            current = current.next;
            currentIndex++;
        }
        previous.next = node;
        node.next = current;
        length++;
        return value;
    }


    public T get(int index) {
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public T remove(int index) {
        if (index < 0 || index >= length || first == null) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            first = first.next;
            length--;
            return first.value;
        }

        Node<T> current = first;
        Node<T> previous = null;
        int currentIndex = 0;

        while (currentIndex < index) {
            previous = current;
            current = current.next;
            currentIndex++;
        }

        previous.next = current.next;
        length--;
        return current.value;
    }

    public void seeList(){
        for (int i = 0; i < length ; i++) {
            System.out.println(this.get(i));
        }
    }
}

