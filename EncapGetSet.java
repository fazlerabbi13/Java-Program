class Person {
    private String name;
 
    // Getter
    public String getName() {
      return name;
    }
 
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }
 }
 
public class EncapGetSet {
    public static void main(String[] args) {
       Person myObj=new Person();
        myObj.setName("Jhon");
        System.out.println(myObj.getName());
      }
}
