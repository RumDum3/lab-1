package labaskhsh1;


public class Worker {
    private int am;
    private String name;
    private String surname;
    private float salary;
    private int yearsOfExp;
    private float bonus;
    
    public Worker(int am, String name, String surname) {
        this.am = am;
        this.name = name;
        this.surname = surname;
        salary = 0.0f;
        yearsOfExp = 0;
        bonus = 0.0f;
    }
    
    public Worker(int am, String name, String surname, float salary, int yearsOfExp, float bonus) {
        this.am = am;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.yearsOfExp = yearsOfExp;
        this.bonus = bonus;
    }
    
    @Override
    public String toString() {
        return "ΑΜ: " + this.am + "\n" +
                "Όνομα: " + this.name + "\n" +
                "Επίθετο: " + this.surname + "\n" +
                "Μισθός: " + this.salary + "\n" +
                "Χρόνια Εμπειρίας: " + this.yearsOfExp + "\n" +
                "Μπόνους: " + this.bonus;
    }
    
    public int getAm() {return this.am;}
    public String getName() {return this.name;}
    public String getSurname() {return this.surname;}
    public float getSalary() {return this.salary;}
    public int getYearsOfExp() {return this.yearsOfExp;}
    public float getBonus() {return this.bonus;}
    
    public void setAm(int am) {
        this.am = am;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
    
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
    public float salary() {
        return (float) (this.salary + this.yearsOfExp * 10 + this.bonus);
    }
}
