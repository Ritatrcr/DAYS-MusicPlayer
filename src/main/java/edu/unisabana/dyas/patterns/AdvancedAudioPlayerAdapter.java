package edu.unisabana.dyas.patterns;

// Adaptador que permite que AudioPlayer use AdvancedAudioPlayer
public class AdvancedAudioPlayerAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;
    
    public AdvancedAudioPlayerAdapter(AdvancedAudioPlayer advancedAudioPlayer) {
        this.advancedAudioPlayer = advancedAudioPlayer;
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Reproduciendo archivo MP3: " + fileName);
        } else
        if ("mp4".equalsIgnoreCase(audioType)) {
            advancedAudioPlayer.playMp4(fileName);
        } else if ("vlc".equalsIgnoreCase(audioType)) {
            advancedAudioPlayer.playVlc(fileName);
        } else {
            System.out.println("Formato no soportado: " + audioType);
        }
    }
    
    @Override
    public void stop() {
        System.out.println("Reproducción detenida");
    }
}
