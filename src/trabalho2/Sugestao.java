package trabalho2;

import java.io.Serializable;
import java.text.SimpleDateFormat;

public class Sugestao implements Serializable{

    public Sugestao(String nome, String sugestao) {
        this.nome = nome;
        this.sugestao = sugestao;
        this.dataSugestao = new SimpleDateFormat("dd.MM.yyyy").format(new java.util.Date());
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
                + "\nData da sugestão: " + dataSugestao
                + "\n**********";
        
    }
    
}
