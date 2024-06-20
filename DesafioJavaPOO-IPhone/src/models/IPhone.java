package models;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;
import interfaces.ReprodutorVideo;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical, ReprodutorVideo{
    public void ligar(String numero){
        System.out.println("Ligando para o numero " + numero + "...");
    }
    public void selecionarContato(String contato){
        System.out.println("Selecionando contato " + contato + ".");
        ligar(contato);
    }
    public void atender(){
        System.out.println("Atendendo ligacao...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina " + url + "...");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba.");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando pagina...");
    }

    public void tocar(){
        System.out.println("Tocando musica...");
    }
    public void pausar(){
        System.out.println("Pausando musica...");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica " + musica + ".");
        tocar();
    }

    public void iniciar(){
        System.out.println("Iniciando video...");
    }
    public void pausarVideo(){
        System.out.println("Pausando video...");
    }
    public void selecionarVideo(String video){
        System.out.println("Selecionando video " + video + ".");
        iniciar();
    }
}
