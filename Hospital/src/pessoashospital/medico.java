package pessoashospital;

public class medico extends Cadastro_Hospital {
    private String especialidade;
    private String CRM;
    
    medico(String nome, String genero, int idade, String email, String telefone, String especialidade, String CRM){

        super(nome, genero, idade, email, telefone);

        this.especialidade = especialidade;
        this.CRM = CRM;
    }

    public String getespecialidades(){
        return this.especialidade
    }

    public void setespecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public String getCRM(){
        return this.CRM;
    }

    public void setCRM(String CRM){
        this.CRM = CRM;
    }
}
