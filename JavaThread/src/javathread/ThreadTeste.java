package javathread;

public class ThreadTeste {
    public static void main(String[] args) {
       JavaThread thread = new JavaThread("Thread número 1", 100);
        
       JavaThread thread2 = new JavaThread("Thread número 2", 200);
        
       JavaThread thread3 = new JavaThread("Thread número 3", 300);
       
       JavaThread thread4 = new JavaThread("Thread número 4", 500);
    }
}
//fonte:
//https://www.youtube.com/watch?v=oWoU0uTEaA0&ab_channel=LoianeGroner