package org.example.Optinal.Theory;

import org.example.Optinal.Theory.USB;

import java.util.Optional;

public class SoundCard {
    private final USB usb;

    public SoundCard(USB usb) {
        this.usb = usb;
    }

    public Optional<USB> getUSB() {
        return Optional.ofNullable(usb);
    }
}
