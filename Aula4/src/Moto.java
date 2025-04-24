public class Moto extends Veiculo{
<<<<<<< HEAD
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
=======

    public int cilindradas;

    public void calcIpva() { // polimorfismo de sobreposicao
        if(cilindradas <= 160) {
            ipva = valor * 2/100;
        } else if (cilindradas <= 300) {
            ipva = valor * 3/100;
        } else {
            ipva = valor * 5/100;
        }
    }
>>>>>>> 288ad1d9a367dfc32f27d8529441b9bfa5e2494d
}
