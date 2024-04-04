public class Tea {

    private boolean prepare;
    private boolean milk;
    private boolean sugar;

    
    // Prepares basic tea with hot water and tea leaves
     
    public void prepareTea() {
        prepare = true;
        System.out.println("Tea prepared with hot water and tea leaves");
        System.out.println("");
    }

    
    // Ads milk to basic tea
     
    public void addMilk() {
        if (prepare) {
            milk = true;
            System.out.println("Milk added to  tea");
        } else {
            System.out.println("Tea needs to be prepared first");
        }
    }

    
     // Ads sugar to basic tea
     
    public void addSugar() {
        if (prepare) {
            sugar = true;
            System.out.println("Sugar added to tea");
        } else {
            System.out.println("Tea needs to be prepared first");
        }
    }

    
     // prints tea, milk and sugar
     
    public void printTea() {
         System.out.println("");
        System.out.println("Tea prepared: " + prepare);
        System.out.println("Milk added: " + milk);
        System.out.println("Sugar added: " + sugar);
    }

    public static void main(String[] args) {
        Tea t = new Tea();
        t.prepareTea();
        t.addMilk();
        t.addSugar();
        t.printTea();
    }
}
/*
OUTPUT
Tea prepared with hot water and tea leaves

Milk added to  tea
Sugar added to tea

Tea prepared: true
Milk added: true
Sugar added: true
 */


