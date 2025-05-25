//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Vingadores",4,GeneroFilme.Aventura);
        Sessao sessao1 = new Sessao(true,2,2,3,"Nãosei","Floripa",filme1);

        System.out.println(filme1.toString());

        sessao1.adicionarSala(10,"Boa","Palhoca");

        System.out.println(sessao1.toString());

        filme1.adicionarSessao(sessao1);

        System.out.println(filme1.toString());

        Filme filme2 = new Filme("Liga da Justica",2,GeneroFilme.Ação);

        filme2.adicionarSessao(sessao1);

        System.out.println(filme2.toString());

    }
}