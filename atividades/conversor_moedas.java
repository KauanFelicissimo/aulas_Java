/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author kauan.sfelicissimo
 */
public class conversor_moedas {
    public static void main(String[] args) {
        
        Scanner leia =  new Scanner(System.in);
        System.out.println("----conversor de moedas----");
        
        
        System.out.println("Qual o valor você deseja converter: ");
        float real = leia.nextFloat();
        
        System.out.println("Qual o valor da cotaçaõ do dolar atual: ");
        float cotacao = leia.nextFloat();
        
        float dolar = real / cotacao;
        
        System.out.printf("O valor convertido será: %.2f \n", dolar);
        
    }
    
    
    
}
