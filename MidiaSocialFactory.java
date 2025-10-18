public class MidiaSocialFactory {
    public static MidiaSocial criarMidia(String tipo) {
        switch (tipo.toLowerCase()) {
            case "twitter":
                return new TwitterAdapter(new TwitterAPI());
            case "instagram":
                return new InstagramAdapter(new InstagramAPI());
            case "linkedin":
                return new LinkedInAdapter(new LinkedInAPI());
            case "tiktok":
                return new TikTokAdapter(new TikTokAPI());
            default:
                throw new IllegalArgumentException("Tipo de mídia não suportado: " + tipo);
        }
    }
}
