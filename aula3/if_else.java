
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;
 
import java.util.Scanner;
/**
 *
 * @author kauan.sfelicissimo
 */
public class if_else {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("---Cálculo média----");
        
        
        //Entrada de dados
        System.out.println("Nota 1: ");
        float n1 = leia.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = leia.nextFloat();
        System.out.println("Nota 3: ");
        float n3 = leia.nextFloat();
        
        //Processamento
        float media = (n1 + n2 + n3) / 3;
        
        //Sáida de dados
        
        System.out.printf("Média: %.1f\n", media);
        
        if (media >= 6)
        {
            System.out.println("O aluno foi aprovado!!!\n");
        } else 
        {
            System.out.println("O aluno foi reprovado!!!\n");
        }
        
    }
            
}
