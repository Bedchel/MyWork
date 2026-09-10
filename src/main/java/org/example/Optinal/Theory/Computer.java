package org.example.Optinal.Theory;

import java.util.Optional;

public class Computer {
    private final SoundCard soundcard;

    public Computer(SoundCard soundcard) {
        this.soundcard = soundcard;
    }

    public Optional<SoundCard> getSoundcard() {
        return Optional.ofNullable(soundcard);
    }
}
