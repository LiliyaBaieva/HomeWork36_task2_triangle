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
      }
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
    } catch (NumberFormatException e){
      System.out.println("Incorrect number entry: " + e.getMessage());
    }

  }



}
