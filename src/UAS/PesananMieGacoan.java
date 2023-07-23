package UAS;

//Inheritance
public class PesananMieGacoan extends MieGacoan {

    //Overriding
    public PesananMieGacoan(String menu, String costumer, String kode) {
        super(menu, costumer, kode);
    }

    public int getNoPesanan() {
        return Integer.parseInt(getKode().substring(0, 2)) + 0;
    }

    //Seleksi
    public String getLevel() {
        if (getKode().substring(2, 3).equals("A")) {
            return "Mie Angel";
        } else if (getKode().substring(2, 3).equals("B")) {
            return "Mie Setan";
        } else if (getKode().substring(2, 3).equals("C")) {
            return "Mie Iblis";
        } else {
            return "costum";
        }
    }

    //Polymophism (Overriding)
    @Override
    public String displayInfo() {
        return super.displayInfo()
                + "\nNoPesanan: " + getNoPesanan()
                + "\nLevel: " + getLevel();
    }
}
