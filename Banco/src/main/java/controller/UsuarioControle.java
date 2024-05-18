package controller;
import model.Usuario;
import model.Endereco;

public class UsuarioControle {
    String nome;
    int cpf;
    String senha;
    Endereco ender = new Endereco();
    
  //  public UsuarioCrtl(){
  //      
  // }
    
    public void criarConta(Usuario usuario){
        //String sql = "insert into Usuario(matricula, nome) VALUES(?,?)";
        System.out.println("Conta criada com sucesso");
    }
}
