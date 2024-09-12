/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunClasses;

import Utils.Tools;
import Models.Product;
import java.util.ArrayList;

/**
 *
 * @author thnrg
 */
public class Lab1_Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
}
