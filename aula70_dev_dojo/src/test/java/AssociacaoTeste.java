public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua Cachorro Maluco 123");
        Aluno aluno = new Aluno("Gerson", 12);
        Professor professor = new Professor("Marcos", "Historiador");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("A história do Brasil", local, alunosParaSeminario);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
