package w2.struct;

import w2.model.Person;

public class MyList<T extends Person> {
    protected Element<T> head;

    public MyList() {
        this.head = null;
    }

    public void add(T data) {
        this.head = new Element(data, head);
    }

    public void show() {
        Element<T> tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getData().getDesc());
            tmp = tmp.getNext();
        }
    }
}
