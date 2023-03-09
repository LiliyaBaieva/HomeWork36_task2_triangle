public class Main {
  public static void main(String[] args) {
    // Этот метод необходимо использовать в конструкторе.
    // При провале любой из проверок нужно вывести на экран соответствующее сообщение.

    Triangle triangle = new Triangle(5, 7,10);
    System.out.printf(triangle.stringToPrint());
    System.out.println();

    Triangle triangleNegative = new Triangle(3, -8, 0);
    System.out.printf(triangleNegative.stringToPrint());
    System.out.println();

    Triangle triangleSameSides = new Triangle(3,5,3);
    System.out.printf(triangleSameSides.stringToPrint());
    System.out.println();


  }

}