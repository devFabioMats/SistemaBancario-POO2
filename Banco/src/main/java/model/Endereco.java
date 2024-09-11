package model;

public class Endereco {
    private String cidade;
    private String rua;
    private int numero;
    
    public String getCidade(){
        return cidade;
    }
    public void setCidade(String cidade){
        this.cidade=cidade;
    }
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua=rua;
    }
    public int getNum(){
        return numero;
    }
    public void setNum(int numero){
        this.numero=numero;
    }
}
