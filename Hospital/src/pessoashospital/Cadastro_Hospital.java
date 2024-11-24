package pessoashospital;

import javax.xml.namespace.QName;

public class Cadastro_Hospital {
    private String nome;
    private String genero;
    private int idade;
    private String email;
    private String telefone;

    Cadastro_Hospital(String nome, String genero, int idade, String email, String telefone){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getgenero(){
        return this.genero;
    }

    public void setgenero(String genero){
        this.genero = genero;
    }

    public int getidade(){
        return this.idade;
    }

    public void setidade(int idade){
        this.idade = idade;
    }

    public String getemail(){
        return this.email;
    }

    public void setemail(String email){
        this.email = email;
    }

    public String gettelefone(){
        return this.telefone;
    }

    public void settelefone(String telefone){
        this.telefone = telefone;
    }
}
