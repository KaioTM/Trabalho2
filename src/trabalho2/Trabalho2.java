/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
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
        int i = 0;

        do {

            switch (Menu.imprimeMenu()) {

                case 1:
                    System.out.println("Digite o nome: ");
                    nomeDigitado = teclado.nextLine();
                    System.out.println("Digite sua sugestão: ");
                    sugestaoDigitada = teclado.nextLine();
                    Sugestao sugestaoIncluida = new Sugestao(nomeDigitado, sugestaoDigitada);
                    SugestaoDAO.incluirSugestao(sugestaoIncluida);
            }

        } while (i == 3);

    }

}
