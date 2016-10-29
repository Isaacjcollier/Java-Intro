public class Calc {

   public int firstNum;
   public int secondNum;

  public Calc(int firstNum, int secondNum) {
    this.firstNum = firstNum;
    this.secondNum = secondNum;
  }

  public int add() {
    return this.firstNum + this.secondNum;
  }

  public int subtract() {
    return this.firstNum - this.secondNum;
  }

  public int multiply() {
    return this.firstNum * this.secondNum;
  }

  public int division() {
    return this.firstNum / this.secondNum;
  }

  public static void main(String[] args){
    Calc testCalc = new Calc(3, 5);
    System.out.println(testCalc.add());
    System.out.println(testCalc.subtract());
    System.out.println(testCalc.multiply());
    System.out.println(testCalc.division());
  }
}
