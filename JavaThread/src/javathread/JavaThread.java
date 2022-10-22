package javathread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaThread implements Runnable {

    private String nome;
    private int tempo;
    
    public JavaThread(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        Thread thr = new Thread(this);
        thr.start();  
    }
    
    @Override
    public void run() {
        try {
            for(int i = 0; i < 50; i++){
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
         }   
        } catch (InterruptedException ex) {
            ex.printStackTrace();
            
        } System.out.println(nome + " execução encerrada");
    }
 
}

//fonte:
//https://www.youtube.com/watch?v=oWoU0uTEaA0&ab_channel=LoianeGroner