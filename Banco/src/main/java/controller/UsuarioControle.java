package controller;
import model.Conta;
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

    public void depositar(Conta conta, float valor) {
        //String sql = "UPDATE Conta SET saldo = saldo + ? WHERE conta_id = ?";
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
    }

    public void sacar(Conta conta, float valor) {
        //String sql = "UPDATE Conta SET saldo = saldo - ? WHERE conta_id = ?";
        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(Conta contaOrigem, Conta contaDestino, float valor) {
        //String sqlOrigem = "UPDATE Conta SET saldo = saldo - ? WHERE conta_id = ?";
        //String sqlDestino = "UPDATE Conta SET saldo = saldo + ? WHERE conta_id = ?";
        if (contaOrigem.getSaldo() >= valor) {
            contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            System.out.println("Transferência de R$ " + valor + " realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public float verificarSaldo(Conta conta) {
        //String sql = "SELECT saldo FROM Conta WHERE conta_id = ?";
        float saldo = conta.getSaldo();
        System.out.println("Seu saldo é de: R$ " + saldo);
        return saldo;
    }

    public void alterarSenha(Usuario usuario, String senha){
        //String sql = "UPDATE Usuario SET senha = ? WHERE cpf = ?";
        usuario.setSenha(senha);
        System.out.println("Senha alterada com sucesso!");
    }

    public void excluirConta(Usuario usuario){
        //String sql = "DELETE FROM Usuario WHERE cpf = ?";
        usuario = null;
        System.out.println("Conta excluída com sucesso!");
        
    }
}
