package model;
import java.util.Date;

public class CartaoVirtual {
    int numeroCartao;
    int cvv;
    Date expiracao;
    int limite;
    
    public int getCartao(){
        return numeroCartao;
    }
    public void setCartao(int numeroCartao){
        this.numeroCartao=numeroCartao;
    }
    public int getCvv(){
        return cvv;
    }
    public void setCvv(int cvv){
        this.cvv=cvv;
    }
    public Date getExp(){
        return expiracao;
    }
    public void setExp(Date expiracao){
        this.expiracao=expiracao;
    }
    public int getLimite(){
        return limite;
    }
    public void setLimite(int limite){
        this.limite=limite;
    }
}
