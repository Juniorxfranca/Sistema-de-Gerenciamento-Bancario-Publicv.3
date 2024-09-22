package estruturas;

import java.util.Stack;

/**
 * Classe para gerenciar o histórico de transações usando uma pilha.
 */
public class PilhaTransacoes {
    private Stack<String> transacoes;

    /**
     * Construtor que inicializa a pilha de transações.
     */
    public PilhaTransacoes() {
        transacoes = new Stack<>();
    }

    /**
     * Adiciona uma transação na pilha.
     *
     * @param transacao A descrição da transação a ser adicionada.
     */
    public void adicionarTransacao(String transacao) {
        transacoes.push(transacao);
    }

    /**
     * Remove a transação mais recente da pilha.
     *
     * @return A descrição da transação removida.
     */
    public String removerTransacao() {
        return transacoes.isEmpty() ? null : transacoes.pop();
    }

    /**
     * Obtém o histórico de transações.
     *
     * @return Uma cópia do histórico de transações.
     */
    public Stack<String> getHistorico() {
        return (Stack<String>) transacoes.clone();
    }
}
