package notificacao;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[E-mail] Para: " + destinatario + " | Mensagem: " + mensagem);
    }
}
