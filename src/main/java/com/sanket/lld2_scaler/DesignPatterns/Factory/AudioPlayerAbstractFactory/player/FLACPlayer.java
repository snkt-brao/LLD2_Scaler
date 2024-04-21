package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.player;

import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.MediaFormat;

public class FLACPlayer extends AudioPlayer {
    public FLACPlayer(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        // Simulate playing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Playing FLAC audio");
    }

    @Override
    public void pause() {
        // Simulate pausing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Pausing FLAC audio");
    }

    @Override
    public void stop() {
        // Simulate stopping audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Stopping FLAC audio");
    }

    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
}
