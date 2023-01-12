public class BmiService {

    public int calculate(int mass, int height) {
        int index = mass * 10000 / (height * height);
        return index;
    }
}
