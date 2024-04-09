import java.io.Serializable;

public class Ebook extends Livro implements Promocional {

    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        return aplicaDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }


}
