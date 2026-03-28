package notificacao;

public abstract class NotificacaoFactory {
    public abstract Notificacao criarNotificacao();

    public void notificar(String destinatario, String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(destinatario, mensagem);
    }
}
