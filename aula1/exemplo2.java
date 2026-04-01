/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author kauan.sfelicissimo
 */
public class exemplo2 {
    
    public static void main(String[] args) {
        
        System.out.println("--- Cálculo da comissão ---");
        
        Scanner leia = new Scanner(System.in);
        
        float com = 0.05f;
        
        System.out.println("Digite o ID do vendedor: ");
        
        int id = leia.nextInt();
        
        System.out.println("Código peça: ");
        
        int CodP = leia.nextInt();
        
        System.out.println("Preço Unit: ");
        
        float preco = leia.nextFloat();
        
        System.out.println("Quantidade: ");
        
        int quant = leia.nextInt();
        
        float total = quant * preco;
        float totalCom = total * com;
        
        System.out.println("ID: " + id);
        System.out.println("total: " + total);
        System.out.println("comissão: " + totalCom);
        
       
            
    }
    
    
}
