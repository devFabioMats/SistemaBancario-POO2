package controller;
import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Conta;
import model.Usuario;

public class InvestimentoControle {
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/banco";
    public static String user="root";
    public static String password="1234";
        public void investir(int login, String senha, int opcao, float valor, Conta conta, float rendimento){
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
            if(opcao ==1){
                String sql = "INSERT INTO Extrato(valor,tipo,numConta,cpfUsuario) VALUES(?,?,?,?)";
                rs = conexao.prepareStatement(sql);
                rs.setFloat(1, valor);
                rs.setString(2, "Poupanca");
                rs.setInt(3,conta.getNumero());
                rs.setInt(4,login);
                String sql3 = "INSERT INTO Investimento(Quantia,opcao,rendimento,numConta,cpfUsuario) VALUES(?,?,?,?,?)";
                rs = conexao.prepareStatement(sql3);
                rs.setFloat(1, valor);
                rs.setString(2, "Poupanca");
                rs.setFloat(3, rendimento);
                rs.setInt(4,conta.getNumero());
                rs.setInt(5,login);
            }else if(opcao ==2) {
                String sql3 = "INSERT INTO Extrato(valor,tipo,numConta,cpfUsuario) VALUES(?,?,?,?)";
                rs = conexao.prepareStatement(sql3);
                rs.setFloat(1, valor);
                rs.setString(2, "Rendimento especial");
                rs.setInt(3,conta.getNumero());
                rs.setInt(4,login);
                String sql4 = "INSERT INTO Investimento(Quantia,opcao,rendimento,numConta,cpfUsuario) VALUES(?,?,?,?,?)";
                rs = conexao.prepareStatement(sql4);
                rs.setFloat(1, valor);
                rs.setString(2, "Rendimento especial");
                rs.setFloat(3, rendimento);
                rs.setInt(4,conta.getNumero());
                rs.setInt(5,login);
            }
            rs.execute();
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }        
    }
}
