
public class BreakSample {

    public static void main(String[] args) {
        int [] targetArray = { 23, 13, 100, 42, 432, 43};
        int search = 100;
        int i;

        for (i = 0; i < targetArray.length; i++) {
            if ( search == targetArray[i] ) {
                break;
            }
        }

        if (i >= targetArray.length) {
            System.out.println("Not Found");
        } else {
            System.out.println("添字" + i + "に対象のデータがあった");
        }
    }

}
