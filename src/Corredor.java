/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aline
 */
public class Corredor implements Runnable{

    private double distanciaTotalDaCorrida = 500;
    private double distanciaTotalPercorrida = 0;
    private Thread mainThread;
    private int maximo = 0;
    
    public Corredor (Thread mainThread,int  maximo){
        this.mainThread = mainThread;
        this.maximo = maximo;
    }
    
    @Override
    public void run() {
        
        try{
            mainThread.join();
        }catch(InterruptedException el){
            el.printStackTrace();
        }
        
        while(distanciaTotalPercorrida < distanciaTotalDaCorrida){
            distanciaTotalPercorrida += Math.random() * maximo;
            System.out.printf("%s: %.2fm \n", Thread.currentThread().getName(), distanciaTotalPercorrida);
            if(distanciaTotalPercorrida > distanciaTotalDaCorrida)
                System.out.println(Thread.currentThread().getName() + " acabou");
            try{
                Thread.sleep(2000 + (int)Math.random() * 10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
    
}
