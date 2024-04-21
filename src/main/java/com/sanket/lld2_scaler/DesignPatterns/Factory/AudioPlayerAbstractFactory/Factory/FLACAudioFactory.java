package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.Factory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.MediaFormat;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.decoder.AudioDecoder;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.decoder.FLACDecoder;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.player.AudioPlayer;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.player.FLACPlayer;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.processor.AudioProcessor;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory {
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioDecoder getAudioDecoderInstance(byte[] data) {
        return new FLACDecoder(data);
    }

    @Override
    public AudioPlayer getAudioPlayerInstance(int volume, double playbackRate) {
        return new FLACPlayer(volume, playbackRate);
    }

    @Override
    public AudioProcessor getAudioProcessorInstance(byte[] data) {
        return new FLACAudioProcessor(data);
    }
}
