/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

import Utils.Tools;
import Models.*;
import java.util.ArrayList;

/**
 *
 * @author thnrg
 */
public class Lab1_Bai4 {
    private static Product tempProduct;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Product> product = new ArrayList();
        
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
        for(Product tempProduct: product)
        {
            System.out.printf("Product name: %s, price: %f, import tax: %f\n", tempProduct.getName(), tempProduct.getPrice(), tempProduct.getImportTax());
        }
    }
}
