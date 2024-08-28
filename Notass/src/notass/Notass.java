/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notass;

/**
 *
 * @author SANTIAGO CARDOZO
 */
public class Notass {
    protected int prom;
    protected int est;
    protected int nota[];
    protected int alta;
    protected int baja;
    protected int total;
    public Notass(int est, int nota[]){
        this.est = est;
        this.nota = nota;
    }
    public void calprom(){
    for(int i = 0; i < est; i++){
        total += nota[i];
        prom = total / est;
    }
}
    public void mayor(){
        for (int i = 0; i <est; i++) {
            if (nota[i] > 30) {
                alta ++;
            }
        }
    }
    public int getProm() {
        return prom;
    }
    public int getAlta() {
        return alta;
    }
    public int getBaja() {
        return baja = est - alta;
    }
}
