package modell;

public class Mosoda {
    private Ruha[] ruhak;
    private int ruhaDb;

    public Mosoda() {
        this(5);
    }

    public Mosoda(int db) {
        ruhaDb = 0;
        ruhak = new Ruha[db];
    }
    
    public void bevesz(Ruha ruha){
        if(ruhaDb < ruhak.length){
            ruhak[ruhaDb++] = ruha;
        }else{
            System.out.println("A mosoda megtelt!");
        }
    }
    
    public void mos(){
        for (Ruha ruha : ruhak) {
            if(ruha != null){
                ruha.setTiszta(true);
            }
        }
    }
    
    public void kiad(String tulNeve){
        int i = 0;
        while(i < ruhaDb && !(ruhak[i].getTulNev().equals(tulNeve))){
            i++;
        }
        if(i < ruhaDb){
            System.out.println("Kiadva %s ruhája!".formatted(tulNeve));
            ruhak[i] = null;
        }else{
            System.out.println("Nincs ilyen ruha a mosodában!");
        }
    }

    public String[] getRuhak() {
        String[] ruhak = new String[this.ruhak.length];
        for (int i = 0; i < ruhaDb; i++) {
            Ruha r = this.ruhak[i];
            if(r != null){
                ruhak[i] = r.getTulNev() + " ruhája ";
                ruhak[i] += r.isTiszta() ? "tiszta" : "koszos";
            }
        }
        return ruhak;
    }
    
    
}
