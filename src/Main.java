public class Main {
    public static void main(String[] args) {
        System.out.println(ageTemp(21, -18));
        System.out.println(ageTemp(18, 28));
        System.out.println(ageTemp(-50, 35));
        System.out.println(ageTemp(30, 33));
        System.out.println(ageTemp(31, 50));
    }

    public static String ageTemp(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять...";
        } else {
            return "Оставайтесь дома";
        }
    }
}