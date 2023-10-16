package main;

import modell.Mosoda;
import modell.Ruha;

public class MosodaProgram {

    private Mosoda mosoda;

    public static void main(String[] args) {
        new MosodaProgram();
    }
    
    public MosodaProgram() {
        mosoda = new Mosoda(4);
        mosoda.bevesz(new Ruha("Péter"));
        mosoda.bevesz(new Ruha("Pál"));
        mosoda.bevesz(new Ruha("Petra"));
        
        System.out.println("mosás ELŐTT:");
        mosodaRuhai();
        
        System.out.println("mosás UTÁN:");
        mosoda.mos();
        mosodaRuhai();
        
        mosoda.kiad("Pál");
        System.out.println("Pál elvitte a ruháját:");
        mosodaRuhai();
    }
    
    private void mosodaRuhai() {
        for (String ruha : mosoda.getRuhak()) {
            if(ruha != null){
                System.out.println(ruha);
            }
        }
    }

}
