/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aline
 */
public class TesteRunnable {
    public static void main(String [] args){
        Thread thread = new Thread(new MinhaPrimeiraAtividade());
        thread.start();
        System.out.println("Chegamos ao fim do main ...");
    }
}
