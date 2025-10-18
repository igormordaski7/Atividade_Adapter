public class Main {
    public static void main(String[] args) {
        GerenciadorMidiaSocial<MidiaSocial> gerenciador = new GerenciadorMidiaSocial<>();

        MidiaSocial twitter = MidiaSocialFactory.criarMidia("twitter");
        MidiaSocial instagram = MidiaSocialFactory.criarMidia("instagram");
        MidiaSocial linkedin = MidiaSocialFactory.criarMidia("linkedin");
        MidiaSocial tiktok = MidiaSocialFactory.criarMidia("tiktok");

        gerenciador.adicionarPlataforma(twitter);
        gerenciador.adicionarPlataforma(instagram);
        gerenciador.adicionarPlataforma(linkedin);
        gerenciador.adicionarPlataforma(tiktok);

        Conteudo conteudo = new Conteudo("Lançando novo produto!", "imagem.png");
        EstrategiaPublicacao estrategia = new EstrategiaTexto();

        gerenciador.publicarTodos(conteudo, estrategia);
    }
}
