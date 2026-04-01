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
public class media {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Nota 1: ");
        float nota_1 = leia.nextFloat();
        
        System.out.println("Nota 2: ");
        float nota_2 = leia.nextFloat();
        
        float media = (nota_1 + nota_2) / 2;
        
        System.out.printf("A média do aluno é %.1f\n", media);
        
        if (media < 0 || media > 10)
        {
            System.out.println("Coloque notas de 0 a 10");
        }else if (media >= 5 && media <= 6.9)
        {
            System.out.println("O aluno está em recuperação");
        }else if (media < 5)
        {
            System.out.println("Aluno reprovado");
        }else if (media > 7)
        {
            System.out.println("O aluno foi aprovado");
        }
        
        
    }
}
