public class Main {
    public static void main(String[] args) {
        System.out.println(goOutside(17, 23));
        System.out.println(goOutside(34, 12));
        System.out.println(goOutside(44, 28));
        System.out.println(goOutside(25, -15));
        System.out.println(goOutside(60, 30));
        
    }

    public static String goOutside(int age, int temp) {

        if ((age > 20 && age < 45) && (temp > -20 && temp < 30))
            return "Можно идти гулять";
        else if (age < 20 && (temp > 0 && temp < 28))
            return "Можно идти гулять";
        else if (age < 45 && (temp > -10 && temp < 25))
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }
}
