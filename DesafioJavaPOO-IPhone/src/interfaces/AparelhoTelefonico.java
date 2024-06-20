package interfaces;

public abstract interface AparelhoTelefonico {
    public abstract void ligar(String numero);
    public abstract void selecionarContato(String contato);
    public abstract void atender();
    public abstract void iniciarCorreioVoz();
}
