package model;

public class Usuario {
    String nome;
    int cpf;
    String senha;
    Endereco ender = new Endereco();
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf=cpf;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }
    public Endereco getEnder(){
        return ender;
    }
    public void setEnder(Endereco ender){
        this.ender=ender;
    }
}
