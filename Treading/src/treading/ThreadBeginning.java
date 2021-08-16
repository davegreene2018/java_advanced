/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treading;

/**
 *
 * @author Daveg
 */
public class ThreadBeginning implements Runnable {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        ThreadBeginning m1 = new ThreadBeginning();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}

