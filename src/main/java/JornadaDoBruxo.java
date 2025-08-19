/**
 * Classe principal que simula a jornada de um Bruxo,
 * demonstrando o uso prático do Java Collections Framework.
 * @author Weriton L. Petreca
 * @version 1.0
 */
public class JornadaDoBruxo {

    public static void main(String[] args) {
        System.out.println("=== A Jornada de um Bruxo Programador: Dominando as Coleções ===");

        // O Bruxo começa sua jornada criando seu inventário.
        BolsaDeItens inventario = new BolsaDeItens();

        // =================================================================================
        System.out.println("\n--- ETAPA 1: O Quadro de Avisos (Interface Queue) ---");
        System.out.println("O Bruxo chega a uma vila e verifica o quadro de avisos. Os contratos são processados em ordem de chegada (FIFO).");

        inventario.adicionarContrato(new Contrato("Grifo", 350));
        inventario.adicionarContrato(new Contrato("Afogador", 50));
        inventario.adicionarContrato(new Contrato("Aparição", 200));

        inventario.exibirQuadroDeAvisos();

        Contrato contratoAtual = inventario.pegarProximoContrato();
        System.out.println("\nO Bruxo pega o contrato mais antigo. Próxima caçada: " + contratoAtual.nomeMonstro());
        inventario.exibirQuadroDeAvisos();

        // =================================================================================
        System.out.println("\n--- ETAPA 2: Consultando o Bestiário (Interface Map) ---");
        System.out.println("Para se preparar, o Bruxo consulta seu bestiário. O Map permite acesso rápido às fraquezas usando o nome do monstro como chave.");

        inventario.adicionarAoBestiario("Grifo", "Sinal de Aard, Óleo contra Híbridos");
        inventario.adicionarAoBestiario("Afogador", "Sinal de Igni, Óleo contra Necrófagos");

        String fraquezas = inventario.consultarBestiario(contratoAtual.nomeMonstro());
        System.out.println("  [Bestiário] Fraquezas do '" + contratoAtual.nomeMonstro() + "': " + fraquezas);

        // =================================================================================
        System.out.println("\n--- ETAPA 3: Preparando uma Poção (Interface List) ---");
        System.out.println("A alquimia exige precisão. A List garante que os ingredientes sejam adicionados e mantidos na ordem correta para a poção 'Andorinha'.");

        inventario.adicionarIngrediente("Celandine");
        inventario.adicionarIngrediente("Drowner Brain"); // Cérebro de Afogador
        inventario.adicionarIngrediente("Dwarf Spirit");  // Álcool Anão
        inventario.exibirReceitaDaPocao();

        // =================================================================================
        System.out.println("\n--- ETAPA 4: A Caçada e o Troféu (Interface Set) ---");
        System.out.println("Após uma batalha vitoriosa, o Bruxo coleta seu troféu. O Set garante que ele nunca carregue troféus duplicados.");

        System.out.println("\nPrimeira caçada ao Grifo...");
        inventario.adicionarTrofeu("Grifo");
        inventario.exibirSacoDeTrofeus();

        System.out.println("\nO Bruxo encontra outro Grifo e o derrota...");
        inventario.adicionarTrofeu("Grifo"); // Tentando adicionar o mesmo troféu
        inventario.exibirSacoDeTrofeus();

        System.out.println("\nMais tarde, derrota um Afogador...");
        inventario.adicionarTrofeu("Afogador");
        inventario.exibirSacoDeTrofeus();

        // =================================================================================
        System.out.println("\n=== FIM DA JORNADA ===");
        System.out.println("O Bruxo completou seu contrato, usando cada coleção para a ferramenta certa, e demonstrou sua maestria.");
    }
}