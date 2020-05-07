/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aline
 */
public class MinhaPrimeiraThread extends Thread{
    public void run(){
        System.out.println("Estou sendo executado por uma thread diferente da principal, veja: " + 
                Thread.currentThread().getName());
        m();
    }
    
    public void m(){}
}
