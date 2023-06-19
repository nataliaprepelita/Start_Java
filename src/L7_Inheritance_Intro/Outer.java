package L7_Inheritance;

public class Outer {
    int [] numbers;
    Outer(int [] numbers){
        this.numbers = numbers;
    }

    void analyze(){
        Inner inOb = new Inner();
        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Average: " + inOb.avg());

    }

    private class Inner{
        int min (){
            int min = numbers[0];
            for (int i = 1; i <numbers.length; i++)
                if (numbers[i] < min ) min = numbers[i];
            return min;
        }

        int max (){
            int max = numbers[0];
            for (int i = 1; i <numbers.length; i++)
                if (numbers[i] > max ) max = numbers[i];
            return max;
        }

        int avg (){
            int avg = 0;
            for (int i = 1; i < numbers.length; i++)
                avg += numbers[i];
            return avg/numbers.length;
        }
    }
}
