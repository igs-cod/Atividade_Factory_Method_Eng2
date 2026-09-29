package br.com.catolica.factory;

import br.com.catolica.interfaces.Notificacao;
import br.com.catolica.notifications.NotificacaoSms;

public class FabricaSms extends FabricaNotificacao {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSms();
    }
}
