package edu.unisabana.dyas.patterns;

// Cliente que usa el adaptador
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AdvancedAudioPlayerAdapter(new AdvancedAudioPlayer());
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "pelicula.vlc");
        audioPlayer.play("mp3", "cancion.mp3"); 
        audioPlayer.stop();
    }
}