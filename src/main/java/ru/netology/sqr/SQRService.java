package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound && i * i <= upperBound) {
                count++;
            }
        }
        return count;
    }
}