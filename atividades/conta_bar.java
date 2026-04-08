/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

import java.util.Scanner;

/**import java.util.Scanner;
 *
 * @author kauan.sfelicissimo
 */
public class conta_bar {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("---Calculo de conta para 4 pessoas----");
        
        System.out.println("Escreva o valor total da conta: ");
        float valor_base = leia.nextFloat();
        
        System.out.println("Qual foi o valor extra da primeira pessoa");
        float valor_ex1 = leia.nextFloat();
        
        System.out.println("Qual foi o valor extra da segunda pessoa");
        float valor_ex2 = leia.nextFloat();
        
        System.out.println("Qual foi o valor extra da terceira pessoa");
        float valor_ex3 = leia.nextFloat();
        
        System.out.println("Qual foi o valor extra da quarta pessoa");
        float valor_ex4 = leia.nextFloat();
        
        float valor_final = valor_base / 4;
        
        float valor_ps1 = valor_final + valor_ex1;
        float valor_ps2 = valor_final + valor_ex2;
        float valor_ps3 = valor_final + valor_ex3;
        float valor_ps4 = valor_final + valor_ex4;
        
        System.out.printf("O valor para cada pessoa é \nPessoa 1: %.2f\nPessoa 2: %.2f\nPessoa 3: %.2f\nPessoa 4: %.2f\n" , valor_ps1 , valor_ps2 , valor_ps3 , valor_ps4);                                   
    }
}