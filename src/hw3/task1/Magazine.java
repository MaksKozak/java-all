package hw3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{
    private String title;
    private int pages;
    private Type type;

    @Override
    public void print() {
        String mag = title + " " + type.name();
        System.out.println(mag);
    }
}


