package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MuscPlayer muscPlayer;
@Autowired
    public Computer(MuscPlayer muscPlayer) {
        this.id = 1;
        this.muscPlayer = muscPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", muscPlayer=" + muscPlayer.playMusic() +
                '}';
    }
}
