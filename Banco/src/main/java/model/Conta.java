package model;

public class Conta {
    private int numeroConta;
    private float saldo;
    private int agencia;
    
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
