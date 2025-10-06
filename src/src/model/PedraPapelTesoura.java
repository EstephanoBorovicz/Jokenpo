package model;
import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
    public int escolhaDoUsuario;
    public int escolhaDoComputador;
    public String resultadoDaPartida;
    Scanner leitor = new Scanner(System.in);

    public void GetPedraPapelTesoura(){
        System.out.println("-----------------------------------");
        System.out.println("Vamos jogar Jokenpô!");
        System.out.println("-----------------------------------");
        System.out.println("Escolha uma opção");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("-----------------------------------");
        System.out.print("Digite a sua escolha: ");
        escolhaDoUsuario = leitor.nextInt();
        RandomizarEscolhaDoComputador();
    }

    public void RandomizarEscolhaDoComputador(){
        Random numeroAleatorio = new Random();
        escolhaDoComputador = numeroAleatorio.nextInt(3)+1;
        //o intervalo de escolha é [0,n[, portanto a escolha do computador precisa ser de 0 a 3 (0,1,2) + 1 = (1,2,3)
        FormularLogicaDoJogo();
    }

    public void FormularLogicaDoJogo() {
        if (escolhaDoUsuario==1 && escolhaDoComputador== 2){
            resultadoDaPartida = "Você perdeu :(";
        }else if(escolhaDoUsuario==1 && escolhaDoComputador== 3){
            resultadoDaPartida = "*** V O C Ê  V E N C E U ! ! ! ***";
        }else if(escolhaDoUsuario==2 && escolhaDoComputador==1){
            resultadoDaPartida = "*** V O C Ê  V E N C E U ! ! ! ***";
        }else if(escolhaDoUsuario==2 && escolhaDoComputador==3){
            resultadoDaPartida = "Você perdeu :(";
        }else if(escolhaDoUsuario==3 && escolhaDoComputador==1){
            resultadoDaPartida = "Você perdeu :(";
        }else if(escolhaDoUsuario==3 && escolhaDoComputador==2){
            resultadoDaPartida = "*** V O C Ê  V E N C E U ! ! ! ***";
        }else{
            resultadoDaPartida = "Empate!";
        }
    ExibirResultado();
    }
    public void ExibirResultado(){

        if (escolhaDoUsuario==1) {
            System.out.println("Você escolheu: pedra");
        } else if (escolhaDoUsuario==2) {
            System.out.println("Você escolheu: papel");
        } else if (escolhaDoUsuario==3) {
            System.out.println("Você escolheu: tesoura");
        }

        if (escolhaDoComputador==1) {
            System.out.println("O computador escolheu: pedra");
        }else if(escolhaDoComputador==2) {
            System.out.println("O computador escolheu: papel");
        }else if(escolhaDoComputador==3) {
            System.out.println("O computador escolheu: tesoura");
        }
        System.out.println(resultadoDaPartida);
        JogarDeNovo();
    }
    public void JogarDeNovo(){
        System.out.println("Jogar de novo? (Sim = 1, não = 0) ");
        if (leitor.nextInt() == 1) {
            GetPedraPapelTesoura();
        } else {
            System.exit(0);
        }
    }
}
