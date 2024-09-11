package model;

public class CartaoVirtual {
    private long numeroCartao;
    private int cvv;
    private int limite;
    
    public long getCartao(){
        return numeroCartao;
    }
    public void setCartao(long numeroCartao){
        this.numeroCartao=numeroCartao;
    }
    public int getCvv(){
        return cvv;
    }
    public void setCvv(int cvv){
        this.cvv=cvv;
    }
    public int getLimite(){
        return limite;
    }
    public void setLimite(int limite){
        this.limite=limite;
    }
}
