package pessoashospital;

public class paciente extends Cadastro_Hospital{
    private String tiposanguineo;
    private String endereco;
    private String planoSaude;

    paciente(String nome, String genero, int idade, String email, String telefone, String tiposanguineo, String endereco, String planoSaude){

        super(nome, genero, idade, email, telefone);

        this.tiposanguineo = tiposanguineo;
        this.endereço = endereco;
        this.planoSaude = planoSaude;
    }

    public String getiposanguineo(){
        return this.tiposanguineo
    }

    public void settiposanguineo(String tiposanguineo){
        this.tiposanguineo = tiposanguineo;
    }

    public String getenderco(){
        return this.endereco;
    }

    public void setendereco(String endereco){
        this.endereco = endereco;
    }

    public String getplanoSaude(){
        return this.planoSaude;
    }

    public void setplanoSaude(String planoSaude){
        this.planoSaude = planoSaude;
    }


}
