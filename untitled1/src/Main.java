
import java.util.Random;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       int rows = 15;
//       int columns = 8;
//       int[][] array = new int[rows][columns];
//       Random random = new Random();
//       for (int i = 0; i < rows; i++) {
//           for (int j = 0; j < columns; j++) {
//               array[i][j] = random.nextInt(100); // Генерує випадкове число в діапазоні [0, 100)
//           }
//       }
//       System.out.println("Вихідний масив:");
//       printArray(array);
//       System.out.println("Введіть k (менше s):");
//       int k = in.nextInt();
//       System.out.println("Введіть s:");
//       int s = in.nextInt();
//       if (k >= s || k < 0 || s > rows) {
//           System.out.println("Некоректні значення k або s.");
//           return;
//       }
//       for (int i = k + 1; i < s; i++) {
//           int start = 0;
//           int end = columns - 1;
//           while (start < end) {
//               // Обмін елементів
//               int temp = array[i][start];
//               array[i][start] = array[i][end];
//               array[i][end] = temp;
//
//               start++;
//               end--;
//           }
//       }
//       System.out.println("Оновлений масив:");
//       printArray(array);
//   }
//    private static void printArray(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }




//       Scanner in = new Scanner(System.in);
//       int rows = 5;
//       int columns = 20;
//       int[][] array = new int[rows][columns];
//       Random random = new Random();
//       for (int i = 0; i < rows; i++) {
//           for (int j = 0; j < columns; j++) {
//               array[i][j] = random.nextInt(100); // Генерує випадкове число в діапазоні [0, 100)
//           }
//       }
//       System.out.println("Вихідний масив:");
//       printArray(array);
//       System.out.println("Введіть k (менше s):");
//       int k = in.nextInt();
//       System.out.println("Введіть s:");
//       int s = in.nextInt();
//       if (k >= s || k < 0 || s > columns) {
//           System.out.println("Некоректні значення k або s.");
//           return;
//       }
//       for (int j = k + 1; j < s; j++) {
//           int start = 0;
//           int end = rows - 1;
//
//           while (start < end) {
//               int temp = array[start][j];
//               array[start][j] = array[end][j];
//               array[end][j] = temp;
//               start++;
//               end--;
//           }
//       }
//       System.out.println("Оновлений масив:");
//       printArray(array);
//   }
//    private static void printArray(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }




//       Scanner in = new Scanner(System.in);
//       System.out.println("Введіть кількість рядків:");
//       int rows = in.nextInt();
//       System.out.println("Введіть кількість стовпців:");
//       int columns = in.nextInt();
//       int[][] array = new int[rows][columns];
//       Random random = new Random();
//       for (int i = 0; i < rows; i++) {
//           for (int j = 0; j < columns; j++) {
//               array[i][j] = random.nextInt(100);
//           }
//       }
//       System.out.println("Вихідний масив:");
//       printArray(array);
//       int rowWithFirstZero = findRowWithFirstZero(array);
//       if (rowWithFirstZero != -1) {
//           int[] tempRow = array[0];
//           array[0] = array[rowWithFirstZero];
//           array[rowWithFirstZero] = tempRow;
//           System.out.println("Оновлений масив:");
//           printArray(array);
//       } else {
//           System.out.println("Нульовий елемент не знайдено.");
//       }
//   }
//    private static int findRowWithFirstZero(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] == 0) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//    private static void printArray(int[][] array) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }


       int rows = 5;
       int columns = 10;
       int[][] array = new int[rows][columns];
       Random random = new Random();
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               array[i][j] = random.nextInt(200) - 50; // Генерує випадкове число в діапазоні [-50, 150)
           }
       }
       System.out.println("Вихідний масив:");
       printArray(array);
       int columnWithLastGreaterThan100 = findColumnWithLastGreaterThan100(array);
       if (columnWithLastGreaterThan100 != -1 && columnWithLastGreaterThan100 != 1) {
           // Міняємо місцями другий стовбець та стовбець з останнім елементом більше 100
           for (int i = 0; i < rows; i++) {
               int temp = array[i][1];
               array[i][1] = array[i][columnWithLastGreaterThan100];
               array[i][columnWithLastGreaterThan100] = temp;
           }
           System.out.println("Оновлений масив:");
           printArray(array);
       } else {
           System.out.println("Елемент, більший за 100, відсутній або знаходиться в другому стовбці.");
       }
   }
    private static int findColumnWithLastGreaterThan100(int[][] array) {
        int columnIndex = -1;
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] > 100) {
                    columnIndex = j;
                }
            }
        }
        return columnIndex;
    }
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

   }    
}


