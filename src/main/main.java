package main;

import controller.Sugestoes;
import java.io.IOException;
import view.Tela;

public class main {

    public static void main(String[] args) throws IOException, InterruptedException {
        int i = -1;
        Sugestoes.getInstancia().carregaSugestoes();

        do {
            Tela.limpaTela();
            i = Tela.imprimeMenuInicial();
            switch (i) {
                case 1:
                    Sugestoes.getInstancia().getListaSugestoes().add(Sugestoes.incluiSugestao());
                    Sugestoes.getInstancia().salvaSugestoes();
                    break;
                case 2:
                    Tela.limpaTela();
                    i= Tela.imprimeMenuConsulta();
                    switch (i){
                        case 1:
                            Tela.limpaTela();
                            Tela.headerSistema();
                            Sugestoes.getInstancia().buscaTodasSugestoes();
                            Tela.aguardandoTecla();
                            break;
                        case 2:
                            Tela.limpaTela();
                            Tela.headerSistema();
                            Sugestoes.getInstancia().buscaSugestoesPorNome();
                            Tela.aguardandoTecla();
                            break;
                        case 3:
                            Tela.limpaTela();
                            Tela.headerSistema();
                            Sugestoes.getInstancia().buscaFraseChave();
                            Tela.aguardandoTecla();
                            break;
                        case 9:
                            break;
                    }
                     break;        
            }
        } while (i != 0);
    }
}
