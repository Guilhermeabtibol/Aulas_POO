public class AlunoTec {
    public String nome;
    public double n1;
    public double n2;
    public double media;
    public String status;



    public void calcMedia() {
        media = (n1 + n2) / 2;

        if (media >= 5) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
    }
}
