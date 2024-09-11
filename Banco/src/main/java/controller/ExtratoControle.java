package controller;
import model.Conta;
import model.Usuario;
import model.Extrato;
import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExtratoControle {
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/banco";
    public static String user="root";
    public static String password="1234";
    
    public List<Extrato> pegarExtrato(int login, String senha){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        PreparedStatement rs=null;
        List<Extrato> extratos = new ArrayList<>();
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password); 
            String sql = "SELECT * FROM Extrato WHERE cpfUsuario ='" + login + "'";
            st = conexao.createStatement();
            ps = st.executeQuery(sql);
            while(ps.next()){
                Extrato extrato = new Extrato();
                extrato.setValor(ps.getFloat(1));
                extrato.setTipo(ps.getString(2));
                extrato.setNumero(ps.getInt(3));
                extrato.setCpf(ps.getInt(4));
                extratos.add(extrato);
            }
            st.close();
            ps.close();
            conexao.close();
        }catch(Exception  ex){
            System.out.println(ex);
        }
        return extratos;
    }
}
