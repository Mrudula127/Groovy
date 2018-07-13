class UnitTest {
   static void main(String[] args) {
      Student mst = new Student();
      mst.name = "kolaparthi";
      mst.ID = 1;
      println(mst.Display())
   } 
} 
 
public class StudenTestt {
   String name;
   int ID;
    
   String Display() {
      return name +ID;
   }  
}