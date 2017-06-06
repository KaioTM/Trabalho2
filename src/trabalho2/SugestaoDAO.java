/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author aluno
 */
public class SugestaoDAO {

    public static void incluirSugestao(Sugestao sugestaoIncluida) {
        try {
            PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
            writer.println(sugestaoIncluida.getNome());
            writer.println(sugestaoIncluida.getSugestao());
            writer.println(sugestaoIncluida.getDataSugestao());
            writer.println("\n");
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }
}
