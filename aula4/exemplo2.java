/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;
import java.util.Scanner;
/**
 *
 * @author kauan.sfelicissimo
 */
public class exemplo2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Instituição");
        String nome = leia.next();
        
        //exemplo com switch case
        switch(nome)
        {
            case "Senac":
            case "SENAC":
            case "senac":
                System.out.println("Nome está correto");
                break;
            default:
                System.out.println("Nome inválido");
                
        }
        
        //Exemplo if e else
        
        if (nome.equals("Senac") || nome.equals("SENAC")|| nome.equals("senac"))
        {
            System.out.println("Nome está correto");
        }
        else
        {
            System.out.println("Nome inválido");
        }
    }
    
}
