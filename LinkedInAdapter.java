public class LinkedInAdapter implements MidiaSocial {
    private LinkedInAPI linkedin;

    public LinkedInAdapter(LinkedInAPI linkedin) {
        this.linkedin = linkedin;
    }

    @Override
    public synchronized void publicar(Conteudo conteudo) {
        try {
            linkedin.compartilharPost(conteudo.getTexto());
        } catch (Exception e) {
            System.out.println("[ERRO] Falha ao publicar no LinkedIn: " + e.getMessage());
        }
    }
}
