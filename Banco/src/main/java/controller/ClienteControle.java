package controller;
import model.Usuario;
import model.Endereco;
import model.Conta;
import Factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class ClienteControle {
    public static String driver="com.mysql.cj.jdbc.Driver";
    public static String url="jdbc:mysql://localhost:3306/banco";
    public static String user="root";
    public static String password="1234";
    private int login;
    private String senha;
    
    public Usuario verificarLogin(int login, String senha){
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
            String sql = "SELECT * FROM Usuario WHERE cpf ='" + login + "' and senha= '" + senha + "'";
            st = conexao.createStatement();
            ps = st.executeQuery(sql);
            while(ps.next()){
                usuario.setCpf(ps.getInt(2));
                usuario.setSenha(ps.getString(3));
            }
            st.close();
            ps.close();
            conexao.close();
        }catch(Exception  ex){
            System.out.println(ex);
        }
        return usuario;
    }
    public void criarConta(Usuario usuario, Endereco ender){
        Connection conexao = null;
        PreparedStatement ps = null;
        Random gerador = new Random();
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password);
            String sql = "INSERT INTO Usuario(nome,cpf,senha) VALUES(?,?,?);";
            ps = conexao.prepareStatement(sql);
            ps.setString(1,usuario.getNome());
            ps.setInt(2, usuario.getCpf());
            ps.setString(3, usuario.getSenha());
            ps.execute();
            String sql2 = "INSERT INTO Endereco(cidade,rua,num,cpfUsuario) VALUES(?,?,?,?)";
            ps = conexao.prepareStatement(sql2);
            ps.setString(1, ender.getCidade());
            ps.setString(2, ender.getRua());
            ps.setInt(3,ender.getNum());
            ps.setInt(4,usuario.getCpf());
            ps.execute();
            String sql3 = "INSERT INTO Conta(numConta, saldo, agencia, cpfUsuario) VALUES(?,?,?,?)";
            ps = conexao.prepareStatement(sql3);
            ps.setInt(1, gerador.nextInt(99999)+1000);
            ps.setFloat(2, 1000);
            ps.setInt(3, gerador.nextInt(8)+1);
            ps.setInt(4, usuario.getCpf());
            ps.execute();
            ps.close();
            conexao.close();
        }catch(Exception  ex){
            System.out.println(ex);
        }
        System.out.println("Conta criada com sucesso");
    }
    public Usuario consultar(int login, String senha){
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
            String sql = "SELECT * FROM Usuario WHERE cpf ='" + login + "' and senha= '" + senha + "'";
            st = conexao.createStatement();
            ps = st.executeQuery(sql);
            while(ps.next()){
                usuario.setNome(ps.getString(1));
                usuario.setCpf(ps.getInt(2));
                usuario.setSenha(ps.getString(3));
            }
            st.close();
            ps.close();
            conexao.close();
        }catch(Exception  ex){
            System.out.println(ex);
        }  
        return usuario;
    };
    public Endereco consultar2(int login, String senha){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        PreparedStatement rs=null;
        Endereco ender = new Endereco();
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password); 
            String sql2 = "SELECT * FROM Endereco WHERE cpfUsuario ='" + login + "'";
            st = conexao.createStatement();
            ps = st.executeQuery(sql2);
            while(ps.next()){
                ender.setCidade(ps.getString(1));
                ender.setRua(ps.getString(2));
                ender.setNum(ps.getInt(3));
            }
            st.close();
            ps.close();
            conexao.close();
        }catch(Exception  ex){
            System.out.println(ex);
        }  
        return ender;
    };
       public Conta consultar3(int login, String senha){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        PreparedStatement rs=null;
        Conta conta = new Conta();
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password); 
            String sql3 = "SELECT * FROM Conta Where cpfUsuario='" + login + "'";
            st = conexao.createStatement();            
            ps = st.executeQuery(sql3);
            while(ps.next()){
                conta.setNumero(ps.getInt(1));
                conta.setSaldo(ps.getFloat(2));
                conta.setAgencia(ps.getInt(3));
            }
            st.close();
            ps.close();
            conexao.close();
        }catch(Exception  ex){
            System.out.println(ex);
        }  
        return conta;
    };
    public void alterarSenha(int login, String senha, String valor){
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
            String sql = "UPDATE Usuario SET senha = '" + valor + "' WHERE cpf='" + login + "' and senha= '" + senha + "'";
            st = conexao.createStatement();
            st.executeUpdate(sql);
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }

    };
    public void alterarEndereco1(int login, String senha, String valor){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password);
            String sql = "UPDATE Endereco SET cidade ='" + valor + "' WHERE cpfUsuario='" + login + "'";
            st = conexao.createStatement();
            st.executeUpdate(sql);
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }
    };
    public void alterarEndereco2(int login, String senha, String valor){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password);
            String sql = "UPDATE Endereco SET rua ='" + valor + "' WHERE cpfUsuario='" + login + "'";
            st = conexao.createStatement();
            st.executeUpdate(sql);
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }
    };
    public void alterarEndereco3(int login, String senha, int valor){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password);
            String sql = "UPDATE Endereco SET num ='" + valor + "' WHERE cpfUsuario='" + login + "'";
            st = conexao.createStatement();
            st.executeUpdate(sql);
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }
    };
    public void deletar(int login, String senha){
        Connection conexao = null;
        ResultSet ps = null;
        Statement st = null;
        try{
            Class.forName(driver);
        }catch(Exception ex){
            System.out.println(ex);
        }
        try{
            conexao = DriverManager.getConnection(url,user,password);
            String sql2 = "DELETE FROM Endereco WHERE cpfUsuario='" + login + "'";
            st = conexao.createStatement();
            st.executeUpdate(sql2);
            String sql5 = "DELETE FROM Investimento WHERE cpfUsuario='" + login + "'";
            st.executeUpdate(sql5);
            String sql3 = "DELETE FROM Conta WHERE cpfUsuario='" + login + "'";
            st.executeUpdate(sql3);
            String sql4 = "DELETE FROM Cartao WHERE cpfUsuario='" + login + "'";
            st.executeUpdate(sql4);
            String sql6 = "DELETE FROM Emprestimo WHERE cpfUsuario='" + login + "'";
            st.executeUpdate(sql6);
            String sql7 = "DELETE FROM Extrato WHERE cpfUsuario='" + login + "'";
            st.executeUpdate(sql7);
            String sql = "DELETE FROM Usuario WHERE cpf='" + login + "' and senha= '" + senha +  "'";
            st.executeUpdate(sql);
            st.close();
        }catch(Exception ex){
            System.out.println(ex);    
        }
    };
}


