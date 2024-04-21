package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayer;

public class Client {
    public static void main(String[] args) {
        AudioPlayer player = AudioPlayerFactory.createAudioPlayer(MediaFormat.MP3, 10, 122.1);
        player.getVolume();

        player = AudioPlayerFactory.createAudioPlayer(MediaFormat.FLAC, 10, 23);

    }
}
