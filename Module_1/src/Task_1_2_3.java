/* Task 3: Obsolete measures

Leiviskä, naula, and luoti are medieval Finnish units of measurement.

- 1 leiviskä = 20 naula
- 1 naula = 32 luoti
- 1 luoti = 13.28 grams

We need to write a program that asks the user for a weight in grams,
and converts it into medieval units: leiviskä, naula, and luoti.

Example:
Weight (g): 30000
30000 grams is 3 leiviskä, 10 naula, and 19.04 luoti.
(Note: leiviskä and naula are shown as whole numbers, luoti is shown with two decimals.)

---

Step 1: Convert everything to grams so we can do the math.
- Since 1 luoti = 13.28 grams
- And 1 naula = 32 luoti
  → 1 naula = 13.28 * 32 = 424.96 grams

- 1 leiviskä = 20 naula
  → 1 leiviskä = 424.96 * 20 = 8499.2 grams

---

Step 2: To convert grams into medieval units:
- First, divide the total weight by 8499.2 to get the number of leiviskä (as an integer)
- Then use the remainder to find how many full naula fit in the leftover grams
- Finally, use the remaining grams to calculate luoti (with decimals)

*/


import java.util.Scanner;

public class Task_1_2_3 {

    public static void main(String[] args) {
        // ثابتات التحويل
        final double LUOTI_GRAMS = 13.28;
        final double NAULA_GRAMS = 32 * LUOTI_GRAMS;       // 424.96
        final double LEIVISKA_GRAMS = 20 * NAULA_GRAMS;    // 8499.2

        // قراءة الوزن من المستخدم
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight (g): ");
        double grams = scanner.nextDouble();

        // نحدد عدد الليفيسكات الكاملة بالوزن
        int leiviskaCount = (int)(grams / LEIVISKA_GRAMS);

        // نحسب الباقي بعد طرح وزن الليفيسكات
        double remainderAfterLeiviska = grams - leiviskaCount * LEIVISKA_GRAMS;

        // نحدد عدد النولات من الباقي
        int naulaCount = (int)(remainderAfterLeiviska / NAULA_GRAMS);

        // نحسب الباقي بعد طرح وزن النولات
        double remainderAfterNaula = remainderAfterLeiviska - naulaCount * NAULA_GRAMS;

        // نحسب اللوتي بالباقي، نطبعها بـ 2 رقم عشري
        double luotiCount = remainderAfterNaula / LUOTI_GRAMS;

        // نطبع النتيجة
        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviskaCount, naulaCount, luotiCount);
    }
}
