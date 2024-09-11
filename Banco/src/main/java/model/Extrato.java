package model;

public class Extrato {
    private float valor;
    private String tipo;
    private int numero;
    private int cpf;
    
    public float getValor(){
    return valor;
    }
    public void setValor(float valor){
        this.valor=valor;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    public int getCpf(){
        return cpf;
    };
    public void setCpf(int cpf){
        this.cpf = cpf;
    };
}
