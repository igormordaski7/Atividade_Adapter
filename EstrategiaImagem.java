public class EstrategiaImagem implements EstrategiaPublicacao {
    @Override
    public void executar(MidiaSocial midia, Conteudo conteudo) {
        midia.publicar(conteudo);
    }
}
