package trabalho2.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import trabalho2.Sugestao;
import trabalho2.view.Tela;

public class Sugestoes implements Serializable {

    private ArrayList<Sugestao> listaSugestoes;
    private static final String nome_arquivo = "sugestoes.ser";

//Singleton
    private static Sugestoes instancia = null;

    public static synchronized Sugestoes getInstancia() {
        if (instancia == null) {
            instancia = new Sugestoes();
        }
        return instancia;
    }

    private Sugestoes() {
        listaSugestoes = new ArrayList<Sugestao>();
    }
    //Singleton

    public void carregaSugestoes() {

        try {
            FileInputStream fileIn = new FileInputStream(nome_arquivo);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            listaSugestoes = (ArrayList<Sugestao>) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Sistema Carregado");
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Não Encontrado");
            c.printStackTrace();
            return;
        }

    }

    public void salvaSugestoes() {

        try {
            FileOutputStream fileOut = new FileOutputStream(nome_arquivo);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaSugestoes);
            out.close();
            fileOut.close();
            System.out.printf("Salvo com sucesso!");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public ArrayList<Sugestao> getListaSugestoes() {
        return listaSugestoes;
    }

    public void setListaSugestoes(ArrayList<Sugestao> listaSugestoes) {
        this.listaSugestoes = listaSugestoes;
    }

    public void buscaSugestoes() {
        for (Sugestao s : Sugestoes.getInstancia().getListaSugestoes()) {
            System.out.println(s);
        }
    }

    public void buscaSugestoesPorNome() {
        int cont = 0;
        String nomeDigitado = Tela.capturaNome();
        for (Sugestao s : Sugestoes.getInstancia().getListaSugestoes()) {
            if (s.getNome().toLowerCase().contains(nomeDigitado.toLowerCase())) {
                System.out.println(s);
                cont++;
            }
        }
        Tela.imprimeResultado(cont);
    }
    
    public void buscaFraseChave(){
        int cont = 0;
        String fraseChave = Tela.capturaFraseChave();
        for (Sugestao s : Sugestoes.getInstancia().getListaSugestoes()) {
            if (s.getSugestao().toLowerCase().contains(fraseChave.toLowerCase())) {
                System.out.println(s);
                cont++;
            }
        }
        Tela.imprimeResultado(cont);
    }
}
