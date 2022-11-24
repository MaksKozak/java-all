package hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Guitar implements Tool{
    private int nos;

    @Override
    public void play() {
        String guitar = "Playing a guitar with" + " " + nos + " " + "strings";
        System.out.println(guitar);
    }
}
