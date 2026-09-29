import br.com.catolica.fabrica.FabricaEmail;
import br.com.catolica.fabrica.FabricaNotificacao;
import br.com.catolica.fabrica.FabricaPush;
import br.com.catolica.fabrica.FabricaSms;

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
