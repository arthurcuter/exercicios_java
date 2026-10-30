public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime() {
        System.out.println("==============");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("$ Seminarios cadastrados:");
        if(seminarios != null) {
            for (Seminario seminario : seminarios) {
                System.out.println("$ Titulo: " + seminario.getTitulo());
                if(seminario.getAlunos() != null) {
                    System.out.println("$ # Alunos: ");
                    for(Aluno aluno : seminario.getAlunos()) {
                        System.out.println("$ # Nome: " + aluno.getNome());
                        System.out.println("$ # Idade: " + aluno.getIdade());
                    }
                } else {
                    System.out.println("$ # Sem alunos nesse seminario!");
                }
                System.out.println("$ Local: " + seminario.getLocal().getEndereco());
            }
        }
        System.out.println("==============");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
