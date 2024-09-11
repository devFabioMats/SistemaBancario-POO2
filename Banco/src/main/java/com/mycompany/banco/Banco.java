package com.mycompany.banco;

import view.ViewUsuario;
import view.ViewDeposito;
import view.ViewSaque;

public class Banco {

    public static void main(String[] args) {
        ViewUsuario telaUsuario = new ViewUsuario();
        telaUsuario.setVisible(true);

        ViewDeposito telaDeposito = new ViewDeposito();
        telaDeposito.setVisible(true);

        ViewSaque telaSaque = new ViewSaque();
        telaSaque.setVisible(true);
    }
}
