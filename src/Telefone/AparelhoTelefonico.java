package Telefone;

import java.lang.Thread;
import java.util.Scanner;

public class AparelhoTelefonico {
    String telefone = "9925665-4224";
    Scanner scanner = new Scanner(System.in);
    String msg;
    int escolhaL;



    public void Ligar() throws InterruptedException{
        System.out.println("Ligando para o número " + telefone);
        Thread.sleep(1000);
        System.out.println("Chamando...");
        Thread.sleep(1000);
        System.out.println("Chamando...");
        Thread.sleep(1000);
        System.out.println("Chamando...");
        Thread.sleep(1000);
    }

    public void Atender(){
        System.out.println("Você atendeu a chamada.");
    }

    public void CorreioDeVoz() throws InterruptedException{
        System.out.println("O número está fora de área no momento, você gostaria de enviar um Correio de Voz?");
        System.out.println(" [1] Mandar mensagem \n [2] Desligar \n [3] Tentar ligar novamente.");
        System.out.println("Digite a opção desejada: ");
        escolhaL = scanner.nextInt();
        if(escolhaL == 1){
            System.out.println("Digite a mensagem desejada: ");
            msg = scanner.nextLine();
            Thread.sleep(1000);
            System.out.println("Enviando sua mesagem...");
            Thread.sleep(1000);
            System.err.println("Sua mensagem foi enviada com sucesso!");
        }
        else if(escolhaL == 2){
            System.out.println("Desligando a ligação...");
            Thread.sleep(1000);
            System.err.println("Ligação desligada");
        }
        else{
            System.out.println("Tentando ligar novamente...");
            Thread.sleep(1000);
            System.out.println("A chamada foi interrompida");
        }
         
    }

}
