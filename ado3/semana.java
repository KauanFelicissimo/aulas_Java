
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
public class semana {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("--- Dia da semana ---");
        
        System.out.println("Escolha um dia da semana com um número de 1 a 7: ");
        int dia = leia.nextInt();
        
        if(dia == 1 || dia == 7)
        {
            System.out.println("Fim de semana!!!");
        } else if (dia > 1 && dia < 7)
        {
            System.out.println("Dia de semana!!!");
        }else 
        {
            System.out.println("Número inválido!!!");
        }
        
    }
    
}
