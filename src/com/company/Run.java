package com.company;

public class Run implements Let{
    int distance;

    public Run(int distance) {
        this.distance = distance;
    }

    @Override
    public int aboutRun() {
        return distance;
    }

    @Override
    public int aboutJump() {
        return 0;
    }

//    @Override
//    public boolean aboutRun(int maxLong) {
//        return (maxLong == distance);
//    }
//
//    @Override
//    public boolean aboutJump(int maxHeight) {
//        return false;
//    }
}
