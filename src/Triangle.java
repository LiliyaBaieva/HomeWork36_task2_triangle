public class Triangle {
  // Создайте класс Triangle (треугольник), принимающий три целых значения - длины трёх сторон треугольника.
  private int sideA;
  private int sideB;
  private int sideC;


  // В конструкторе нужно проверить введённые значения на корректность
  // (например, длины не могут быть отрицательными).
  public Triangle(int sideA, int sideB, int sideC){
    try{
      if(sideA <= 0 || sideB <= 0 || sideC <= 0){
        System.out.println("The length of side can not be negative.");
      } else if (!checkSides(sideA, sideB,sideC)) {
        System.out.println("The triangle can not have the same sides.");
      }
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
    } catch (NumberFormatException e){
      System.out.println("Incorrect number entry: " + e.getMessage());
    }
  }

  // В классе должен быть описан отдельный статический метод public static bool checkSides(int a, int b, int c),
  // который должен проверить неравенство треугольника.
  public static boolean checkSides(int sideA, int sideB, int sideC){
    if(sideA == sideB || sideA == sideC || sideB == sideC){
//      System.out.println("The triangle can not have the same sides.");
      return false;
    }
    return true;
  }

  public int getSideA(){
    return sideA;
  }
  public int getSideB(){
    return sideB;
  }
  public int getSideC(){
    return sideC;
  }

  public String stringToPrint(){    // to test what we have to print
    return String.format("The triangle has side A = %d, side B = %d, side C = %d%n", sideA,sideB,sideC);
  }







}
