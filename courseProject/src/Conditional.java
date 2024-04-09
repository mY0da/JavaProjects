public class Conditional {
    public static void main(String[] args) {
        int yearOfRelease = 2022;
        boolean includeInBundle = true;
        double rating = 8.1;
        String typeOfBundle = "Plus";

        if (yearOfRelease >= 2023) {
            System.out.println("Popular new releases!");
        } else {
            System.out.println("Retro movie that's worth watching it!");
        }

        if (includeInBundle || typeOfBundle.equals("Plus")) {
            System.out.println("Movie available");
        } else {
            System.out.println("Must pay to watch");
        }
    }
}
