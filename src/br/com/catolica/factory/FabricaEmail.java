package br.com.catolica.factory;

import br.com.catolica.interfaces.Notificacao;
import br.com.catolica.notifications.NotificacaoEmail;

public class FabricaEmail extends FabricaNotificacao {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
