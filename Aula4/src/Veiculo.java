public class Veiculo {
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
        }
    }
}
