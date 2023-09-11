import Musicas.ReprodutorMusical;
import Telefone.AparelhoTelefonico;
import Navegador.NavegadorOnline;

public class Iphone {
    public static void main(String[] args) throws InterruptedException {
        ReprodutorMusical musical = new ReprodutorMusical();
        AparelhoTelefonico telefonico = new AparelhoTelefonico();
        NavegadorOnline navegador = new NavegadorOnline();

        //Musicas
        musical.selecionarMusica();
        musical.Tocar();
        musical.Pausar();

        //Telefones
         telefonico.Ligar();
        telefonico.Atender();
        telefonico.CorreioDeVoz();

        //Navegador
        navegador.exibitPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
