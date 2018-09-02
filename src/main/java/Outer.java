/**
 * Outer class that offers a Nested class inaccessible from Scala :(
 */
public class Outer {
  public class Nested {
    public String methodWithAParam(String param) {
      return "a string";
    }
  }
}
