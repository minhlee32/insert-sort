public class InsertSort {
    static int[] list = {100, 20, 60, 35, 10, 9, 8, 1, 2, 5, 0, 88, 6};

    public static void main(String[] args) {
        System.out.print("List before sorted:");
        printList();

        System.out.println("\nList after sorted:");
        sort(list);
    }

    private static void printList() {
        for (int aList : list) {
            System.out.print(aList + "\t");
        }
    }

    private static void sort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int hold = list[i];
            for (int j = i; j > 0 && list[j - 1] > list[j]; j--) {
                hold = list[j];
                list[j] = list[j - 1];
                list[j - 1] = hold;
            }
            System.out.print("\n");
            printList();
        }

    }
}
