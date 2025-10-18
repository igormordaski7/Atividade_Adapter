public class InstagramAdapter implements MidiaSocial {
    private InstagramAPI instagram;

    public InstagramAdapter(InstagramAPI instagram) {
        this.instagram = instagram;
    }

    @Override
    public synchronized void publicar(Conteudo conteudo) {
        try {
            instagram.postarImagem(conteudo.getTexto(), conteudo.getImagem());
        } catch (Exception e) {
            System.out.println("[ERRO] Falha ao publicar no Instagram: " + e.getMessage());
        }
    }
}
