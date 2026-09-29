package br.com.catolica.fabrica;

import br.com.catolica.interfaces.Notificacao;
import br.com.catolica.notificacoes.NotificacaoSms;

public class FabricaSms extends FabricaNotificacao {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoSms();
    }
}
