class Node<E>{
    E data;
    Node<E> next = null;
    public Node(E data){
        this.data = data;
    }
}

class ListStack<E>{
    Node<E> top = null;
    public boolean empty(){
        return top == null;
    }

    //头插法插入新节点，实现入栈
    public void push(E data){
        Node<E> newNode = new Node<E>(data);
        newNode.next = top;
        top = newNode;
    }

    public E pop(){
        if(this.empty()){
            return null;
        }
        E data = top.data;
        top = top.next;
        return data;
    }

    public E peek(){
        if(empty())
            return null;
        return top.data;
    }
}
