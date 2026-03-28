package notificacao;

public class SmsNotificacao implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[SMS] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}
