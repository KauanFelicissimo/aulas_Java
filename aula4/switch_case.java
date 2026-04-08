/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;
import java.util.Scanner;
/**
 *
 * @author kauan.sfelicissimo
 */
public class switch_case {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leia.nextInt();
        
        switch(numero)
        {
            case 1:
                System.out.println("O usuário digitou o número 1 \n");
                
            case 2:
                System.out.println("O usuário digitou o número 2 \n");
                break;
            case 3:
                System.out.println("O usuário digitou o número 3 \n");
                break;
            case 4:
                System.out.println("O usuário digitou o número 4 \n");
            case 5:
                System.out.println("O usuário digitou o número 5 \n");
                break;
            default:
                System.out.println("Número inválido");
            
                
        }  
    }
    
}