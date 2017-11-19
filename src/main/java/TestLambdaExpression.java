/**
 * Created by Behrooz on 16/10/2017.
 */
public class TestLambdaExpression {

    public static void main(String[] args) {
        TestLambdaExpression testLambdaExpression = new TestLambdaExpression();

        //With type dectaeration
        MathOperator add = (int a, int b) -> a + b;

        //Without type declleration
        MathOperator sub = (a, b) -> a - b;

        //With return statement
        MathOperator div = (int a, int b) -> {
            return a / b;
        };

        //Without return statement and without {}
        MathOperator mult = (int a, int b) -> a * b;

        System.out.println("Adding 3 & 6 is :" + testLambdaExpression.operate(3,6,add));
        System.out.println("Subtraction 7 from 45 is: " + testLambdaExpression.operate(45,7,sub));
        System.out.println("Deviding 67 by 6 is: " + testLambdaExpression.operate(67,6,div));
        System.out.println("Multiplying 45 by 78 is: " + testLambdaExpression.operate(45,78,mult));
    }

    private int operate(int i, int j, MathOperator mathOperator) {
        return mathOperator.operate(i,j);
    }

    public interface MathOperator{
        int operate(int a,int b);
    }
}
