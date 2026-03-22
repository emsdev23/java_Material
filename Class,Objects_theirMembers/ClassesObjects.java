public class ClassesObjects {

     int currentYear=2026;


     
     // funtion

   //   void caclage(){
   //   int bornyear=1998;
   //   int age= currentYear-bornyear;
   //   return age; this gives error since void cant return nothing
   //  }

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
