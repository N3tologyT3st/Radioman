package ru.netology.Radioman;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;
    private int minChannel = 0;
    private int maxChannel = 9;
    private int currentChannel;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        if (currentVolume == maxVolume) {
            return;
        }
    }

    public void volumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        if (currentVolume == minVolume) {
            return;
        }
    }

    public void channelUp() {
        if (currentChannel < maxChannel) {
            currentChannel++;
            return;
        }
        currentChannel = minChannel;

    }

    public void channelDown() {
        if (currentChannel > minChannel) {
            currentChannel--;
            return;
        }
        currentChannel = maxChannel;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume>maxVolume){
            return currentVolume;
        }
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume == minVolume) {
            return minVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }


    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }
}
