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
public class exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual número deseja saber a tabuada de 10?");
        int num = leia.nextInt();
        
        int resultado;
        
        for(int i = 1; i <= 10; i++)
        {
            resultado = num * i;
            
            System.out.println(num + " * " + i + " = " + resultado);
            
        }
    }
}
