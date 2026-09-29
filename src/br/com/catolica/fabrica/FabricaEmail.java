package br.com.catolica.fabrica;

import br.com.catolica.interfaces.Notificacao;
import br.com.catolica.notificacoes.NotificacaoEmail;

public class FabricaEmail extends FabricaNotificacao {
    @Override
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
