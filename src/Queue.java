class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public T dequeue() {
        if (this.front == null) {
            return null;
        }
        Node<T> temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }
        return temp.data;
    }

    public boolean isEmpty() {
        return this.front == null;
    }
}