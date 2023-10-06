package myworks;
public class Countofoddnum1tot99 {

    public static void main(String[] args) {
        Countofoddnum1tot99 od = new Countofoddnum1tot99();
        od.countOfOddNum1To99();
    }

    public void countOfOddNum1To99() {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Count of odd numbers from 1 to 99: " + count);
    }
}