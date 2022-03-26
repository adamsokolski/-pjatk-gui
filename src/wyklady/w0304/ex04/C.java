package wyklady.w0304.ex04;

public class C implements A, B{
    public static void main(String[] args) {
        new C().xxx();
    }

    @Override
    public void xxx() {
        A.super.xxx();
    }
}



