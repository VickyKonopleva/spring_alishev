package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
//        Music music1= context.getBean("rockMusic", Music.class);
//        Music music2= context.getBean("classicalMusic", Music.class);
//        System.out.println(music.getSong());
//        MuscPlayer muscPlayer1 = new MuscPlayer(music1);
//        MuscPlayer muscPlayer2 = new MuscPlayer(music2);
//        muscPlayer1.playMusic();
//        muscPlayer2.playMusic();
//        MuscPlayer muscPlayer = context.getBean("muscPlayer", MuscPlayer.class);
//        muscPlayer.playMusic();
//        System.out.println(muscPlayer.getName());
//        System.out.println(muscPlayer.getVolume());
//        MuscPlayer muscPlayer = context.getBean("muscPlayer", MuscPlayer.class);
//        muscPlayer.playMusic();
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        context.close();
    }
}
