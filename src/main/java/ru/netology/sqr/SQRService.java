package ru.netology.sqr;
public class SQRService {
   public int counter(int MinLimit, int MaxLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i) >= MinLimit) {
                if ((i * i) <= MaxLimit) {
                    count++;
                }
            }
        }
        return count;
        }
    }