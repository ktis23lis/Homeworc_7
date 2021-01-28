package com.company;

public class Robot implements RunJump{
    String  className;
    int maxRunningDistance;
    int maxJumpingHeight;

    public Robot(String className, int maxRunningDistance, int maxJumpingHeight) {
        this.className = className;
        this.maxRunningDistance = maxRunningDistance;
        this.maxJumpingHeight = maxJumpingHeight;
    }

    @Override
    public int takeMaxRunning() {
        return maxRunningDistance;
    }

    @Override
    public int takeMaxJumping() {
        return maxJumpingHeight;
    }

    @Override
    public void classMove() {
        System.out.println("Участник " + className + " выходит на поле");
    }
}
