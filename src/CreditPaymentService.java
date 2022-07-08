public class CreditPaymentService {

    public double calculate(int sum, int years, double percent) {

        double m = (percent / 12) / 100; /* m - это процентная ставка в месяц, равная годовой ставке, поделённой на 12 */
        int n = years * 12; /* n - это количество платежей */
        double fort1 = Math.pow(1 + m, n); /* первый промежуточный подсчёт */
        double fort2 = Math.pow(m + 1, n); /* второй промежуточный подсчёт */
        double coefficient = (fort1 * m) / (fort2 - 1); /* вычисление коэффициента аннуитета */

        double result = sum * coefficient;
        int d = (int)Math.round(result);
        return d;
    }

}