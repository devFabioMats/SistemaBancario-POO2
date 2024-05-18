package model;

public class Investimento {
    float quantia;
    char opcao;
    float rendimento;
    
    public float getQuantia(){
        return quantia;
    }
    public void setQuantia(float quantia){
        this.quantia=quantia;
    }
    public char getOpcao(){
        return opcao;
    }
    public void setOpcao(char opcao){
        this.opcao=opcao;
    }
    public float getRendimento(){
        return rendimento;
    }
    public void setRendimento(float rendimento){
        this.rendimento=rendimento;
    }
}
