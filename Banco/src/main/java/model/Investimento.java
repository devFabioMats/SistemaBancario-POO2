package model;

public class Investimento {
    private float quantia;
    private char opcao;
    private int rendimento;
    
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
    public int getRendimento(){
        return rendimento;
    }
    public void setRendimento(int rendimento){
        this.rendimento=rendimento;
    }
}
