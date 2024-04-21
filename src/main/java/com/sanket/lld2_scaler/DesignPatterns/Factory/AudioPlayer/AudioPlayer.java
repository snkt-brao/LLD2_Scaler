package com.sanket.lld2_scaler.DesignPatterns.Factory.AudioPlayer;

public abstract class AudioPlayer {
    int volume;
    double playBackRate;
    public abstract MediaFormat supportsType();
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract void setVolume(int volume);
    public abstract int getVolume();
    public abstract double getPlayBackRate();

}
