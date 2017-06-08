/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Trabalho2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeDigitado;
        String sugestaoDigitada;
        Scanner teclado = new Scanner(System.in);
        int i = 9,j=9;
        Sugestoes.getInstancia().carregaSugestoes();

        do {
            i = Menu.imprimeMenuInicial();
            switch (i) {

                case 1:
                    System.out.println("Digite o nome: ");
                    nomeDigitado = teclado.nextLine();
                    System.out.println("Digite sua sugestão: ");
                    sugestaoDigitada = teclado.nextLine();
                    Sugestao sugestaoIncluida = new Sugestao(nomeDigitado, sugestaoDigitada);
                    Sugestoes.getInstancia().getListaSugestoes().add(sugestaoIncluida);
                    Sugestoes.getInstancia().salvaSugestoes();
                    break;
                    
                case 2:
                    i= Menu.imprimeMenuConsulta();
                    switch (i){
                        case 1:
                            for(Sugestao s : Sugestoes.getInstancia().getListaSugestoes()) {
                                System.out.println(s);
                            } 
                            break;
                        case 2:
                            int cont =0;
                            System.out.println("Digite o nome a ser consultado: ");
                            nomeDigitado = teclado.nextLine();
                            for(Sugestao s : Sugestoes.getInstancia().getListaSugestoes()) {
                                if (s.getNome().toLowerCase().contains(nomeDigitado.toLowerCase())){
                                    System.out.println(s);
                                    System.out.println("******");
                                    cont++;
                                }
                            } 
                            if(cont == 0){
                                System.out.println("Nenhum resultado encontrado");
                            }
                            break;
                        case 3:
                            System.out.println("Digite o nome a ser consultado: ");
                    }
                    
                     break;
                            
            }

        } while (i != 0);

    }

}
