package emotionalsongs;

import java.util.Objects;

public class Registrazione {
    String nomeUtente;
    String password;


    public Registrazione(String nomeUtente, String password) {
        this.nomeUtente = nomeUtente;
        this.password = password;
    }


    @Override
    public String toString() {
        return "Registrazione{" +
                "nomeUtente='" + nomeUtente + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registrazione that = (Registrazione) o;
        return Objects.equals(nomeUtente, that.nomeUtente) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUtente, password);
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
