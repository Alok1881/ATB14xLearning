package Java05_October;
/*find the second maximum number in this array
int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32}*/
public class Second_Max_Number {
    public static void main(String[] args)
    {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int max=numbers[0];
        int second_max=0;
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max)
            {
                second_max=max;
                max=numbers[i];

            }
        }
        System.out.println("Second max number is: "+second_max);
    }
}
