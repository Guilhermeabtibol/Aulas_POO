public class Moto extends Veiculo{
    private int cilindradas;

    public void calcIpva() {
        if (getMarca().getNome().equals("Honda")) {
            setIpva(getValor() * 2/100);
        } else if (getMarca().getNome().equals("Yamaha")) {
            setIpva(getValor() * 3/100);
        } else {
            setIpva(getValor() * 4/100);
        }
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
