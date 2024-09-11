package model;

public class Usuario {
    private String nome;
    private long cpf;
    private String senha;
    private Endereco ender = new Endereco();
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public long getCpf(){
        return cpf;
    }
    public void setCpf(long cpf){
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
