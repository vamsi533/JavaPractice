    import java.util.Scanner;

    public class Largest

    {

        public static void main(String[] args) 

        {

            int size, max;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter number of elements in the array:");

            size = s.nextInt();

            int a[] = new int[size];

            System.out.println("Enter elements of array:");

            for(int i = 0; i < size; i++)

            {

                a[i] = s.nextInt();

            }

            max = a[0];

            for(int i = 0; i < size; i++)

            {

                if(max < a[i])

                {

                    max = a[i];

                }

            }

            System.out.println("Largest number in array is:"+max);

        }

    }
