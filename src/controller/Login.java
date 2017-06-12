package controller;

import view.Tela;

public class Login {
    public static boolean validaLogin(String username, String senha) throws InterruptedException{
        boolean valido = false;
        if ((username.equals("coord.eventos") && senha.equals("coord123")) || (username.equals("diretor") && senha.equals("dir123")) ){
            valido = true;
            Tela.acessoConcedido();
        }else{
            Tela.acessoNegado();
        }
        return valido;
    }
    
}