package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(13);

    @Test
    public void shouldChangeVolume() {

        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(56);
        Assertions.assertEquals(56, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeUnderMinVolume() {

        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.volumeDown();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeUpMaxVolume() {

        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());
        radio.volumeUp();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannel() {

        Assertions.assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(4);
        Assertions.assertEquals(4, radio.getCurrentChannel());
    }


    @Test
    public void shouldChangeUpMaxChannel() {

        Assertions.assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(13);
        Assertions.assertEquals(13, radio.getCurrentChannel());
        radio.channelUp();
        Assertions.assertEquals(0, radio.getCurrentChannel());
    }


    @Test
    public void shouldChangeVolumeUp() {

        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.volumeUp();
        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeVolumeDown() {

        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        Assertions.assertEquals(5, radio.getCurrentVolume());
        radio.volumeDown();
        Assertions.assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldChangeChannelUp() {

        Assertions.assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(12);
        Assertions.assertEquals(12, radio.getCurrentChannel());
        radio.channelUp();
        Assertions.assertEquals(13, radio.getCurrentChannel());

    }

    @Test
    public void shouldChangeChannelDown() {

        Assertions.assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(1);
        Assertions.assertEquals(1, radio.getCurrentChannel());
        radio.channelDown();
        Assertions.assertEquals(0, radio.getCurrentChannel());
        radio.channelDown();
        Assertions.assertEquals(13, radio.getCurrentChannel());
    }

    @Test
    public void shouldUpMaxChannel() {

        Assertions.assertEquals(0, radio.getCurrentChannel());
        radio.setCurrentChannel(14);
        Assertions.assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldUpMaxVolume(){
        Assertions.assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
}
