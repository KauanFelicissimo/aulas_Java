/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5_5;

import java.util.Scanner;

/**
 *
 * @author kauan.sfelicissimo
 */
public class Exemplo2 {
    public static int entradaDados(){
        System.out.println("--- Entrada de dados ---");
        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha um número");
        int n = leia.nextInt();
        return n;
    }
   
    public static int menorNumero(int n1, int n2)
    {
        System.out.println("--- Menor número ---");
     if(n1 < n2)
     {
         return n1;
     }
     else
     {
         return n2;
     }
    }
    public static void main(String[] args) {
        
        int n1 = entradaDados();
        int n2 = entradaDados();
                 
        int retorno = menorNumero(n1, n2);
        System.out.println("resultado: " + retorno);
    }
    
}
