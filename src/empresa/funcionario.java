package empresa;

public class funcionario {
    private String nome;
    private int nMatricula;
    private int idade;
    private String cargo;
    private float salario;


    public funcionario () {
        this.salario = 1500;
    }

    public funcionario (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public funcionario(String nome, int nMatricula, float salario) {
        this.nome = nome;
        this.nMatricula = nMatricula;
        this.salario = salario;
    }

    public void alteraSalario (float porcentagem) {
        float ajuste = this.salario * porcentagem / 100;
        this.salario = this.salario + ajuste;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnMatricula() {
        return nMatricula;
    }

    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
