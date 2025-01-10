

public class Cd {
    private String title;
    private String autor;
    private int nSongs;
    private double duration;

    public Cd(String title, String autor, int nSongs, double duration){
        this.title = title;
        this.autor = autor;
        this.nSongs = nSongs;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }
    public String getAutor(){
        return autor;
    }
    public int getSongs(){
        return nSongs;
    }
    public double getDuration(){
        return duration;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setSongs(int nSongs){
        this.nSongs = nSongs;
    }
    public void setDuration(double duration){
        this.duration = duration;
    }

    public String toString(){
        return getTitle() + "\n" + getAutor() + "\n" + getSongs() + "\n" + getDuration() + "\n";
    }

    public double compareDuration(Cd cd){
        return this.duration - cd.getDuration();
    }
}
