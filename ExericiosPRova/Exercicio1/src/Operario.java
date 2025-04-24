public class Operario extends Funcionario {
    private int horasExtras;
    private double valorHorasExtras;

    public Operario(String nome, double salario, String cargo, int horasExtras, double valorHorasExtras) {
        super(nome, salario, cargo);
        this.horasExtras = horasExtras;
        this.valorHorasExtras = valorHorasExtras;
    }

    public double getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(double valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double calcSalarioTotal() {
        return getSalario() + (horasExtras * valorHorasExtras);
    }
}
