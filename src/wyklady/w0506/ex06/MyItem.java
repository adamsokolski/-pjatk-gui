package wyklady.w0506.ex06;

public class MyItem {
    private int x, y;

    public MyItem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyItem(" + x + "," + y + ")";
    }
}
