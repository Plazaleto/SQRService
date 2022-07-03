package ru.netology.sqr.tanya.javaqamvn.services;

public class SQRService {
    public int calculate(int minNumber, int maxNumber) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minNumber && i * i <= maxNumber) {
                number = number + 1;
            }
        }

        return number;
    }

}


