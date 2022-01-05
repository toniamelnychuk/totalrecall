public class CanculatorDemo {
    public static void main(String[] args) {
        Calculator result = new Calculator();
        System.out.println('\n' + "eto plus " + result.plus(1, 1));
        System.out.println('\n' + "eto minus " + result.minus(3, 1));
        System.out.println('\n' + "eto multiply " + result.multiply(2, 4));
        System.out.println('\n' + "eto divide " + result.divide(10, 5));
        System.out.println('\n' + "eto divide s oshibkoy " + result.divide(10, 0));
    }
}
