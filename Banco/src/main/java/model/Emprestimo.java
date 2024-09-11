package model;

public class Emprestimo {
    float quantia;
    int juros;
    float pago;
    
    public float getQuantia(){
        return quantia;
    }
    public void setQuantia(float quantia){
        this.quantia=quantia;
    }
    public int getJuros(){
        return juros;
    }
    public void setJuros(int juros){
        this.juros=juros;
    }
    public float getPago(){
        return pago;
    }
    public void setPago(float pago){
        this.pago=pago;
    }
}
