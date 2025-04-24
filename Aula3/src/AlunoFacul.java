public class AlunoFacul extends AlunoTec {
    public double n3;

    public void calcMedia() {
        media = (n1 + n2 + n3) / 3;

        if (media >= 6) {
            status = "Aprovado";
        } else if (media >= 4 && media <= 5.9) {
            status = "Em exame";
        } else {
            status = "Reprovado";
        }
    }
}
