/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Classes.*;
import UI.*;
import Utils.Tools;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;

/**
 *
 * @author thnrg
 */
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        FlatLightLaf.setup();
        int excerise = 0;
        while(excerise < 1 || excerise > 4)
        {
            excerise = Tools.getInt("Choose exercise (1-4): ");
        }
        switch(excerise)
        {
            case 1 -> bai1();
            case 2 -> bai2();
            case 3 -> bai3();
            case 4 -> bai4();
        }
    }

    private static void bai1() 
    {
        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        
        thread1.start();
        thread2.start();
    }

    private static void bai2() 
    {
        JFrame clock = new Clock();
        clock.setVisible(true);
    }

    private static void bai3() 
    {
        Thread t1 = new OddThread();
        Thread t2 = new EvenThread();
        t1.start();
        try
        {
             t1.join();
        }
        catch(InterruptedException ex)
        {
        }
        t2.start();
    }

    private static void bai4() 
    {
        JFrame xosokienthiet = new XoSoKienThiet();
        xosokienthiet.setVisible(true);
    }
    
}
