package Pyramid;

import java.util.Arrays;
import java.util.List;

public class Pyramid {
    public static void main(String[] args) {
        PyramidBuilder piram = new PyramidBuilder();
        List<Integer> inputNum = Arrays.asList(2, 4, 3, 5, 6, 1);
        piram.buildPyramid(inputNum);
    }
}