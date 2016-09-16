public class Sumiranje{

     public static int Sum(int []args){
        //System.out.println("Hello World");
        
        int i = 0;        // Create a separate integer to serve as your array indexer.
        int sum = 0;
        while(i < args.lenght) {   // The indexer needs to be less than 10, not A itself.
            sum += args[i];   // either sum = sum + ... or sum += ..., but not both
            i++;           // You need to increment the index at the end of the loop.
        }
        return sum;
     }
}
