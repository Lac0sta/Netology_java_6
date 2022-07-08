public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Ежемесячный (аннуитетный) платёж по кредиту на 1 год в 1 млн руб. под 9.99% годовых");
        System.out.println(service.calculate(1_000_000, 1, 9.99));

        System.out.println("Ежемесячный (аннуитетный) платёж по кредиту на 2 года в 1 млн руб. под 9.99% годовых");
        System.out.println(service.calculate(1_000_000, 2, 9.99));

        System.out.println("Ежемесячный (аннуитетный) платёж по кредиту на 3 года в 1 млн руб. под 9.99% годовых");
        System.out.println(service.calculate(1_000_000, 3, 9.99));

    }
}
/* Формулу расчета аннуитетного платежа взял с сайта Альфа-Банка: https://alfabank.ru/help/articles/credit/chto-takoe-annuitetniy-i-differentsirovanniy-platezh-po-kreditu/#block_4 */