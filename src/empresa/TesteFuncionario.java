package empresa;

public class TesteFuncionario {
    public static void main(String[] args) {
        funcionario f = new funcionario("Jão",123, 1600);
        f.setCargo("Diretor");
        f.setIdade(30);
        f.alteraSalario(15);
        f.imprimir();
    }
}
