package notificacao;

public class WhatsAppNotificacao implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[WhatsApp] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}
