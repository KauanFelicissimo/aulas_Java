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
public class exercicio1 {
    public static void main(String[] args) {                     
    Scanner leia = new Scanner(System.in);
    
        System.out.println("Escolha um número que represente um dia da semana ");
        int dia = leia.nextInt();
        
        switch(dia)
        {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia comercial");
                break;
            default:
                System.out.println("Número inbálido");
                
             
        }
    
    }
}