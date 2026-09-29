import br.com.catolica.factory.FabricaEmail;
import br.com.catolica.factory.FabricaNotificacao;
import br.com.catolica.factory.FabricaPush;
import br.com.catolica.factory.FabricaSms;

public class Main {
    public static void main(String[] args) {
        FabricaNotificacao email = new FabricaEmail();

        FabricaNotificacao sms = new FabricaSms();
        FabricaNotificacao push = new FabricaPush();


        email.notificar("Bem vindo!");
        sms.notificar("Seu codigo é 1234");
        push.notificar(" ja pode pegar a mercadoria");
    }
}
