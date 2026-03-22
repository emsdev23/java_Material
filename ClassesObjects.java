public class ClassesObjects {

     int currentYear=2026;
     int caclage(){
     int bornyear=1998;
     int age= currentYear-bornyear;
     return age;
    }

   public static void main(String[] args){
   ClassesObjects age= new ClassesObjects();
    System.out.println(age.caclage());
   }
    
}
