package model;
import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
    public int escolhaDoUsuario;
    public int escolhaDoComputador;
    public String escolhaDoUsuarioEmTexto;
    public String escolhaDoComputadorEmTexto;
    public String resultadoDaPartida;
    public int respostaDoUsuarioSobreJogarDeNovo;
    Scanner leitor = new Scanner(System.in);

    public void getPedraPapelTesoura(){
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
        randomizarEscolhaDoComputador();
    }

    public void randomizarEscolhaDoComputador(){
        Random numeroAleatorio = new Random();
        escolhaDoComputador = numeroAleatorio.nextInt(3)+1;
        //o intervalo de escolha é [0,n[, portanto a escolha do computador precisa ser de 0 a 3 (0,1,2) + 1
        formularLogicaDoJogo();
    }

    public void formularLogicaDoJogo() {
        if (escolhaDoUsuario==1 && escolhaDoComputador== 2)
        {
            resultadoDaPartida = "Você perdeu :(";
        } else if (escolhaDoUsuario==1 && escolhaDoComputador== 3)
        {
            resultadoDaPartida = "*** V O C Ê  V E N C E U ! ! ! ***";
        }else if(escolhaDoUsuario==2 && escolhaDoComputador==1)
        {
            resultadoDaPartida = "V*** V O C Ê  V E N C E U ! ! ! ***";
        } else if (escolhaDoUsuario==2 && escolhaDoComputador==3)
        {
            resultadoDaPartida = "Você perdeu :(";
        } else if (escolhaDoUsuario==3 && escolhaDoComputador==1)
        {
            resultadoDaPartida = "Você perdeu :(";
        } else if (escolhaDoUsuario==3 && escolhaDoComputador==2)
        {
            resultadoDaPartida = "*** V O C Ê  V E N C E U ! ! ! ***";
        }
        else{
            resultadoDaPartida = "Empate!";
        }
exibirResultado();
    }
    public void exibirResultado(){

        if (escolhaDoUsuario==1) {
            escolhaDoUsuarioEmTexto = "Pedra";
        } else if (escolhaDoUsuario==2) {
            escolhaDoUsuarioEmTexto = "Papel";
        } else if (escolhaDoUsuario==3) {
            escolhaDoUsuarioEmTexto = "Tesoura";
        }

        if (escolhaDoComputador==1) {
            escolhaDoComputadorEmTexto = "Pedra";
        } else if (escolhaDoComputador==2) {
            escolhaDoComputadorEmTexto = "Papel";
        } else if (escolhaDoComputador==3){
            escolhaDoComputadorEmTexto = "Tesoura";}

        System.out.println("Você escolheu: " + escolhaDoUsuarioEmTexto);
        System.out.println("O computador escolheu: " + escolhaDoComputadorEmTexto);
        System.out.println(resultadoDaPartida);
        jogarDeNovo();
    }
    public void jogarDeNovo(){
        System.out.print("Jogar de novo? (Sim = 1, não = 0) ");
        respostaDoUsuarioSobreJogarDeNovo = leitor.nextInt();
        if (respostaDoUsuarioSobreJogarDeNovo == 1) getPedraPapelTesoura();
        else System.exit(0);
    }
}
