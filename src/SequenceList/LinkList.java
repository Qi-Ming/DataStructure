package SequenceList;

public class LinkList<T> {
    private Node<T> head;
    private int length;

    //创建单链表
    public LinkList() {
        length = 0;
        head = new Node<T>(null);
    };

    //获取头节点
    public Node<T> getHead() {
        return head;
    }

    //在链表尾增加节点
    public void add(T object) {
        Node<T> p, q;
        p = head;
        q = head.next;
        while (q != null) {
            p = q;
            q = q.next;
        }
        p.next = new Node<T>(object, null);
        length++;
    }

    //插入节点
    public boolean insert(T object, int position) {
        if(isEmpty() || position > length) {
            System.out.println("error");
            return false;
        }
        Node<T> p, q;
        int i = 1;
        p = head;
        q = head.next;
        while (i < position) {
            p = q;
            q = q.next;
            i++;
        }
        p.next = new Node<T>(object, q);
        length++;
        return true;
    }

    //删除节点
    public boolean remove(int position) {
        if(isEmpty() || position > length) {
            System.out.println("error");
            return false;
        }
        Node<T> p, q;
        p = head;
        q = head.next;
        int i = 1;
        while (i < position) {
            p = q;
            q = q.next;
            i++;
        }
        p.next = q.next;
        length--;
        return true;
    }

    //清除链表
    public void clear() {
        length = 0;
        head.next = null;
    }

    //查找节点
    public T search(int position) {
        if(isEmpty() || position > length) {
            System.out.println("error");
            return null;
        }
        Node<T> p, q;
        int i = 1;
        p = head;
        q = head.next;
        while (i < position) {
            p = q;
            q = q.next;
            i++;
        }
        return  q.data;
    }

    //遍历节点
    public void nextOrder() {
        if(isEmpty()) {
            System.out.println("error");
        }
        Node<T> p, q;
        int i = 1;
        p = head;
        q = head.next;
        while (i < length + 1) {
            p = q;
            System.out.println(p.data);
            q = q.next;
            i++;
        }
    }

    //修改节点
    public void modify(T object, int position) {
        if(isEmpty() || position > length) {
            System.out.println("error");
        }
        Node<T> p, q;
        int i = 1;
        p = head;
        q = head.next;
        while (i < position) {
            p = q;
            q = q.next;
            i++;
        }
        q.data = object;
    }

    //判断节点是否为空
    public boolean isEmpty() {
        return length == 0;
    }
}
