package controller;
import model.Conta;

public class ContaControle {
    int numeroConta;
    float saldo;
    int agencia;
    
  //  public ContaCrtl(){
  //      
  // }
    public void transferir(int conta, float valor) {
        //String sql = "UPDATE Conta SET saldo = saldo + ? WHERE conta_id = ?";
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
    }
}
