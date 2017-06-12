/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2.view;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Tela {
    public static int imprimeMenuInicial(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nMenu");
        System.out.println("----------------------");
        System.out.println("1- Incluir Sugestão");
        System.out.println("2- Consultar Sugestões");
        System.out.println("0- Sair do Programa");
        System.out.println("----------------------");
        return teclado.nextInt();
        
    }
    public static int imprimeMenuConsulta(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nMenu");
        System.out.println("----------------------");
        System.out.println("1- Listar todas as Sugestões");
        System.out.println("2- Consultar por nome");
        System.out.println("3- Consultar por palavra ou frase chave");
        System.out.println("0- Sair do Programa");
        System.out.println("----------------------");
        return teclado.nextInt();
        
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
            System.out.println("Foram encontradas "+cont+" sugestoes.");
        }
        
    }
    
    
}
