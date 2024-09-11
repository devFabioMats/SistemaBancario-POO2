package com.mycompany.banco;
import model.Usuario;
import model.Endereco;
import controller.UsuarioControle;
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
    public static String user="LCF";
    public static String password="129129";
            
    public static void main(String[] args) {
        Principal tela = new Principal();
        tela.setVisible(true);
        try{
                   System.out.println("Carregando o driver...");
                   Class.forName(driver);
		      System.out.println("Driver carregado com sucesso");
            }catch(Exception e){
                    System.out.println("Falha no carregamento");
        }
        try{
                   System.out.println("Conectando o BD...");
                   Connection conexao = DriverManager.getConnection(url, user, password);   	      
                   System.out.println("Conexao realizada com sucesso");
            }catch(Exception e){
                    System.out.println("Falha na conexao com o BD");
        }
    }

}
