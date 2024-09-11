package controller;
import model.Conta;
import model.Usuario;
import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class TransferirControle {
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/banco";
    public static String user="root";
    public static String password="1234";
    public void transferir(int login, String senha, int conta, float valor, Conta num) {
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        PreparedStatement rs=null;
        Usuario usuario = new Usuario();
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password);
            String sql2 = "UPDATE Conta SET saldo = saldo -'" + valor + "' WHERE cpfUsuario='" + login + "'";
            st = conexao.createStatement();
            st.executeUpdate(sql2);
            String sql3 = "INSERT INTO Extrato(valor,tipo,numConta,cpfUsuario) VALUES(?,?,?,?)";
            rs = conexao.prepareStatement(sql3);
            rs.setFloat(1, valor);
            rs.setString(2, "Transferencia");
            rs.setInt(3,num.getNumero());
            rs.setInt(4,login);
            rs.execute();
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }
    };
    public void atualziar(int conta, float valor) {
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        Usuario usuario = new Usuario();
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password);
            String sql1 = "UPDATE Conta SET saldo = saldo+'" + valor+ "' WHERE numConta='" + conta + "'";
            st = conexao.createStatement();
            st.executeUpdate(sql1);
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }
    };
}


