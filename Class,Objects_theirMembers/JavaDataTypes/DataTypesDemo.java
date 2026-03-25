

public class DataTypesDemo {
    public static void main(String[] args){

        /////////////////////////////// Bytes ///////////////////////////////////
            //bytes Range: -128 to 127
    
                  //byte b = 100;
                   byte b = (byte)400; // Compiles, but value will overflow
                   //System.out.println(b);

                  byte age = 25;
                  byte temp = -40;
                  byte max = Byte.MAX_VALUE; // 127
                  byte min = Byte.MIN_VALUE; // -128


                  // Arithmetic promotes to int automatically
                  byte one = 10, two = 20;

                  // When you perform arithmetic operations like +, Java automatically promotes byte, short, and char operands to int before performing the operation.
                  //byte  c = one + two;  // COMPILE ERROR  one + two = int, can't assign int to byte
                  //one and two (byte) is promoted to int

                  // Explicit type cast:
                  byte c = (byte)(one + two); // must cast back



                //   Error cases & traps

                //   :- Overflow / wrap-around byte b = (byte)200 → silently becomes -56. No exception thrown.
                //   :- Arithmetic promotion byte + byte → int. You MUST cast back or it won't compile.
                //   :- Literal out of range byte b = 200; → compile error: incompatible types.




                // Where to use
                // Binary data / file I/O (InputStream returns byte[])
                // Network packet parsing
                // Image pixel data (javax.imageio)
                // Memory-sensitive large arrays



    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    


    //////////////////////////////////////////// Short   /////////////////////////////////////////////////
       // Variants / declarations
     //short s=30000;
     short[] audio = new short[200];
     // Code examples

     short s = 30000;
    short maxVal = Short.MAX_VALUE; // 32767
    // Same promotion issue as byte
    short aa = 100, bb = 200;
    // short c = a + b; // COMPILE ERROR
    short cc = (short)(aa + bb);

     // Useful in large primitive arrays
    short[] pcmAudio = new short[44100]; // audio sample

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


////////////////////////////////////////// Integer ///////////////////////////////////////////////////
     
            //Variants / declarations

          //int x = 100;
          //int x = 0xFF; // hex
          //int x = 0b1010; // binary
          //int x = 1_000_000; // underscores (Java 7+)

          //Code examples

          int count = 0;
          int hex = 0xFF;        // 255
          int bin = 0b1010;      // 10
          int big = 1_000_000;   // readability

          // Integer.MAX_VALUE overflow (no exception!)
          int overflow = Integer.MAX_VALUE + 1; // -2147483648

           // Bit operations (common in DSA)
           int n = 6;         // 0110
           int bit = n & 1;   // check LSB → 0 (even)
           int shifted = n >> 1; // 3
           int doubled = n << 1; // 12

           boolean  check = n>5;
           //System.out.println(n);
           //System.out.println(bit);
           //System.out.println(shifted);
           //System.out.println(doubled);
           //System.out.println(check);

           // Math utilities

           // give positive number
           int abs = Math.abs(-99);
           //System.out.println(abs);

           //converts to hole number
           int holeNum= (int) Math.round(33.5);
           int divisioncheck=5/2; // gives 2
           //double division=5/2f; //gives 2.5
           //float division=5/2; //gives 2.0
           //float division=5/2f; //gives 2.5
           //System.out.println(division);
           
           //gives maximum number
           int maxNum = Math.max(3, 7);
           //System.out.println(maxNum);

//////////////////////////////////////////////////////////////////////////////////////////////////////////           

/////////////////////////////////////////// Long /////////////////////////////////////////////////
  //Variants / declarations    
      //Large numbers (timestamps, IDs)
           long l = 100L;
           long L = 9_000_000_000L;
           long timestamp = System.currentTimeMillis();
           //System.out.println(timestamp);

   //Code examples
           long population = 8_000_000_000L;  // needs L suffix!
           //long timestamp = System.currentTimeMillis();
           long nanos = System.nanoTime();
           //System.out.println(nanos);

           //long num = 10000000000; //  missing L → treated as int

           // DB primary keys (common in Spring Boot)
              long userId = 123456789L;
           // Overflow check with Math
              //long safe = Math.addExact(Long.MAX_VALUE, 1); // throws ArithmeticException
           // Bit manipulation — same as int but 64-bit
              long mask = 1L << 40;  // MUST use 1L not 1

              //note:-
              //long - Suffix Required:-

              long l1 = 100;      // Works! 100 is int, but promoted to long
              long l2 = 100L;     // Explicit long literal

              // But without L, there's a limit:
              //long l3 = 2147483648;    // ERROR! Too large for int
              //long l4 = 2147483648L;   // OK - explicit long literal
////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////// FLOAT  //////////////////////////////////////////////////////
 
// Variants / declarations
  //Rare (memory-sensitive cases)
              
            float f = 3.14f;
            //float f = 10.5; //  needs 'f'

            float floats = 3.14f;   // f suffix required!
            float pi = (float) Math.PI;

            // Precision problem — classic trap
           float a = 0.1f + 0.2f;
           System.out.println(a); // 0.3 

           // Comparison trap
            if (a == 0.3f) {System.out.println("true statemt"); }  // true

            float inf = 1.0f / 0.0f; // Infinity (no exception)
            float nan = 0.0f / 0.0f; // NaN
            System.out.println(inf + "" + nan);

            //error cases
             //Missing f suffix float x = 3.14; → compile error. Literal is double by default. Write 3.14f.


             //note:-
             //float - Suffix Required
             //float f1 = 10.5;    // ERROR! 10.5 is double
             //float f2 = 10.5f;   // OK - explicit float literal
             //float f3 = 10;      // OK - int literal promoted to float
             //float f4 = 10.0f;   // OK

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//////////////////////////////////// DOUBLE (Default decimal) ///////////////////////////////////////////////////////
//Variants / declarations
//Calculations, percentages
//Code examples
             double d = 3.14;       // default literal, no suffix needed
             double piVal = Math.PI;   // 3.141592653589793
             double x = 0.1 + 0.2;
             System.out.println(x); // 0.30000000000000004
             double sqrt2 = Math.sqrt(2);
             double log = Math.log(100);   // natural log
             System.out.println(log);
             double pow = Math.pow(2, 10); // 1024.0
             double numchek = 10 / 3; //  gives 3.0, not 3.33
}


}
