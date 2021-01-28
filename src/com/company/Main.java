package com.company;

public class Main {

    public static void main(String[] args) throws MyArrayDataException, MyArraySizeException {

        Let[] lets = {
                new Run(100),
                new Jump(10),
        };
        RunJump[] members = {
                new Human("Human1", 50, 5),
                new Cat("Cat1", 100, 2),
                new Robot("Robot1", 1100, 600)
        };
        for (int i = 0; i < members.length; i++) {
            boolean winn = true;
            System.out.println(" ");
            members[i].classMove();
            for (int j = 0; j < lets.length; j++) {
                if (members[i].takeMaxRunning() >= lets[j].aboutRun()) {
                    System.out.println("Отлично, вы прошли, переходите к следующему препятсвию");
                    winn = true;
                    j++;
                    if (members[i].takeMaxJumping() >= lets[j].aboutJump()) {
                        winn = true;
                        System.out.println("Вы преодолели все препятсвия");
                    } else {
                        System.out.println("Увы, второе препятсвие вы не прошли");
                        winn = false;
                    }
                } else {
                    System.out.println("Вы не прошли первое препятсвие, ко второму вход закрыт");
                    winn = false;
                }
                break;
            }
        }

        

        //exception
        exceptionNumbersOk();
        exceptionNumbersLength();
        exceptionNumbersData();
    }


    public static void exceptionNumbersOk() throws MyArrayDataException, MyArraySizeException {

        String[][] test = {{"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1","2","3","4"},
                            {"1", "2", "3", "4"}};
        testArray(test);
    }

    public static void exceptionNumbersLength() throws MyArrayDataException, MyArraySizeException {

        String[][] test = {{"1", "2", "3", "4"},
                {"1","2","3","4"},
                {"1", "2", "3", "4"}};
        testArray(test);
    }

    public static void exceptionNumbersData() throws MyArrayDataException, MyArraySizeException {

        String[][] test = {{"1", "2", "3", "4"},
                {"1", "2", "y", "4"},
                {"1","2","3","4"},
                {"1", "2", "3", "4"}};
        testArray(test);
    }


    public static void testArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array.length != 4){
            throw new MyArraySizeException("Array can be only 4x4");

        }
            int a = 0;

                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        try {
                            a += Integer.parseInt(array[i][j]);
                        } catch (Exception re) {
                            throw new MyArrayDataException("Data error [" + i + "][" + j + "]");
                        }
                    }
                } System.out.println(a);
            }
            }



