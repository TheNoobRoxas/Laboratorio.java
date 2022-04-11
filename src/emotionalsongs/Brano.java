package emotionalsongs;

import java.util.Objects;

public class Brano {
    public String titolo;
    public String autore;
    public int anno;

    public Brano(String titolo, String autore, int anno) {
        this.titolo=titolo;
        this.autore=autore;
        this.anno=anno;
    }

    public boolean equals(Brano brano) {
        return Objects.equals(this.titolo, brano.titolo) && Objects.equals(this.autore, brano.autore) && this.anno == brano.anno;
    }

    public boolean equals(String titolo) {
        return (Objects.equals(this.titolo, titolo));

    }

    public boolean equals(String autore,int anno) {
        return (Objects.equals(this.autore, autore) && this.anno == anno);
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getAnno() {
        return anno;
    }

}
