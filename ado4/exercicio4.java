/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado4;

import java.util.Scanner;

/**
 *
 * @author kauan.sfelicissimo
 */
public class exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o dia dasemana ");
        int dia = leia.nextInt();
        
        System.out.println("E qual o digito finall da placa?");
        int placa = leia.nextInt();
        
        switch(dia)
        {
            case 1:
                if (placa == 1 || placa == 2)
                {
                    System.out.println("O veiculo final " + placa + " não é permitido a circulação");
                }
                else 
                {
                    System.out.println("O véiculo pode circular hoje");
                }
                break;
            case 2:
                if (placa == 3 || placa == 4)
                {
                    System.out.println("O veiculo final " + placa + " não é permitido a circulação");
                }
                else 
                {
                    System.out.println("O véiculo pode circular hoje");
                }
                break;
            case 3:
                if (placa == 5 || placa == 6)
                {
                    System.out.println("O veiculo final " + placa + " não é permitido a circulação");
                }
                else 
                {
                    System.out.println("O véiculo pode circular hoje");
                }
                break;
            case 4:
                if (placa == 7 || placa == 8)
                {
                    System.out.println("O veiculo final " + placa + " não é permitido a circulação");
                }
                else 
                {
                    System.out.println("O véiculo pode circular hoje");
                }
                break;
            case 5:
                if (placa == 9 || placa == 0)
                {
                    System.out.println("O veiculo final " + placa + " não é permitido a circulação");
                }
                else 
                {
                    System.out.println("O véiculo pode circular hoje");
                }
                break;
            default:
                System.out.println("DIgite um dia válido");
        }
        
        
    }
}
