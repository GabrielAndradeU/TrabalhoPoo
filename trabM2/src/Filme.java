import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int duracao;
    private GeneroFilme generoFilme;
    private List<Sessao> fSessao;

    public Filme(String titulo, int duracao, GeneroFilme generoFilme) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.generoFilme = generoFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public GeneroFilme getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(GeneroFilme generoFilme) {
        this.generoFilme = generoFilme;
    }

    public List<Sessao> getfSessao() {
        return fSessao;
    }

    public void adicionarSessao(Sessao sessao) {
        if (this.fSessao == null) {
            this.fSessao = new ArrayList<>();
        }
        this.fSessao.add(sessao);
    }

    @Override
    public String toString() {
        return "Filme{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", generoFilme=" + generoFilme +
                ", fSessao=" + fSessao +
                '}';
    }
}
