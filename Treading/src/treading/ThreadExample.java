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
public class ThreadExample implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //Create threads
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();
        new Thread(t1).start();
        new Thread(t2).start();
        System.out.println("Done");
        
        //get thread ID
        long threadId = Thread.currentThread().getId();
        //2 possible solutions
        //#1
        System.out.println("Thread # " + threadId + " is doing this task");
        //#2
        System.out.println("Thread ID: "+Thread.currentThread().getId());
        
        //get thread name
        System.out.println("Thread name: "+Thread.currentThread().getName());
        
        //create new thread and set the name of this thread
        ThreadBeginning newthread = new ThreadBeginning();
        Thread t3 = new Thread(newthread);
        
        // change the thread name
        t3.setName("Admin Thread");

        // prints the thread after changing name
        System.out.println("Thread after changing name = " + t3);
        
        //get thread name
        System.out.println("Thread name: "+t3.getName());
        
        //get thread name
        System.out.println("Thread ID: "+t3.getId());
        
        //get the number of the active threads
        int count = Thread.activeCount();
        System.out.println("currently active threads = " + count);

    }
}
