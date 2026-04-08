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
public class exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("DIgite o limite da soma dos números pares: ");
        int limite = leia.nextInt();
        
        int resultado, anterior, proximo;
        
        anterior = 0;
        
        for(int i = 0; i <= limite; i++)
        {
            if (i % 2 == 0)
            {
               proximo = i;
               resultado = proximo + anterior;
               anterior = resultado;
               
                System.out.println("A soma dos números é "+ anterior);
            }
        }
        
        
        
        
    }
}
