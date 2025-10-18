import java.util.*;

public class GerenciadorMidiaSocial<T extends MidiaSocial> {
    private List<T> plataformas = Collections.synchronizedList(new ArrayList<>());

    public void adicionarPlataforma(T midia) {
        plataformas.add(midia);
    }

    public void publicarTodos(Conteudo conteudo, EstrategiaPublicacao estrategia) {
        plataformas.parallelStream().forEach(midia -> estrategia.executar(midia, conteudo));
    }
}
