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
import java.util.concurrent.Semaphore;

   public class SemaphoreTest {
     public static void main(String [] args) {
       for (int i=0; i < 10; i++) {
         MyThread mt = new MyThread(i);
         mt.start();
       }
     }
  }

  class MyThread extends Thread {
    private static Semaphore semaphore = new Semaphore(3);
    private int num;
    public MyThread(int num) {
      this.num = num;
    }
    public void run() {
      try {
        semaphore.acquire();
        System.out.println("Thread " + num + " starting run");
        Thread.sleep(1000);
        System.out.println("Thread " + num + " finishing run");
      } catch (InterruptedException ie) {
        System.out.println("MyThread.run IE: " + ie.getMessage());
      } finally {
        semaphore.release();
      }
    }
  }