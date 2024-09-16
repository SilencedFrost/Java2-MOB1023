/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Models.NoTaxProduct;
import Models.Product;
import Utils.Tools;
import java.util.ArrayList;

/**
 *
 * @author thnrg
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int excerise = 0;
        while(excerise < 2 || excerise > 4)
        {
            excerise = Tools.getInt("Choose exercise (2-4): ");
        }
        switch(excerise)
        {
            case 2 -> bai2();
            case 3 -> bai3();
            case 4 -> bai4();
        }
    }
    
    public static void bai2()
    {
        ArrayList<Product> product = new ArrayList();
        
        //Output
        for(int i = 0; i < 5; i++)
        {
            Product tempProduct = new Product();
            System.out.printf("Product number %d:\n", i + 1);
            tempProduct.setName(Tools.getString("Product name: "));
            tempProduct.setPrice(Tools.getDouble("Product price: "));
            product.add(tempProduct);
        }
        
        //Input
        System.out.println("Output: ");
        for(Product tempProduct: product)
        {
            System.out.printf("Product name: %s, price: %f, import tax: %f\n", tempProduct.getName(), tempProduct.getPrice(), tempProduct.getImportTax());
        }
    }
    
    public static void bai3()
    {
        ArrayList<Product> product = new ArrayList();
        Product tempProduct;
        //Input
        for(int i = 0; i < 2; i++)
        {
            tempProduct = new Product();
            System.out.printf("Product number %d:\n", i + 1);
            tempProduct.setName(Tools.getString("Product name: "));
            tempProduct.setPrice(Tools.getDouble("Product price: "));
            product.add(tempProduct);
        }
        
        tempProduct = new NoTaxProduct();
        System.out.println("Product number 3:");
        tempProduct.setName(Tools.getString("Product name: "));
        tempProduct.setPrice(Tools.getDouble("Product price: "));
        product.add(tempProduct);
        
        //Output
        System.out.println("Output: ");
        for(Product temp: product)
        {
            System.out.printf("Product name: %s, price: %f, import tax: %f\n", temp.getName(), temp.getPrice(), temp.getImportTax());
        }
    }
    
    public static void bai4()
    {
        ArrayList<Product> product = new ArrayList();
        Product tempProduct;
        //Input
        for(int i = 0; i < 2; i++)
        {
            tempProduct = new Product();
            System.out.printf("Product number %d:\n", i + 1);
            tempProduct.setName(Tools.getString("Product name: "));
            tempProduct.setPrice(Tools.getDouble("Product price: "));
            product.add(tempProduct);
        }
        
        tempProduct = new NoTaxProduct();
        System.out.println("Product number 3:");
        tempProduct.setName(Tools.getString("Product name: "));
        tempProduct.setPrice(Tools.getDouble("Product price: "));
        product.add(tempProduct);
        
        //Output
        System.out.println("Output: ");
        for(Product temp: product)
        {
            System.out.printf("Product name: %s, price: %f, import tax: %f\n", temp.getName(), temp.getPrice(), temp.getImportTax());
            temp.insert();
            temp.update();
            temp.delete();
            temp.select();
        }
    }
}
