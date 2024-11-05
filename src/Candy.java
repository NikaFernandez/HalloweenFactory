public class Candy {

    String type;
    int calories;
    boolean isSour;

    public Candy() {

    }

    public void printInfo() {
        System.out.println("Type of Candy: " + type);
        System.out.println("Number of calories: " + calories);
        System.out.println("BearHasBow: " + isSour);
        System.out.println("*****");
    }

}
