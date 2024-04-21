package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory;

import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.Factory.AudioFactory;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.Factory.ConcreteAudioFactory;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.decoder.AudioDecoder;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.player.AudioPlayer;
import com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayerAbstractFactory.processor.AudioProcessor;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        AudioFactory audioFactory = ConcreteAudioFactory.getAudioFactory(MediaFormat.FLAC);

        AudioDecoder audioDecoder = audioFactory.getAudioDecoderInstance(new byte[10]);
        audioDecoder.decode();

        AudioPlayer audioPlayer = audioFactory.getAudioPlayerInstance(10, 20);
        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();


        AudioProcessor audioProcessor = audioFactory.getAudioProcessorInstance(new byte[10]);
        audioProcessor.process();

    }
}
