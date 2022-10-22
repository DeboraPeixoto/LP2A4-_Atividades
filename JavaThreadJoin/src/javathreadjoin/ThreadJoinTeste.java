package javathreadjoin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadJoinTeste {
    public static void main(String[] args) {
        
       JavaThreadJoin thread = new JavaThreadJoin("Thread número 1", 100);
        
       JavaThreadJoin thread2 = new JavaThreadJoin("Thread número 2", 200);
        
       JavaThreadJoin thread3 = new JavaThreadJoin("Thread número 3", 300);
       
       JavaThreadJoin thread4 = new JavaThreadJoin("Thread número 4", 500);
       
       Thread thr1 = new Thread(thread);
       Thread thr2 = new Thread(thread2);
       Thread thr3 = new Thread(thread3);
       Thread thr4 = new Thread(thread4);
      
       thr1.start();
       thr2.start(); 
       thr3.start(); 
       thr4.start(); 
       
       try {
            thr1.join();
            thr2.join();
            thr3.join();
            thr4.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } System.out.println("Todas as threads terminaram de ser executadas");
    } 
}

//fonte
//https://www.youtube.com/watch?v=f8wwWSwi6bo&ab_channel=LoianeGroner