package labaskhsh1;


public class TestWorker {
    public static void findLowSalary(Worker worker, Worker worker2) {
        Worker[] list = {worker, worker2};
        for (Worker wrk : list) {
            if (wrk.getSalary() < 1200.0f && wrk.getYearsOfExp() >= 5) {
                System.out.println("Ο εργαζόμενος με ΑΜ " + wrk.getAm() + " είναι χαμηλόμισθος");
                wrk.setSalary(wrk.getSalary() + 100.0f);
                System.out.println(wrk.toString());
            }
        }
        
        
    }
    
    public static void main(String[] args) {
        Worker worker = new Worker(39, "Test", "Test", 850.0f, 10, 100.0f);
        Worker worker2 = new Worker(45, "Test2", "Test2", 550.0f, 7, 80.0f);
        
        System.out.println(worker.toString());
        System.out.println("\n");
        System.out.println("Τελικός Μισθός: " + worker.salary());
        System.out.println("------------------");
        System.out.println(worker2.toString());
        System.out.println("\n");
        System.out.println("Τελικός Μισθός: " + worker2.salary());
    }
}
