package model;

public class Emprestimo {
    private float quantia;
    private int juros;
    private float quantiaPaga;
    
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
        return quantiaPaga;
    }
    public void setPago(float quantiaPaga){
        this.quantiaPaga=quantiaPaga;
    }
}
