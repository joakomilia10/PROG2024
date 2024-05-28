public class P1_ejercicio8 {
    public static void main(String[] args){
    boolean tru = true;
    boolean fal = false;

    System.out.println("tabla de OR" + "\n" +
                       "true or false es:" + "\t" + (tru || fal) + "\n" +
                      // "true or true es:" + "\t" + (tru || tru) + "\n" + 
                       "false or true es:" + "\t" + (fal || tru) + "\n" 
                      // "false or false es:" + "\t" + (fal || fal)
                      );


    System.out.println("tabla del AND" + "\n" +
                       "true and false es:" + "\t" + (tru && fal) + "\n" +
                      // "true and true es:" + "\t" + (tru && tru) + "\n" +
                       "false and true es:" + "\t" + (fal && tru) + "\n"  
                      // "false and false es:" + "\t" + (fal && fal)
                       );                   
    }
}
