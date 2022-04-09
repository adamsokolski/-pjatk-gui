package wyklady.w0506.ex10;

public class MyRunner extends Thread{
    private char chr;

    private static Object objS = new Object();

    public MyRunner(char chr) {
        this.chr = chr;
    }

    @Override
    public synchronized void run() {
        try {
            synchronized (objS) {
                this.wait();
                for (int i = 0; i < 3; i++) {
                    System.out.print(chr);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
