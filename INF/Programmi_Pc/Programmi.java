public class Programmi {
    private String nome;
    private String produttore;
    private double version;
    private String sist0p;
    private int anno;
    
    public Programmi(String nome, String produttore, double version, String sist0p, int anno){
        this.nome=nome;
        this.produttore=produttore;
        this.version=version;
        this.sist0p=sist0p;
        this.anno=anno;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProduttore() {
        return produttore;
    }
    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }
    public String getSist0p() {
        return sist0p;
    }
    public void setSist0p(String sist0p) {
        this.sist0p = sist0p;
    }
    public double getVersion() {
        return version;
    }
    public void setVersion(double version) {
        this.version = version;
    }
    public String toString(){
        return nome + "\n" + produttore + "\n" + version + "\n" + sist0p + "\n" +  anno + "\n";
    }
    public int compareAnno(Programmi prog){
        return this.anno - prog.getAnno();
    }
}
