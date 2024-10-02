/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Enums.Career;
import Models.PolyStudent;
import Utils.Tools;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author thnrg
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        FlatLightLaf.setup();
        int exercise = 0;

        Lab7 lab7 = new Lab7(); 
        while(exercise < 1 || exercise > 6)
        {
            exercise = Tools.getInt("Choose exercise (1-6): ");
        }

        switch(exercise)
        {
            case 1 -> lab7.bai1();
            case 2 -> lab7.bai2();
            case 3 -> lab7.bai3();
            case 4 -> lab7.bai4();
        }
    }

    private void bai1() 
    {
        PolyStudent sv = new PolyStudent();
        sv.setFullname("Nguyen Van Teo");
        //sv.career = Career.UDPM;
        sv.setCareer(Career.valueOf("UDPM"));
        
        sv.print();
    }
    
    private void bai2() 
    {
        
    }
    
    private void bai3() 
    {
        
    }
    
    private void bai4() 
    {
        
    }
}
