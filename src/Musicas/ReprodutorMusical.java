package Musicas;
import java.util.Scanner;
import java.lang.Thread;
public class ReprodutorMusical {

    Scanner scanner = new Scanner(System.in);
    int escolha;

    public void Tocar(){
        System.out.println("Tocando a música");
        System.out.println();
    }
    public void Pausar() throws InterruptedException{
        System.out.println("Pausando a música...");
        Thread.sleep(1000);
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("A música foi pausada!");
        System.out.println();

    }
    public void selecionarMusica(){
        System.out.println("Selecione a musica da nossa lista: ");
        System.out.println("1- Brazillian_Phonk\n 2- Abracadabra\n 3- Genki_Dama\n 4- Bomberman");
        System.out.print("Sua escolha: ");
        escolha = scanner.nextInt();
        if(escolha == 1){
            System.out.println("A música selecionada foi Brazillian_Phonk");
        }
        else if(escolha == 2){
            System.err.println("A música selecionada foi Abracadabra(Lil Chainz)");
        }
        else if(escolha == 3){
            System.out.println("A música selecionada foi Genki_Dama(7 Minutoz)");
        }
        else{
            System.out.println("A música escolhida foi Bomberman(Akashi Cruz)");
        }
        System.out.println();
    } 
}
