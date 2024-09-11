package model;

public class Conta {
    int numeroConta;
    float saldo;
    int agencia;
    
    public int getNumero(){
        return numeroConta;
    }
    public void setNumero(int numeroConta){
        this.numeroConta=numeroConta;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
    public int getAgencia(){
        return agencia;
    }
    public void setAgencia(int agencia){
        this.agencia=agencia;
    }
}
