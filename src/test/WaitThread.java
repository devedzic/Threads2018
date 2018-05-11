/*
 * Created on May 10, 2018
 *
 */
package test;

public class WaitThread extends Thread {
    
    public WaitThread(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        threadWait();
    }

    private synchronized void threadWait() {
        for (int i = 0; i < 5; i++) {
            try {
                wait(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
            System.out.println(this.getName() + ": " + (i + 1));
        }
    }

}
