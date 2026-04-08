/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado3;
import java.util.Scanner;
/**
 *
 * @author kauan.sfelicissimo
 */
public class idade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("--- Classificação de idade ---");
        
        System.out.println("Digite a sua idade:");
        int idade = leia.nextInt();
        
        if (idade >= 0 && idade <= 12)
        {
            System.out.println("Você é uma criança");
        } else if (idade >= 13 && idade <= 17)
        {
            System.out.println("Você é um adolescente");
        } else if(idade >= 18 && idade <= 59)
        {
            System.out.println("Você é um adulto");
        } else if(idade >= 60)
        {
            System.out.println("Você é um idoso");
        } else
        {
            System.out.println("Idade Inválida!!!");
        }
    }
    
}