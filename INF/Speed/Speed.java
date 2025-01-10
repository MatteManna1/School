public class Speed {
    private int velocita;

    public Speed(int velocita) {
        this.velocita = velocita;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }
    public void Accelera(){
        this.velocita+=5;
        CheckVelocita();
    }

    public void Frena(){
        this.velocita-=5;
        if(this.velocita<0){
            this.velocita=0;
        }
        CheckVelocita();
    }
    public void CheckVelocita(){
        if(this.velocita>90){
            System.out.println("Velocià elevata");
        }
    }
    
}
