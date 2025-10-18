public class TwitterAdapter implements MidiaSocial {
    private TwitterAPI twitter;

    public TwitterAdapter(TwitterAPI twitter) {
        this.twitter = twitter;
    }

    @Override
    public synchronized void publicar(Conteudo conteudo) {
        try {
            twitter.tweet(conteudo.getTexto());
        } catch (Exception e) {
            System.out.println("[ERRO] Falha ao publicar no Twitter: " + e.getMessage());
        }
    }
}
