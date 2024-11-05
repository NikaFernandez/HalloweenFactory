public class HalloweenFactory {


    public static void main(String[] args) {
        HalloweenFactory myStore; //declare
        myStore = new HalloweenFactory(); // construct
    }

    public HalloweenFactory() { //constructor method
            Candy candy1; //declare bear1
            candy1 = new Candy(); //construct bear1
            candy1.type = "blue";
            candy1.calories = 50;
            candy1.isSour = true;
            candy1.printInfo();//methods have parentheses

            Student student1; //declare cat1
            student1 = new Student(); //construct cat1
            student1.name = "lily";
            student1.costume = "ladybug";
            student1.nCandy = 22;
            student1.printInfo();//methods have parentheses

    }
}
