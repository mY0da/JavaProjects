public class Main {
    public static void main(String[] args){
        System.out.println("This is Screen Match");
        System.out.println("Movie: Top Gun: Maverick");

        int yearOfRelease = 2022;
        String year = String.format("Released date: %s.", yearOfRelease);
        System.out.println(year);
        boolean includeInBundle = true;
        double rating = 8.1;
        double everage = (7.0 + 6.7 + 8.1) / 3;

        String synopsis = """
                Movie: Top Gun
                Adventure movie from the 80s
                Great!
                """ + year;
        System.out.println(synopsis);

        int classification = (int) (rating / 2);
        System.out.println(classification);
    }
}
