/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2;

import java.text.SimpleDateFormat;

/**
 *
 * @author aluno
 */
public class Sugestao {

    public Sugestao(String nome, String sugestao) {
        this.nome = nome;
        this.sugestao = sugestao;
        this.dataSugestao = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());;
    }
    private String nome;
    private String sugestao;
    private String dataSugestao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSugestao() {
        return sugestao;
    }

    public void setSugestao(String sugestao) {
        this.sugestao = sugestao;
    }

    public String getDataSugestao() {
        return dataSugestao;
    }

    public void setDataSugestao(String dataSugestao) {
        this.dataSugestao = dataSugestao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ""
                + "\nSugestão: " + sugestao + ""
                + "\nData da sugestão: " + dataSugestao;
    }
    
}
