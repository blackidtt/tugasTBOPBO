package login;


public class data extends suara{
    private int calon1, calon2, calon3, lk, pr;
    private String off, prodi;

    public void setCln1(int c){
        this.calon1 = c;
    }
    
    public void setCln2(int c){
        this.calon2 = c;
    }
    
    public void setCln3(int c){
        this.calon3 = c;
    }
    
    public void setLK(int l){
        this.lk = l;
    }
    
    public void setPR(int p){
        this.pr = p;
    }
    
    public int getLK(){
        return this.lk;
    }
    
    public int getPR(){
        return this.pr;
    }
    
    public int getCln1(){
        return this.calon1;
    }
    
    public int getCln2(){
        return this.calon2;
    }
    
    public int getCln3(){
        return this.calon3;
    }
    
    public void setOff(String c){
        this.off = c;
    }

    public String getOff() {
        return this.off;
    }
    
    public void setProdi(String c){
        this.prodi = c;
    }

    public String getProdi() {
        return this.prodi;
    }
 
    @Override
    public int jumlah(){
        return lk+pr;
    }
    
    public int jumlah(int c1, int c2, int c3){
        return c1+c2+c3;
    }
    
    

    
}