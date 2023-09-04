public class App {
    public static void main(String[] args) {
       SUV maruti = new SUV("Maruti",false);
       maruti.move(0,45);
       maruti.acceLerate(0);

       System.out.println("Current Gear: " + maruti.getCurrentGear());
       System.out.println("Current Speed: " + maruti.getCurrentSpeed());
    }
}
