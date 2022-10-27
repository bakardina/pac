package ru.netology.sqr;

public class SQRService {

    /**
     * @param min
     * @param max
     * @return
     */
    public int calculate(int min, int max) {
        int count = 0;
        // цикл начинается с 10 потому что
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= min) {
                if (sqr <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}