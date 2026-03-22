public class DelcarationANDReinitialization {
    //in class level we can only declare statements
    //int num;
    
    int num=200;//declaration with values
    
    // assignment statements can`t appear at class level they can only appear at methods and constructors
    //num=20;
    void compute(){
        num=3000; //re-initialization
        int increment=num+1;
        System.out.println(increment);
    }

    public static void main(String[] args){ 
        DelcarationANDReinitialization callobj=new DelcarationANDReinitialization();
        callobj.compute();
    }
    
}   
