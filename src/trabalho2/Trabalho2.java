package trabalho2;

import controller.Sugestoes;
import view.Tela;

public class Trabalho2 {

    public static void main(String[] args) {
        int i = -1;
        Sugestoes.getInstancia().carregaSugestoes();

        do {
            i = Tela.imprimeMenuInicial();
            switch (i) {
                case 1:
                    Sugestoes.getInstancia().getListaSugestoes().add(Sugestoes.incluiSugestao());
                    Sugestoes.getInstancia().salvaSugestoes();
                    break;
                case 2:
                    i= Tela.imprimeMenuConsulta();
                    switch (i){
                        case 1:
                            Sugestoes.getInstancia().buscaTodasSugestoes();
                            break;
                        case 2:
                            Sugestoes.getInstancia().buscaSugestoesPorNome();
                            break;
                        case 3:
                            Sugestoes.getInstancia().buscaFraseChave();
                        case 9:
                            break;
                    }
                     break;        
            }
        } while (i != 0);
    }
}
