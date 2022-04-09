package wyklady.w0506.ex06;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;

public class MyCollectionTask {


    Integer x = null,
            y = null;

    private void accept(Double d) {
        x = y;
        y = (int)(d*99);
        if(x != null) {
            MyItem myItem = new MyItem(
                    (int)(Math.random()*99),
                    (int)(Math.random()*99)
            );
            x = null;
            y = null;
            list.add(myItem);
        }
    }

    private MyCollectionTask combine(MyCollectionTask other) {
        throw new UnsupportedOperationException();
    }

    private List<MyItem> finish() {
        return list;
    }




    List<MyItem> list = new LinkedList<>();
    public static Collector<Double, ?, List<MyItem>> collector() {
        return Collector.of(
                MyCollectionTask::new,
                MyCollectionTask::accept,
                MyCollectionTask::combine,
                MyCollectionTask::finish
        );
    }
}
