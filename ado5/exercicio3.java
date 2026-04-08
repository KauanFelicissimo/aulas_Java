/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado5;

import java.util.Scanner;

/**
 *
 * @author kauan.sfelicissimo
 */
public class exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escreva o número que deseja começar sua contagem regressiva");
        int contagem = leia.nextInt();
        
        if (contagem > 0)
        {
            for(int i = contagem; i >= 0 ; i--)
            {
                System.out.println("Falta "+ i + " segundos");
            }
        }
        
        else
        {
            System.out.println("Escreva um número positivo");
        }
    }
}
