package br.com.catolica.fabrica;

import br.com.catolica.interfaces.Notificacao;

public abstract class FabricaNotificacao {
    public abstract Notificacao criarNotificacao();

    public void notificar(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(mensagem);
    }
}
