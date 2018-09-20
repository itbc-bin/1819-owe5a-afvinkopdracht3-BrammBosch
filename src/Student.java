public class Student {

    private String naam;  //instance variabele

    private static int minLeeftijd = 18;  //class variabele
    private int studentnummer;

    public Student(String naam){  //Constructor een

        this.naam = naam;
    }

    public Student(String naam, int studentnummer){
        this.naam = naam;
        setStudentnummer(studentnummer);

    }

    public void setStudentnummer(int nr) {
        studentnummer = nr;
    }

    public int getStudentnummer() {
        return studentnummer;
    }

    public void info(){
        System.out.println("Dit is student "+getNaam());
        System.out.println("Met het studentnummer "+studentnummer);
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }
}