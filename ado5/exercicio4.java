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
public class exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Quantos alunos possuem em sua sala: ");
        int alunos = leia.nextInt();
        
        float reprovados , aprovados;
        float media, media_sala, resultado, anterior;
        anterior = 0;
        media_sala = 0;
        reprovados = 0;
        aprovados = 0;
        
       
        
        for(int i = 1; i <= alunos ; i++)
        {
            System.out.println("Qual seu nome");
            String nome = leia.next();
            
            System.out.println("nota 1: ");
            float nota1 = leia.nextFloat();
            
            System.out.println("nota 2: ");
             float nota2 = leia.nextFloat();
            
            media = (nota1 + nota2) / 2;
            
            System.out.printf("O nome do aluno é: %s \n e sua média é %.1f \n " , nome , media);
            
            if (media >= 6)
            {
                System.out.println("Aluno foi aprovado");
                aprovados++;
            }
            else 
            {
                System.out.println("Aluno foi reprovado");
                reprovados++;
            }
            
            System.out.println("Quantidade de alunos reprovados: " + reprovados);
            System.out.println("Quantidade de alunos aprovados: " + aprovados);
            
            media_sala = media_sala + media;
            
            
            
            
        }
        
        media_sala = media_sala / alunos;
              
            System.out.printf("%.1f \n",media_sala);
 
        
    }
}
