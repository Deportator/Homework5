package ru.netology.sqr;

public class SQRService {
    public int counter(int minLimit, int maxLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i) >= minLimit) {
                if ((i * i) <= maxLimit) {
                    count++;
                }
            }
        }
        return count;
    }
}