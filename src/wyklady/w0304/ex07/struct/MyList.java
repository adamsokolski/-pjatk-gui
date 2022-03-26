package wyklady.w0304.ex07.struct;

import wyklady.w02.model.Person;
import wyklady.w0304.ex07.struct.Element;

import java.util.Iterator;

public class MyList<T extends Person> implements Iterable<T> {
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

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Element<T> tmpHead = MyList.this.head;
            @Override
            public boolean hasNext() {
                return tmpHead != null;
            }

            @Override
            public T next() {
                T tmp = tmpHead.getData();
                tmpHead = tmpHead.getNext();
                return tmp;
            }
        };
    }
}
