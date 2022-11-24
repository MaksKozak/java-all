package hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pipe implements Tool{
    private int diameter;


    @Override
    public void play() {
        String pipe = "Playing a pipe with diameter" + " " + diameter + " " + "centimeters";
        System.out.println(pipe);
    }
}
