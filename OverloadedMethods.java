public class OverloadedMethods {
  public int instanceCount = 0;

  public static void main(String[] args) {

    // create instance here
    OverloadedMethods om = new OverloadedMethods();
    om.print();
    om.print("second print method");
    System.out.println(om.instanceCount);
  }

  // overload methods here
  public void print() {
    System.out.println("original print method.");
  }

  public void print(String str) {
    System.out.println(str);
  }
}