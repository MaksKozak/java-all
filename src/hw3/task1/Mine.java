package hw3.task1;

import java.util.ArrayList;
import java.util.List;

public class Mine {
    public static void main(String[] args) {

        List<Printable> printableList = new ArrayList<>();
        printableList.add(new Magazine("Ga-la-ga", 60, Type.SportInfo));
        printableList.add(new Book("Harry Potter", 450, Genre.Fantasy));


        for (Printable printable : printableList) {
            printable.print();
        }
    }
}
