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
public class Exemplo3 {
    
    public static int menu(){
        int opcao;
        do {
            System.out.println("--- Menu ---");
            Scanner leia = new Scanner(System.in);
            System.out.println("1- Adição \n2- subtração \n3- multiplicação \n4- divisão");
            System.out.println("Escolha uma das opções");
            opcao = leia.nextInt();
            if(opcao < 1 || opcao > 4)
            {
                System.out.println("Opção inválida");
            }
        } while (opcao < 1 || opcao > 4);
        return opcao;
    }
    
    public static double entradaDados(){
        System.out.println("--- Entrada de dados ---");
        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha um número para a sua operação");
        double num = leia.nextDouble();
        return num;
    }
    
    public static double adicao(double n1, double n2){
        System.out.println("--- Adição ---");
        return n1+n2;
    }
    
    public static double subtracao(double n1, double n2){
        System.out.println("--- Subtração ---");
        return n1-n2;
    }
    
    public static double multiplicacao(double n1, double n2){
        System.out.println("--- Multiplicação ---");
        return n1*n2;
    }
    
    public static double divisao(double n1, double n2){
        System.out.println("--- Divisão ---");
        return n1/n2;
    }
    
    public static void imprimir(double resultado) {
        System.out.println("--- Impressão ---");
        System.out.printf("O resultado é: %.2f\n" , resultado);
        
    }
    
    public static double controlador(int opcao, double n1, double n2){
        System.out.println("--- Controlador ---");
        double resultado;
        switch(opcao){
            case 1:
                resultado = adicao(n1,n2);
                break;
            case 2:
                resultado = subtracao(n1,n2);
                break;
            case 3:
                resultado = multiplicacao(n1,n2);
                break;
            case 4:
                resultado = divisao(n1, n2);
                break;
            default:
                System.out.println("Opção inválida");
                resultado = 0;
                break;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("--- Main ---");
        
        int op = menu();
        double n1 = entradaDados();
        double n2 = entradaDados();
        double resultado = controlador(op , n1, n2);
        imprimir(resultado);
    }
}
