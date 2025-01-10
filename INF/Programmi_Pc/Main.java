public class Main {
    public static void main(String[] args) {
        Programmi photoshop = new Programmi("Photoshop", "Adobe", 24.2, "windows", 2000);
        Programmi vsstudio = new Programmi("VisualStudio", "Microsoft", 10.4, "windows", 2021);
        System.out.println(photoshop.toString());
        System.out.println(vsstudio.toString());
        if (photoshop.compareAnno(vsstudio)<0){
            System.out.println("Visual Studio Code è più recente di photoshop");
        } else {
            System.out.println("Visual Studio Code è meno recente di photoshop");
        }
    }
}
