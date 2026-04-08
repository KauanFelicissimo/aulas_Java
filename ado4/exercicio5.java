/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

import java.util.Scanner;

/**
 *
 * @author kauan.sfelicissimo
 */
public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escreva o código da bebida ");
        int codigo = leia.nextInt();
        
        switch(codigo)
        {
            case 1:
                System.out.println("Café expresso R$5,00");
                break;
            case 2:
                System.out.println("Cappuccino R$8,50");
                break;
            case 3:
                System.out.println("Latte R$9,00");
                break;
            case 4: 
                System.out.println("Chá gelado R$6,00");
                break;
            default:
                System.out.println("Código inválido");
            
        }
        
        
    }
}