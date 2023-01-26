public class Main {
    public static void main(String[] args) {
        int basic = 500;
        int refill = 1000;
        int bonus = refill / 100;

        int sum;
        if (refill >= 1000) {
            sum = basic + refill + bonus;
        } else {
            sum = basic + refill;
        }
        System.out.println("Итоговая сумма " + sum);
    }
}