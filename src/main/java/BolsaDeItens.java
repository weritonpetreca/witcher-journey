import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

/**
 * Representa o inventário completo do Bruxo.
 * Esta classe encapsula e gerencia todas as coleções de dados,
 * seguindo as boas práticas de separação de responsabilidades.
 * @author Weriton L. Petreca
 * @version 1.0
 */
public class BolsaDeItens {

    // 📜 QUADRO DE AVISOS (Queue): Para gerenciar contratos em ordem de chegada.
    private Queue<Contrato> quadroDeAvisos = new LinkedList<>();

    // 📜 BOLSA DE POÇÕES (List): Para guardar ingredientes de uma poção, onde a ordem importa.
    private List<String> ingredientesPocao = new ArrayList<>();

    // 🗺️ BESTIÁRIO (Map): Para associar um monstro (chave) às suas fraquezas (valor).
    private Map<String, String> bestiario = new HashMap<>();

    // 💎 SACO DE TROFÉUS (Set): Para guardar os troféus de monstros únicos.
    private Set<String> trofeusDeGuerra = new HashSet<>();

    /**
     * Adiciona um novo contrato ao final da fila no quadro de avisos.
     * @param contrato O contrato a ser adicionado.
     */
    public void adicionarContrato(Contrato contrato) {
        quadroDeAvisos.offer(contrato);
        System.out.println("  [Quadro de Avisos] Novo contrato para caçar '" + contrato.nomeMonstro() + "' foi afixado.");
    }

    /**
     * Pega o contrato mais antigo do quadro de avisos.
     * @return O próximo contrato a ser executado, ou null se não houver nenhum.
     */
    public Contrato pegarProximoContrato() {
        return quadroDeAvisos.poll();
    }

    /**
     * Adiciona conhecimento ao bestiário.
     * @param monstro O nome do monstro (chave).
     * @param fraquezas A descrição de suas fraquezas (valor).
     */
    public void adicionarAoBestiario(String monstro, String fraquezas) {
        bestiario.put(monstro, fraquezas);
    }

    /**
     * Consulta as fraquezas de um monstro no bestiário.
     * @param monstro O nome do monstro a ser consultado.
     * @return As fraquezas do monstro.
     */
    public String consultarBestiario(String monstro) {
        return bestiario.get(monstro);
    }

    /**
     * Adiciona um troféu de monstro ao saco.
     * O Set garantirá que não haja duplicatas.
     * @param nomeMonstro O nome do monstro derrotado.
     */
    public void adicionarTrofeu(String nomeMonstro) {
        boolean adicionado = trofeusDeGuerra.add(nomeMonstro);
        if (adicionado) {
            System.out.println("  [Saco de Troféus] Cabeça de '" + nomeMonstro + "' adicionada. Um troféu único!");
        } else {
            System.out.println("  [Saco de Troféus] Já possuímos um troféu de '" + nomeMonstro + "'. O Set ignorou a duplicata.");
        }
    }

    /**
     * Prepara uma poção adicionando ingredientes em ordem.
     * @param ingrediente O ingrediente a ser adicionado à receita.
     */
    public void adicionarIngrediente(String ingrediente) {
        ingredientesPocao.add(ingrediente);
    }

    // Métodos para exibir o estado atual das coleções
    public void exibirQuadroDeAvisos() {
        System.out.println("  [Estado Atual] Fila de Contratos: " + quadroDeAvisos);
    }

    public void exibirSacoDeTrofeus() {
        System.out.println("  [Estado Atual] Troféus Únicos: " + trofeusDeGuerra);
    }

    public void exibirReceitaDaPocao() {
        System.out.println("  [Estado Atual] Receita da Poção (Ordem Importa): " + ingredientesPocao);
    }
}