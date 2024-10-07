/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Utils.*;
import java.util.ArrayList;

/**
 *
 * @author thnrg
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int exercise = 0;
        
        Lab8 lab8 = new Lab8();
        
        while(exercise < 1 || exercise > 4)
        {
            exercise = Tools.getInt("Choose exercise (1-4): ");
        }

        switch(exercise)
        {
            case 1 -> lab8.bai1();
            case 2 -> lab8.bai2();
            case 3 -> lab8.bai3();
            case 4 -> lab8.bai4();
        }
    }
    
    public void bai1()
    {
        ArrayList list = new ArrayList();
        
        list.add((Integer) 123);
        list.add((Double) 0.432);
        list.add((boolean) true);
        list.add((String) "This is lab8 - section 1");
        
        for(Object object: list)
        {
            System.out.println(object);
        }
    }
    
    public void bai2()
    {
        ArrayList<Integer> myarr = new ArrayList<>();
        
        for(int i = 1; i <= 10; i++)
        {
            myarr.add(i);
        }
        
        for(Integer integer: myarr)
        {
            System.out.println(integer);
        }
    }
    
    public void bai3()
    {
        
    }
    
    public void bai4()
    {
        
    }
    
}
