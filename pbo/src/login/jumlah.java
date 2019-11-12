/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

public class jumlah {
    private int awal,akhir,lk,pr;
    
    
    public void setlk(int l){
        this.lk=l;
    }
    
    public void setpr(int p){
        this.pr=p;
    }
    
    public void setAkhir(int i){
        this.akhir = i;
    }
    
    
    public int getlk(){
        return this.lk;
    }
    
    public int getpr(){
        return this.pr;
    }
    
    public int getAkhir(){
        return this.akhir;
    }
    
    public int getAwal(){
        return this.awal=lk+pr;
    }
            
    public int jumlah(){
        return this.awal-this.akhir;
    }
    
}
