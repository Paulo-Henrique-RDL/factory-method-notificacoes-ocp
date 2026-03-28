
public class Main {
    public static void main(String[] args) {
        NotificacaoFactory emailFactory = new EmailFactory();
        emailFactory.notificar("cliente@email.com", "Sua compra foi confirmada!");

        NotificacaoFactory smsFactory = new SmsFactory();
        smsFactory.notificar("+5511999998888", "Seu pedido saiu para entrega.");

        NotificacaoFactory pushFactory = new PushFactory();
        pushFactory.notificar("dispositivo-abc123", "Você tem uma nova mensagem!");

        NotificacaoFactory whatsAppFactory = new WhatsAppFactory();
        whatsAppFactory.notificar("+5511977776666", "Seu código de verificação é: 4829");
    }
}
