import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private boolean estadoDaSessao;
    private int horario;
    private List<Sala> nSalas;
    private Filme xFilme; // conectar
    private Ingresso xIngresso; // conectar

    public Sessao(boolean estadoDaSessao, int horario, int qtdSalas, int nAssento, String TipoDeTela, String local, Filme qfilme) {
        this.estadoDaSessao = estadoDaSessao;
        this.horario = horario;
        nSalas = new ArrayList<>();
        nSalas.add(new Sala(nAssento,TipoDeTela,local));
        qfilme.adicionarSessao(this);
    }

    public void adicionarSala(int nAssento, String TipoDeTela, String local){
        nSalas.add(new Sala(nAssento,TipoDeTela, local));
    }


    public boolean isEstadoDaSessao() {
        return estadoDaSessao;
    }

    public void setEstadoDaSessao(boolean estadoDaSessao) {
        this.estadoDaSessao = estadoDaSessao;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public List<Sala> getnSalas() {
        return nSalas;
    }

    public void setnSalas(List<Sala> nSalas) {
        this.nSalas = nSalas;
    }


    @Override
    public String toString() {
        return "Sessao{" +
                "estadoDaSessao=" + estadoDaSessao +
                ", horario=" + horario +
                ", nSalas=" + nSalas +
                '}';
    }
}
