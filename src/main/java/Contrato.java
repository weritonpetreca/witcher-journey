/**
 * Representa um contrato de caça para o Bruxo.
 * É um 'record' para imutabilidade e simplicidade.
 *
 * @param nomeMonstro O nome do monstro a ser caçado.
 * @param recompensa A quantidade de ouro oferecida como recompensa.
 * @author Weriton L. Petreca
 * @version 1.0
 */
public record Contrato(String nomeMonstro, int recompensa) {
}
