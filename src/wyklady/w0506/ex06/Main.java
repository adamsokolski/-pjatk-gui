package wyklady.w0506.ex06;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       /* List<MyItem> myItemList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            MyItem myItem = new MyItem(
                    (int)(Math.random()*99),
                    (int)(Math.random()*99)
            );
            myItemList.add(myItem);
            System.out.println(myItem);
        } */


        /*
        List<MyItem> myItemList = new LinkedList<>();
        Integer x = null,
                y = null;
        for (int i = 0; i < 10; i++) {
            x = y;
            y = (int)(Math.random()*99);
            if(x != null) {
                MyItem myItem = new MyItem(
                        (int)(Math.random()*99),
                        (int)(Math.random()*99)
                );
                x = null;
                y = null;
                myItemList.add(myItem);
                System.out.println(myItem);
            }

        } */

        List<MyItem> myItemList = Stream.generate(Math::random)
                .limit(10)
                .collect(MyCollectionTask.collector());


        myItemList.stream()
                .forEach(System.out::println);

    }
}
