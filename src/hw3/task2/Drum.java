package hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Drum implements Tool{
    private int size;

    @Override
    public void play() {
        String drum = "Playing a drum with size" + " " + size + " " + "centimeters";
        System.out.println(drum);
    }
}
