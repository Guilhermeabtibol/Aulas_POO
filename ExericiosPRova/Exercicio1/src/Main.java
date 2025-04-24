public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Guilhermao", 50000.0, "Gerente de TI", 10);
        Operario operario = new Operario("Guilherme", 18000.0, "Enchedor de Massa", 10, 20);

        System.out.println("Nome: " + gerente.getNome() + " Salario: " + gerente.getSalario() + " Cargo: " + gerente.getCargo() + " Bonus: " + gerente.getBonus());
        System.out.println("Nome: " + operario.getNome() + " Salario:  " + operario.getSalario() + " Cargo: " + operario.getCargo() + " Horas Extras: " + operario.getHorasExtras());
    }
}