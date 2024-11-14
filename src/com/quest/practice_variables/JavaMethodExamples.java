package com.quest.practice_variables;

public class JavaMethodExamples {
    private static  final int X = 30;
    public static void main(String[] args) {
        JavaMethodExamples javaMethodExamples = new JavaMethodExamples();
        javaMethodExamples.display("hello");
        int result = javaMethodExamples.add(4, 5);
        System.out.println(result);

    }

    private void display(String str) {
        System.out.println(str);
    }

    /**
     * @param a = n1
     * @param b = n2
     * @return sum
     */
    private int add(int a, int b) {

        return a + b;
    }
}
