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
public class exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);     
        
        System.out.println("Digite o número do mês e descubra sua estação do ano");
        int mes = leia.nextInt();
        
        switch(mes)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("A estação é o verão");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("A estação é o outono");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("A estação é o inverno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("A estação é o primavera");
                break;
            default:
                System.out.println("Escolha um mês valido");
            
            
        }
    }
}
