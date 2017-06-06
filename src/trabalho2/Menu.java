/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Menu {
    public static int imprimeMenu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("1- Incluir Sugestão");
        System.out.println("2- Consultar Sugestões");
        System.out.println("3- Sair do Programa");
        return teclado.nextInt();
        
    }
}
