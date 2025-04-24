public class Veiculo {
<<<<<<< HEAD
    private String modelo;
    private int ano;
    private Double valor;
    private Double ipva;
    private Marca marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getIpva() {
        return ipva;
    }

    public void setIpva(Double ipva) {
        this.ipva = ipva;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void calcIpva() {
        if (valor <= 40000.0) {
            ipva = valor * 2/100;
        } else {
            ipva = valor * 3/100;
=======
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
>>>>>>> 288ad1d9a367dfc32f27d8529441b9bfa5e2494d
        }
    }
}
