/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Sugestao;

/**
 *
 * @author aluno
 */
public class Tela {
    public static int imprimeMenuInicial(){
        int opcao = -1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nMenu");
        System.out.println("----------------------");
        System.out.println("1- Incluir Sugestão");
        System.out.println("2- Consultar Sugestões");
        System.out.println("0- Sair do Programa");
        System.out.println("----------------------");
        System.out.print("Opção: ");
        try{
            opcao = teclado.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("A opção digitada não é um valor válido");
        }
        return opcao;
    }
    public static int imprimeMenuConsulta(){
        int opcao = -1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nMenu");
        System.out.println("----------------------");
        System.out.println("1- Listar todas as Sugestões");
        System.out.println("2- Consultar por nome");
        System.out.println("3- Consultar por palavra ou frase chave");
        System.out.println("9- Voltar");
        System.out.println("0- Sair do Programa");
        System.out.println("----------------------");
        System.out.print("Opção: ");
        try{
            opcao = teclado.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("A opção digitada não é um valor válido");
        }
        return opcao;    
    }
    public static String capturaNome(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        return teclado.nextLine();
    }
    
    public static String capturaSugestao(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a Sugestao: ");
        return teclado.nextLine();
    }
    
    public static String capturaFraseChave(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a frase a ser consultada: ");
        return teclado.nextLine();
    }
    
    public static void imprimeSeparador(){
        System.out.println("**********"); 
    }
    public static void imprimeResultado(int cont){
        if (cont == 0){
            System.out.println("Nenhum resultado encontrado");     
        }else{
            if (cont == 1){
               System.out.println("Foi encontrada "+cont+" sugestão.");
            }else{
               System.out.println("Foram encontradas "+cont+" sugestões."); 
            }
            
        }
        
    }
    public static void imprimeSugestao(Sugestao s){
        System.out.println(s);
    }
    
    
}
