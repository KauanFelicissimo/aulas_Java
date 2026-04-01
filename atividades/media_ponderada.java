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
public class media_ponderada {
    public static void main(String[] args) {
        System.out.println("----Média ponderada----");
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Qual a primeira nota: ");
        float n1 = leia.nextFloat();
        
        System.out.println("Qual a segunda nota: ");
        float n2 = leia.nextFloat();
        
        System.out.println("Qual a terceira nota: ");
        float n3 = leia.nextFloat();
        
        float media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
        
        System.out.printf("A média é: %.1f \n", media);
        
        
    }
    
}
