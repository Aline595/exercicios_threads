/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aline
 */
import java.util.Random;
public class TesteCorredor {
    public static void main (String[] args){
        Thread mainThread = Thread.currentThread();
        
        Random random = new Random();
        
        Thread corredor1 = new Thread(new Corredor(mainThread, random.nextInt(100)), "senna");
        Thread corredor2 = new Thread(new Corredor(mainThread, random.nextInt(100)), "Barrichello");
        Thread corredor3 = new Thread(new Corredor(mainThread, random.nextInt(100)), "Mansell");
        Thread corredor4 = new Thread(new Corredor(mainThread, random.nextInt(100)), "Piquet");
        Thread corredor5 = new Thread(new Corredor(mainThread, random.nextInt(100)), "Hilll");
        
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
        
        System.out.println("Começou !!!!");
    }
}
