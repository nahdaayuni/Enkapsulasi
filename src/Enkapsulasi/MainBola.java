
package Enkapsulasi;
public class MainBola {
    public static void main(String[] args){
        double Jarijari=14;
        Bola objekbola=new Bola(7);
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
        System.out.println("\n\n");
        objekbola.setJarijari(Jarijari);//manipulasi dengan variabel jari jari yang dibuat
        objekbola.showDiameter();
        objekbola.showLuasPermukaan();
        objekbola.showVolume();

    }
    
}
