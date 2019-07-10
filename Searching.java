    import java.util.Scanner;

    public class Searching

    {

        public static void main(String[] args) 

        {

            int size, search, flag = 0, i = 0;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter no. of elements you want in array:");

            size = s.nextInt();

            int a[] = new int[size];

            System.out.println("Enter all the elements:");

            for(i = 0; i < size; i++)

            {

                a[i] = s.nextInt();

            }

            System.out.print("Enter the element you want to search:");

            search = s.nextInt();

            for(i = 0; i < size; i++)

            {

                if(a[i] == search)

                {

                    flag = 1;

                    break;

                }

                else

                {

                    flag = 0;

                }

            }

            if(flag == 1)

            {

                System.out.println("Element found at position:"+(i + 1));

            }

            else

            {

                System.out.println("Element not found");

            }

        }

    }
