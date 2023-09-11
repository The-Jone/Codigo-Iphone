package Navegador;
import java.lang.Thread;
public class NavegadorOnline {
    

    public void exibitPagina(){
        System.out.println("Exibindo a página desejada.");
        System.out.println();
    }

    public void adicionarNovaAba() throws InterruptedException{
        System.out.println("Abrindo uma Nova Aba em seu navegador.");
        Thread.sleep(1000);
        System.out.println("Nova aba foi aberta com sucesso!");
        System.out.println();
    }

    public void atualizarPagina() throws InterruptedException{
        System.out.println("A página está sendo atualizada...");
        Thread.sleep(1000);
        System.out.println("A página foi atualizada com sucesso!");
        System.out.println();
    }
}
