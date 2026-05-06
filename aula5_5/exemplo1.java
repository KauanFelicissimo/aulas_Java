/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5_5;

import java.util.Scanner;


public class exemplo1 {
    public static void digaOla(String nome)
    {       
        for (int i = 1; i < 4; i++) {
            System.out.println(i + ". Olá " + nome);
        }
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        digaOla("Kauan");        
        digaOla("Gyro");        
        digaOla("Zappeli");        
    }
    
}
