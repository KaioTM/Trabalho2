/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2.model;

import trabalho2.controller.Sugestoes;
import trabalho2.view.Tela;
import java.util.Scanner;
import trabalho2.Sugestao;

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
            i = Tela.imprimeMenuInicial();
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
                    i= Tela.imprimeMenuConsulta();
                    switch (i){
                        case 1:
                            Sugestoes.getInstancia().buscaSugestoes();
                            break;
                        case 2:
                            Sugestoes.getInstancia().buscaSugestoesPorNome();
                            break;
                        case 3:
                            Sugestoes.getInstancia().buscaFraseChave();
                    }
                    
                     break;
                            
            }

        } while (i != 0);

    }

}
