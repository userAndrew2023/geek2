package org.example;

public class Robot implements MovingCreations {
    private final int runLimit;
    private final int jumpLimit;

    public Robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        return treadmill.getDistance() > this.runLimit;
    }

    @Override
    public boolean jump(Wall wall) {
        return wall.getDistance() > this.jumpLimit;
    }
}
