package SequenceList;



public class SequenceList<T> {
    private final int maxSize = 10;
    private T[] listArray;
    private int length;

    // 创建顺序表
    public SequenceList() {
        this.length = 0;
        this.listArray = (T[]) new Object[maxSize];
    }
    // 创建顺序表
    public SequenceList(int n) {
        if(n < 0 || n > maxSize) {
            System.out.println("Error");
            System.exit(1);
        } else {
            this.length = 0;
            this.listArray = (T[]) new Object[n];
        }
    }

    //表背增加表项
    public void add(T object) {
        listArray[length] = object;
        length++;
    }

    //插入表项
    public boolean insert(T object, int position) {
        if(position < 0 || position > length + 1) {
            System.out.println("error");
            return false;
        } else if(length == listArray.length) {
            T[] p = (T[]) new Object[length * 2];
            for(int i = 0; i < length + 1; i++) {
                p[i] = listArray[i];
            }
            listArray = p;
        }
        for (int i = length + 1 ; position < i; i--) {
            listArray[i - 1] = listArray[i];
            i--;
        }
        listArray[position] = object;
        return true;
    }

    //移除表项
    public boolean remove( int position) {
        if(isEmpty()||position < 0 || position > length) {
            System.out.println("error");
            return false;
        }
        for ( int i = position; i < length + 1; i++) {
            listArray[i] = listArray[i + 1];
        }
        return true;
    }

    //判断顺序表是否为空
    public boolean isEmpty() {
        return length == 0;
    }

    //清空顺序表
    public void  clear() {
        length = 0;
    }

    //更新表项
    public boolean update(T object, int position) {
        if(isEmpty() || position < 0 || position > length) {
            System.out.println("error");
            return false;
        }
        listArray[position] = object;
        return true;
    }

    //遍历表项
    public void nextOrder() {
        for(int i = 0; i < length; i++) {
            System.out.println(listArray[i]);
        }
    }
}
