package UAS;

//Class
public class MieGacoan {
    //Atribut dan Encapsulation
    private String menu;
    private String costumer;
    private String kode;

    //Constructor
    public MieGacoan(String menu, String costumer, String kode) {
        this.menu = menu;
        this.costumer = costumer;
        this.kode = kode;
    }
      
    //Mutator (Setter)
    public void setMenu(String menu) {
        this.menu = menu;
    }
    
    public void setCostumer(String costumer) {
        this.costumer = costumer;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
  
    //Accessor (Getter)
    public String getMenu() {
        return menu;
    }

    public String getCostumer() {
        return costumer;
    }

    public String getKode() {
        return kode;
    }
    
    public String displayInfo() {
        return "Menu: "+getMenu()+"\nCostumer: "+getCostumer()+"\nKode: "+getKode();
    }
    
    //Polymophism (Overloading)
    public String displayInfo(String NoPesanan) {
        return displayInfo() + "\nNoPesanan: " + NoPesanan;
    }
    
}
