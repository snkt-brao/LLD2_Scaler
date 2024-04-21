package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.MediaFormat;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.decoder.AudioDecoder;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.decoder.MP3Decoder;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.player.AudioPlayer;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.player.MP3Player;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.processor.AudioProcessor;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.processor.MP3AudioProcessor;

public class MP3AudioFactory extends AudioFactory {

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioDecoder getAudioDecoderInstance(byte[] data) {
        return new MP3Decoder(data);
    }

    @Override
    public AudioPlayer getAudioPlayerInstance(int volume, double playbackRate) {
        return new MP3Player(volume, playbackRate);
    }

    @Override
    public AudioProcessor getAudioProcessorInstance(byte[] data) {
        return new MP3AudioProcessor(data);
    }
}
