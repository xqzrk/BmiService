public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 75; // вес в кг
        int height = 185; //рост в см
        int index = service.calculate(mass, height);
        System.out.println("ИМТ - " + index);



    }
}