package java8.LambdaFunction;

import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArraySet;

@FunctionalInterface
interface LambdaExample {
    public void isUsedLambda(Integer age, String b);
}

@FunctionalInterface
interface LambdaFunctionExample {
    public Boolean isBoolean(Boolean b, Boolean b2);
}

public class LambdaFunctionDemo implements LambdaExample, LambdaFunctionExample {
    public void isUsedLambda(Integer a, String b) {
        System.out.println(a + b);
    }

    public Boolean isBoolean(Boolean b, Boolean b2) {
        System.out.println(b);
        return b;
    }

    public static void main(String[] arg) {
        LambdaFunctionDemo lambdaFunction = new LambdaFunctionDemo();
        lambdaFunction.isUsedLambda(20, " This is the java programming ");
        LambdaExample anonymousFunction = new LambdaExample() {
            public void isUsedLambda(Integer a, String b) {
                System.out.println("java is programming language " + a + " " + b);
            }
        };
        anonymousFunction.isUsedLambda(20, "500");

        LambdaExample lambdaFunction2 = (Integer a, String b) -> {
            System.out.println(a + b);
        };
        lambdaFunction2.isUsedLambda(20, " Java is programming language ");
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.add(20);
        copyOnWriteArraySet.add(20);

    }
}