public class Veiculo {
    public String modelo;
    public Marca marca;
    public String cor;
    public Double valor;
    public Double ipva;

    public void calcIpva() {
        if ( valor <= 40000.0) {
            ipva = valor *2/100;
        } else if(valor<70000.0) {
            ipva = valor * 3/100;
        } else {
            ipva = valor * 5 / 100;
        }
    }
}
