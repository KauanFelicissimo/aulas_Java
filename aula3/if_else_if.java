/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;
import java.util.Scanner;
/**
 *
 * @author kauan.sfelicissimo
 */
public class if_else_if {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("--- Verificar número ---");
        
        System.out.println("Digute um número: ");
        float num = leia.nextFloat();
        
        if (num > 0)
        {
            System.out.println("è um número positivo");
        }else if(num < 0)
        {
            System.out.println("O número é negativo");   
        }else
        {
            System.out.println("O número é igual a zero");
        }
    }
    
}
