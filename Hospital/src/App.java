import pessoashospital.medico;
import pessoashospital.paciente;


public class App {
    public static void main(String[] args) throws Exception {
        
        medico medico1 = new medico(nome:"samuel", genero:"H",
        idade:29, email:"samuel123@gmail.com", telefone:"123456789", especialidade:"ortopedia",
        CRM:"13245")

        paciente paciente1 = new paciente(nome:"lay", genero:"F",
        idade:16, email:"lay3@gmail.com", telefone:"123456789",tiposanguineo:"O+" endereco:"rua taubaté",
        planoSaude:"Amil")
        
        System.out.println(medico1.getNome());
        System.out.println(paciente1.getNome());
    }
}
