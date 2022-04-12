import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private LocalDate date;

   public Mentoria(){}

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + super.getTitulo() + "'" +
            ", descricao='" + super.getDescricao() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }



}
