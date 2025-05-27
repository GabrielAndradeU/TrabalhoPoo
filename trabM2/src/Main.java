//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Vingadores",4,GeneroFilme.Aventura);
        Sessao sessao1 = new Sessao(true,2,2,3,"Nãosei","Floripa");

       System.out.println("Filme:"+filme1.toString());
       System.out.println("SESSÃO SEM FILME:"+sessao1.toString());

        sessao1.adicionarFilmeNaSessao(filme1);

        System.out.println(sessao1.assentosDisponiveis());

        sessao1.comprarIngresso(TipoDeIngresso.MeioIngresso,CategoriaIngresso.ingressoFisico);

        System.out.println(sessao1.assentosDisponiveis());


    }
}