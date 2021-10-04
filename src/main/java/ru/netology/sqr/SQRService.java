package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int j = i * i;
//            Если квадрат i входит в границы диапазона lowerBound-upperBound счетчик count увеличивается на еденицу.
            if (j >= lowerBound && j <= upperBound) {
                count++;
            }
        }
        return count;
    }
}