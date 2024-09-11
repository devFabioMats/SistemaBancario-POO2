package com.mycompany.banco;
import model.Usuario;
import model.Endereco;
import controller.ClienteControle;
import javax.swing.JFrame;
import view.ViewCriarUsuario;
import view.ViewTransferir;
import view.ViewCartao;
import view.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Banco {
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/banco";
    public static String user="root";
    public static String password="1234";
            
    public static void main(String[] args) {
        Principal tela = new Principal();
        tela.setVisible(true);

    }

}
