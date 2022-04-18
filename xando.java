import java.io.*;
import java.util.*;
class x_and_o 
{
    static String xo[][]=new String[3][3];
    static int x1,x2,o1,o2;
    static  int a=1;
    static String check()
    {
        String res="";
        for(int a=0;a<8;a++)
        {
            String c="";
            switch(a)
            {
                case 0:
                    c= xo[0][0]+xo[0][1]+xo[0][2];
                    break;
                case 1:
                    c= xo[1][0]+xo[1][1]+xo[1][2];
                    break;
                case 2:
                    c= xo[2][0]+xo[2][1]+xo[2][2];
                    break;
                case 3:
                    c= xo[0][0]+xo[1][0]+xo[2][0];
                    break;
                case 4:
                    c= xo[0][1]+xo[1][1]+xo[2][1];
                    break;
                case 5:
                    c= xo[0][2]+xo[1][2]+xo[2][2];
                    break;
                case 6:
                    c= xo[0][0]+xo[1][1]+xo[2][2];
                    break;
                case 7:
                    c= xo[0][2]+xo[1][1]+xo[2][0];
                    break;
            }
            if(c.equals("| X || X || X |"))
            {
                System.out.println("Winner is X");
                System.exit(0);
            }
            else if(c.equals("| O || O || O |"))
            {
                System.out.println("Winner is O");
                System.exit(0);
            }
        }
        return null;
    }
    static void print()
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(xo[i][j]);
            }
            System.out.println();
        }
    }
    public static void limit()
    {
        if((o1>2 && o1<0))
        {
            System.out.println("Wrong number");
            o();
        }
    }
    public static void x()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Player X Enter the row 1,2,3");
        x1=kb.nextInt();x1=x1-1;
        if(x1!=0 && x2!=1 && x1>2)
        {
            System.out.println("Out of Boundary");
            System.exit(0);
        }
        System.out.println("X Enter the column 1,2,3");
        x2=kb.nextInt();x2=x2-1;
        if(x2!=0 && x2!=1 && x2!=2)
        {
            System.out.println("Out of Boundary");
            System.exit(0);
        }
        if(xo[x1][x2]!="| X |"&& xo[x1][x2]!="| O |")
        {
            xo[x1][x2]="| X |";
            print();
            check();
        }
        else
        {
            System.out.println("Not an empty space");
            x();
        }
    }
    public static void o()
    {
        Scanner kb=new Scanner(System.in);
        o1=0;o2=0;
        System.out.println("O Enter the row 1,2,3");
        o1=kb.nextInt();o1=o1-1;
        if(o1!=0 && o1!=1 && o1!=2)
        {
            System.out.println("Out of Boundary");
            System.exit(0);
        }
        System.out.println("O Enter the column 1,2,3");
        o2=kb.nextInt();o2=o2-1;
        if(o2!=0 && o2!=1 && o2!=2)
        {
            System.out.println("Out of Boundary");
            System.exit(0);
        }
        if(xo[o1][o2]!="| X |"&& xo[o1][o2]!="| O |")
        {
            xo[o1][o2]="| O |";
            print();
            check();
        }
        else
        {
            System.out.println("Not an empty space");
            o();
        }
    }
    public static void main(String args[])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                    xo[i][j]="|   |";
            }
        }
        do
        {
            if((a%2)==1)
            {
                x();
            }
            else
            {
                o();
            }
            a++;
        }while(a<10);
        if(a==10)
        {
            System.out.println("It's a Draw!!!");
        }
    }
}