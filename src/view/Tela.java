package view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import model.Sugestao;

/**
 *
 * @author aluno
 */
public class Tela {
    public static void headerSistema() throws IOException, InterruptedException{
        Tela.limpaTela();
        System.out.println("*************************************************************");
        System.out.println("********** Sistema de Inclusão de Sugestões v 1.0 ***********");
        System.out.println("*************************************************************");
    }
    public static int imprimeMenuInicial() throws IOException, InterruptedException{
        int opcao = -1;
        Scanner teclado = new Scanner(System.in);
        headerSistema();
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
    public static int imprimeMenuConsulta() throws IOException, InterruptedException{
        int opcao = -1;
        Scanner teclado = new Scanner(System.in);
        headerSistema();
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
    public static void limpaTela() throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static String capturaNome(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nDigite o nome: ");
        return teclado.nextLine();
    }
    
    public static String capturaSugestao(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nDigite a Sugestao: ");
        return teclado.nextLine();
    }
    
    public static String capturaFraseChave(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nDigite a frase a ser consultada: ");
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
    
    public static void aguardandoTecla(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tecle enter para continuar...");
        teclado.nextLine();
    }
    public static void imprimeSugestao(Sugestao s){
        System.out.println(s);
    }
    
    public static void telaEmEspera() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
    }
    public static String capturaLogin(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu login: ");
        return teclado.nextLine();
    }
    public static String capturaSenha(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        return teclado.nextLine();
    }
    public static void acessoConcedido() throws InterruptedException{
        System.out.println("Acesso concedido!");
        TimeUnit.SECONDS.sleep(1);
    }
    public static void acessoNegado() throws InterruptedException{
        System.out.println("Acesso negado!");
        TimeUnit.SECONDS.sleep(1);
    }
}
