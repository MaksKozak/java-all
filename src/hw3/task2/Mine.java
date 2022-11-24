package hw3.task2;

import java.util.ArrayList;
import java.util.List;

public class Mine {
    public static void main(String[] args) {

        List<Tool> toolList = new ArrayList<>();
        toolList.add(new Guitar(6));
        toolList.add(new Drum(30));
        toolList.add(new Pipe(15));

for (Tool tool :toolList) {
    tool.play();
}
    }
}

