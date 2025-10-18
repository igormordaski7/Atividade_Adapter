public class TikTokAdapter implements MidiaSocial {
    private TikTokAPI tiktok;

    public TikTokAdapter(TikTokAPI tiktok) {
        this.tiktok = tiktok;
    }

    @Override
    public synchronized void publicar(Conteudo conteudo) {
        try {
            tiktok.postarVideo(conteudo.getTexto());
        } catch (Exception e) {
            System.out.println("[ERRO] Falha ao publicar no TikTok: " + e.getMessage());
        }
    }
}
