/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;
import java.util.Scanner;

/**
 *
 * @author kauan.sfelicissimo
 */
public class exemplo1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("----Calcula média");
        
        //entrada de dados
        
        System.out.println("Qual o nome do aluno: ");
        String aluno = leia.nextLine();
        
        System.out.println("Nota 1: ");
        float n1 = leia.nextFloat();
        
        System.out.println("Nota 2: ");
        float n2= leia.nextFloat();
        
        System.out.println("Nota 3: ");
        float n3 = leia.nextFloat();
        
        //Processamento
        
        float media = (n1 + n2 + n3) /3;
        
     

        
        //Print formatado com 1 casa decimal
        
        System.out.printf("Aluno: %s \nnota 1: %.1f\nnota 2: %.1f\nnota 3: %.1f\nmédia: %.1fkaua\n" , aluno , n1 , n2 , n3 , media);
    }
            
}