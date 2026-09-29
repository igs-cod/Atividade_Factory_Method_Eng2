package br.com.catolica.factory;

import br.com.catolica.interfaces.Notificacao;
import br.com.catolica.notifications.NotificacaoPush;

public class FabricaPush extends FabricaNotificacao {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
