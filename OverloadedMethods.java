public class OverloadedMethods {

  public static void main(String[] args) {
    // create instance here
    OverloadedMethods om = new OverloadedMethods();
    om.print();
    om.print("second print method");
  }

  // overload methods here
  public void print() {
    System.out.println("original print method.");
  }

  public void print(String str) {
    System.out.println(str);
  }
}