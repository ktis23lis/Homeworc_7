package com.company;

public class Jump implements Let{
    int height;

    public Jump(int height) {
        this.height = height;
    }

    @Override
    public int aboutRun() {
        return 0;
    }

    @Override
    public int aboutJump() {
        return height;
    }


//
//    @Override
//    public boolean aboutRun(int maxLong) {
//        return false;
//    }
//
//    @Override
//    public boolean aboutJump(int maxHeight) {
//        return (maxHeight == height);
//    }
}
