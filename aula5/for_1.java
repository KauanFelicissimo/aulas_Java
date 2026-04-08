/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;

import java.util.Scanner;

/**
 *
 * @author kauan.sfelicissimo
 */
public class for_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("de onde começa?");
        int inicio = leia.nextInt();
        
        System.out.println("de onde termina?");
        int fim = leia.nextInt();
        
        int i;
        
        if (inicio < fim)
        {
            for(i = inicio; i <= fim ; i++)
            {
                if(i%2 == 0)
                {   
                    System.out.println("PAR: " + i);
                }
            }
        }
        else if (fim < inicio){
            for(i = inicio; i >= fim; i--)
            {
                if(i%2 != 0)
                {
                    System.out.println("Impar" + i);
                }
            }
        }
        else
        {
            System.out.println("Os números escolhidos são iguais");
        }
        
        
    }
}
