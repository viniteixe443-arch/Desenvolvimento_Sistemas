package senai;

public class App {
    public static void main(String[] args) {
        
        UnidadeSenai unidade = new UnidadeSenai("SENAI Valença");

        Departamento ti = new Departamento(1, "Tecnologia da Informação", "24 3333-1111");
        Departamento adm = new Departamento(2, "Administração", "24 3333-2222");

        Funcionario f1 = new Funcionario(101, "Ana Silva", "Desenvolvedora", 4500.00);
        Funcionario f2 = new Funcionario(102, "Bruno Costa", "Suporte Técnico", 3200.00);
        Funcionario f3 = new Funcionario(103, "Carla Souza", "Gerente de RH", 5500.00);
        Funcionario f4 = new Funcionario(104, "Diego Lima", "Auxiliar Adm", 2500.00);

        ti.adicionarFuncionarios(f1);
        ti.adicionarFuncionarios(f2);

        adm.adicionarFuncionarios(f3);
        adm.adicionarFuncionarios(f4);

        unidade.adicionarDepartamento(ti);
        unidade.adicionarDepartamento(adm);

        unidade.exibirEstrutura();
    }
}
