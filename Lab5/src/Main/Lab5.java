/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Models.*;
import Utils.*;
import java.util.ArrayList;
/**
 *
 * @author thnrg
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
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

    private static void bai1() {
        byte[] data = XFile.read("src/Files/a.gif");
        XFile.write("src/Files/b.gif", data);
    }

    private static void bai2() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Tuan", 5, "CNTT"));
        list.add(new Student("Cuong", 7.5, "TKTW"));
        list.add(new Student("Hanh", 8.5, "CNTT"));
        
        XFile.writeObject("src/Files/students.dat", list);
        
        ArrayList<Student> list2 = (ArrayList<Student>) XFile.readObject("src/Files/students.dat");
        for(Student sv : list2){
            System.out.println(">Ho va ten: " + sv.name);
        }
    }

    private static void bai3() {
        
    }

    private static void bai4() {
        
    }
}
