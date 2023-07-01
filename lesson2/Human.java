package org.example.HomeWork.lesson2;

import com.sun.source.tree.WhileLoopTree;

public class Human implements Doing{
    static int distans;
    static int whight;
    static int flag;
    static String name;

    public Human(String name) {
        this.name = name;
        distans = 300;
        whight = 3;
        flag = 0;
    }

    @Override
    public void run(Treadmill treadmill) {
        if (distans >= treadmill.distans) {
            System.out.println("Успешно пробежал");
        } else {
            flag++;
            System.out.println("Не смог пробежать");
        }
    }

    @Override
    public void jump(Wall wall) {
        if (whight >= wall.whight) {
            System.out.println("Успешно перепрыгнул");
        } else {
            flag++;
            System.out.println("Не смог перепрыгнуть");
        }

    }
    @Override
    public int getFlag(){
        return flag;
    }
    @Override
    public String getName(){
        return name;
    }
}
