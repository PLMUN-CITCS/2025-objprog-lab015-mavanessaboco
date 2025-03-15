public class VariableScope {
    static int globalCount = 100; // global variable yata?
    public static void main(String[] args) {
        showScope(); //Print nito yung integer 100 
    }public static void showScope() {
        int localCount = 50; //Ito yung 50 lang kasi yun lang naman ang value nito para kay localcount eme.
        
        //SUS pwede naman pala sila pagsama-samahin tapos bali-baliktarin pinahirapan pako:)
        System.out.println("Global Count (from main): " + globalCount);
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}