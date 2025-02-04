package edu.unisabana.dyas.patterns;

//Implementa la funcionalidad avanzada para reproducir archivos MP4 y VLC.
public interface AudioPlayer {
    void play(String audioType, String fileName);
    void stop();
}
