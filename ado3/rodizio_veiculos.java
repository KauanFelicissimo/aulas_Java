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
public class rodizio_veiculos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("--- Rodízio do veículos ---");
        
        System.out.println("Escolha um dia da semana de 1 a 5");
        int dia = leia.nextInt();
        
        System.out.println("E qual o último digito da sua placa de 0 a 9");
        int placa = leia.nextInt();
        
        
        if (placa < 0 || placa > 9 || dia < 1 || dia > 5)
        {
            System.out.println("Digite um valor valido");
        }
        else if (dia == 1 && placa == 1 || placa  == 2)
        {
            System.out.println("O seu veículo pode não circular");
        } 
        else if (dia == 1 && placa > 2)
        {
            System.out.println("O seu veículo pode circular");
        }
        else if (dia == 2 && placa == 3 || placa  == 4)
        {
            System.out.println("Seu veículo não pode circular");
        } 
        else if (dia == 2 && placa < 3 && placa > 4)
        {
            System.out.println("O seu veículo pode circular");
        }
        else if (dia == 3 && placa == 5 || placa  == 6)
        {
            System.out.println("Seu veículo não pode circular");
        } else if (dia == 3 && placa < 5 && placa > 6)
        {
            System.out.println("O seu veículo pode circular");
        }
        else if (dia == 4 && placa == 7 || placa  == 8)
        {
            System.out.println("Seu veículo não pode circular");
        } else if (dia == 4 && placa < 7 && placa > 8)
        {
            System.out.println("O seu veículo pode circular");
        }
        else if (dia == 5 && placa == 9 || placa  == 0)
        {
            System.out.println("Seu veículo não pode circular");
        } 
        else if (dia == 5 && placa < 9 && placa > 0)
        {
            System.out.println("O seu veículo pode circular");
        }
        
    }
    
}