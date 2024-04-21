package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.processor;

import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.MediaFormat;

public abstract class AudioProcessor {
    private final byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] process();
}
