package wyklady.w0506.ex07;

public class MyRunner extends Thread{
    private char chr;

    public MyRunner(char chr) {
        this.chr = chr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.print(chr);
        }
    }
}
