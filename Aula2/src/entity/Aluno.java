package entity;

public class Aluno {
    public String nome;
    public double n1;
    public double n2;
    public double n3;
    public double media;
    public String status;

    public void calcMedia() {
        media = (n1 + n2 + n3) / 3;

        if (media >= 6) {
            status = "Aprovado";
        } else if (media < 4) {
            status = "Reprovado";
        } else {
            status = "Em exame";
        }
    }
}
