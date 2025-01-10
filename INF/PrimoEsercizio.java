package INF;
public class PrimoEsercizio {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};  
        int[] array2 = {9, 1, 11, 5, 13, 7};
        int result = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result = 1;
                    break;  
                }
            }
            if (result == 1) {
                break;  
            }
        }

        if (result == 1) {
            System.out.println("Sì");  
        } else {
            System.out.println("No");
        }
    }
}
