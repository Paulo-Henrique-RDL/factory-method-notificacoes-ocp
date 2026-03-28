package notificacao;

public class PushFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new PushNotificacao();
    }
}
