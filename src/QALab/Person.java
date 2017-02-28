package QALab;

/**
 * Created by Ioana on 2/28/2017.
 */
public class Person {
    private String prenume;
    private String nume;
    private int ziNastere;

    public Person() {

    }

    public Person(String nume, String prenume, int x) {
        this.prenume = prenume;
        this.nume = nume;
        ziNastere = x;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNume(String x) {
        prenume = x;
    }

    public static void main(String[] args) {
        Person florin = new Person();
        Person maria = new Person();
        florin.setNume("Macicasan");
        florin.setPrenume("Florin");
        maria.setPrenume("Maria");
        //suprascriu
        florin.setNume("Popescu");
    }
}
