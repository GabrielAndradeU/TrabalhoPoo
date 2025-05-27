import java.util.List;

public class Ingresso {
    private TipoDeIngresso tipo;
    private CategoriaIngresso categoriaIngresso;
    private Sessao iSessao;

    public Ingresso(TipoDeIngresso tipo, Sessao iSessao, CategoriaIngresso categoriaIngresso) {
        this.tipo = tipo;
        this.iSessao = iSessao;
        this.categoriaIngresso = categoriaIngresso;
    }




    public TipoDeIngresso getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeIngresso tipo) {
        this.tipo = tipo;
    }

    public CategoriaIngresso getCategoriaIngresso() {
        return categoriaIngresso;
    }

    public void setCategoriaIngresso(CategoriaIngresso categoriaIngresso) {
        this.categoriaIngresso = categoriaIngresso;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "tipo=" + tipo +
                ", categoriaIngresso=" + categoriaIngresso +
                ", iSessao=" + iSessao +
                '}';
    }
}
