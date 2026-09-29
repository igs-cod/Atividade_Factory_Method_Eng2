package br.com.catolica.fabrica;

import br.com.catolica.interfaces.Notificacao;
import br.com.catolica.notificacoes.NotificacaoPush;

public class FabricaPush extends FabricaNotificacao {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoPush();
    }
}
