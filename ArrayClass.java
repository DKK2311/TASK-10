public class ArrayClass {

    public static void main(String[] args) {
        
        
        System.out.println("PrepareTea");
        // Creating an array
           Tea[] tea = new Tea[7];
           
        // Creating Instances for class and subclass
           
           tea[0] = new Tea();
           tea[1] = new BlackTea();
           tea[2] = new GreenTea();
           tea[3] = new HerbalTea();
                          
        // Calling prepareTea() method
            tea[0].prepareTea();
            tea[1].prepareTea();
            tea[2].prepareTea();
            tea[3].prepareTea();
       }
}

