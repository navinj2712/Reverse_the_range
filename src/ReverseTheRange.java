import java.util.Scanner;

public class ReverseTheRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array of elements : ");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter start : ");
        int start = scanner.nextInt();
        System.out.println("Enter end : ");
        int end = scanner.nextInt();
        int[] outputArray = findReverseTheRange(array, start, end);
        for (int i = 0; i < size; i++){
            System.out.print(outputArray[i] + " ");
        }
    }

    private static int[] findReverseTheRange(int[] array, int start, int end) {
        int i = start, j = end;
        while (i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
}
