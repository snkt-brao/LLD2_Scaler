package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.MediaFormat;

import java.io.IOException;

public class ConcreteAudioFactory {
    public static AudioFactory getAudioFactory(MediaFormat mediaFormat) throws IOException {
        switch (mediaFormat) {
            case FLAC -> {
                return new FLACAudioFactory();
            }
            case MP3 -> {
                return new MP3AudioFactory();
            }
            default -> {
                throw new IOException("Invalid Media Format");
            }
        }
    }
}
