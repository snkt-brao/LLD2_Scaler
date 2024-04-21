package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.MediaFormat;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.decoder.AudioDecoder;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.player.AudioPlayer;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.processor.AudioProcessor;

public abstract class AudioFactory {
    public abstract MediaFormat supportsFormat();

    public abstract AudioDecoder getAudioDecoderInstance(byte[] data);

    public abstract AudioPlayer getAudioPlayerInstance(int volume, double playbackRate);

    public abstract AudioProcessor getAudioProcessorInstance(byte[] data);

}
