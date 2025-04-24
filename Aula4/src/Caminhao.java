public class Caminhao extends Veiculo{

    public Double capCarga; // capacidade

    public void calcIpva() {
        if(capCarga <= 20000.0) {
            ipva = valor * 2/100;
        } else if (capCarga <= 30000.0) {
            ipva = valor * 2/100;
        } else {
            ipva = valor * 3/100;
        }
    }
}
