package labaskhsh1;


public class Student {
    private int am;
    private String name;
    private String surname;
    private int absence;
    private float labScore;
    private float theoryScore;
    
    public Student(int am, String name, String surname) {
        this.am = am;
        this.name = name;
        this.surname = surname;
        absence = 0;
        labScore = 0.0f;
        theoryScore = 0.0f;
    }
    
    public Student(int am, String name, String surname, int absence, float labScore, float theoryScore) {
        this.am = am;
        this.name = name;
        this.surname = surname;
        this.absence = absence;
        this.labScore = labScore;
        this.theoryScore = theoryScore;
    }
    
    @Override
    public String toString() {
        return "ΑΜ: " + this.am + "\n" +
                "Όνομα: " + this.name + "\n" +
                "Επίθετο: " + this.surname + "\n" +
                "Απουσίες: " + this.absence + "\n" +
                "Εργαστήριο: " + this.labScore + "\n" +
                "Θεωρία: " + this.theoryScore;
    }
    
    public int getAm() {return this.am;}
    public String getName() {return this.name;}
    public String getSurname() {return this.surname;}
    public int getAbsence() {return this.absence;}
    public float getLabScore() {return this.labScore;}
    public float getTheoryScore() {return this.theoryScore;}
    
    public void setAm(int am) {
        this.am = am;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setAbsence(int absence) {
        this.absence = absence;
    }
    
    public void setLabScore(float labScore) {
        this.labScore = labScore;
    }
    
    public void setTheoryScore(float theoryScore) {
        this.theoryScore = theoryScore;
    }
    
    public float computeFinal() {
        return (labScore * 0.3f + theoryScore * 0.7f);
    }
    
}
