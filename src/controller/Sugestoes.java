package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import model.Sugestao;
import view.Tela;

public class Sugestoes implements Serializable {

    private ArrayList<Sugestao> listaSugestoes;
    private static final String nomeArquivo = "sugestoes.ser";

//Singleton
    private static Sugestoes instancia = null;

    public static synchronized Sugestoes getInstancia() {
        if (instancia == null) {
            instancia = new Sugestoes();
        }
        return instancia;
    }

    private Sugestoes() {
        listaSugestoes = new ArrayList<>();
    }
    //Singleton
 

    //Getters e Setters
    public ArrayList<Sugestao> getListaSugestoes() {
        return listaSugestoes;
    }

    public void setListaSugestoes(ArrayList<Sugestao> listaSugestoes) {
        this.listaSugestoes = listaSugestoes;
    }
    //Getters e Setters
    
    public void carregaSugestoes() throws InterruptedException {

        try {
            FileInputStream fileIn = new FileInputStream(nomeArquivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            listaSugestoes = (ArrayList<Sugestao>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Sistema Carregado");
            Tela.telaEmEspera();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Não Encontrado");
            c.printStackTrace();
            return;
        }
    }

    public void salvaSugestoes() throws InterruptedException {

        try {
            FileOutputStream fileOut = new FileOutputStream(nomeArquivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaSugestoes);
            out.close();
            fileOut.close();
            System.out.printf("Salvo com sucesso!");
            Tela.telaEmEspera();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

// Métodos responsáveis por busca no ArrayList de sugestões
    public void buscaTodasSugestoes() {
        for (Sugestao s : Sugestoes.getInstancia().getListaSugestoes()) {
            Tela.imprimeSugestao(s);
        }
    }

    public void buscaSugestoesPorNome() {
        int cont = 0;
        String nomeDigitado = Tela.capturaNome();
        for (Sugestao s : Sugestoes.getInstancia().getListaSugestoes()) {
            if (s.getNome().toLowerCase().contains(nomeDigitado.toLowerCase())) {
                Tela.imprimeSugestao(s);
                cont++;
            }
        }
        Tela.imprimeResultado(cont);
    }

    public void buscaFraseChave() {
        int cont = 0;
        String fraseChave = Tela.capturaFraseChave();
        for (Sugestao s : Sugestoes.getInstancia().getListaSugestoes()) {
            if (s.getSugestao().toLowerCase().contains(fraseChave.toLowerCase())) {
                Tela.imprimeSugestao(s);
                cont++;
            }
        }
        Tela.imprimeResultado(cont);
    }
// Métodos responsáveis por busca no ArrayList de sugestões
    
    public static Sugestao incluiSugestao(){
        Sugestao sugestaoIncluida = new Sugestao(Tela.capturaNome(), Tela.capturaSugestao());
        return sugestaoIncluida;
    }
}
