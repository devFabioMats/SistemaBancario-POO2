package controller;
import Factory.ConnectionFactory;
import static controller.RecargaControle.driver;
import static controller.RecargaControle.password;
import static controller.RecargaControle.url;
import static controller.RecargaControle.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Conta;

public class EmprestimoControle {
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/banco";
    public static String user="root";
    public static String password="1234";
    
    public void pegarEmprestimo(int login, String senha, float valor, Conta conta){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        PreparedStatement rs=null;
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password);
            String sql2 = "UPDATE Conta SET saldo = saldo +'" + valor + "' WHERE cpfUsuario='" + login + "'";
            st = conexao.createStatement();
            st.executeUpdate(sql2);
            String sql = "INSERT INTO Extrato(valor,tipo,numConta,cpfUsuario) VALUES(?,?,?,?)";
            rs = conexao.prepareStatement(sql);
            rs.setFloat(1, valor);
            rs.setString(2, "Empréstimo");
            rs.setInt(3,conta.getNumero());
            rs.setInt(4,login);
            rs.execute();
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }
    }
    public void pagarEmprestimo(int login, String senha, float valor, Conta conta){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        PreparedStatement rs=null;
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
            String sql = "INSERT INTO Extrato(valor,tipo,numConta,cpfUsuario) VALUES(?,?,?,?)";
            rs = conexao.prepareStatement(sql);
            rs.setFloat(1, valor);
            rs.setString(2, "Empréstimo-pago");
            rs.setInt(3,conta.getNumero());
            rs.setInt(4,login);
            rs.execute();
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }
    }
}
