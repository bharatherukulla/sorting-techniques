import java.util.*;

public class Proj
{
    static class student            
    {
        public int rollno;
        public String name;
        public double percentage;
        student()
        {
            rollno=0;
            name=null;
            percentage=0;
        }
    }
    public static student[] s=new student[8];   //we create an array of student objects as our records.
    
    static class sort<T>            		//Template sort class
    {
        
        int cap;
        T[] arr;
        static int[] link;
    sort()                      		//To sort Strings Exclusively.  (Using compareTo() operation)  
    {
        student temp;
        for(int i=1;i<s.length;i++)
                for(int j=i+1;j<s.length;j++)
                {
                        if(s[i].name.compareTo(s[j].name)>0)
                        {
                                temp=s[i];
                                s[i]=s[j];
                                s[j]=temp;
                        }
                }
    }
    
    sort(T[] arr)           			//To sort Integers/Floats/Double/Long etc. ((Using Merge Sort)  //Note:Constructor Overloading here.   
    {
        cap=arr.length;
        link=new int[cap+1];
        for(int i=0;i<=cap;i++)
        {
                link[i]=0;
        }
        this.arr=arr;
        rsort(1,7);
        display();
        //a[0]=0;
    }
    
    int rsort(int left,int right)       	//Support function for Merge sort
    {
        if(left>=right)
        {
                return left;
        }
        else
        {
                int mid=(left+right)/2;
                return(lm(rsort(left,mid),rsort(mid+1,right)));
        }
    }
    
    int lm(int str1,int str2)           	//Support function for Merge sort
    {	
        int i1,i2,iresult=0;
        for(i1=str1,i2=str2;(i1!=0)&&(i2!=0);)
        {
                if(arr[i1].toString().compareTo(arr[i2].toString())<0)
                {
                        link[iresult]=i1;
                        iresult=i1;
                        i1=link[i1];
                }
                else
                {
                        link[iresult]=i2;
                        iresult=i2;
                        i2=link[i2];
                }
        }
        if(i1==0)
        {

                link[iresult]=i2;
        }
        else
        {
                link[iresult]=i1;
        }
        return link[0];
    }
    
    void display()                      	//Support function for Merge sort
    {
        student temp;
        int pos=link[0];
        System.out.println("Rollno\t        "+" "+"Name\t     "+" "+"Percentage\n");
        for(int i=1;i<8;i++)
        {
            System.out.println(s[pos].rollno+"\t\t"+s[pos].name+"\t\t"+s[pos].percentage);
            pos=link[pos];
        }

    }
    
}  
    public static void main(String[] args) {
        int choice;
        sort obj;
        for(int i=0;i<s.length;i++)
        {
            s[i]=new student();
        }
        s[1].rollno=16;s[1].name="William";s[1].percentage=47.27;
        s[2].rollno=21;s[2].name="Adam";s[2].percentage=74.63;
        s[3].rollno=32;s[3].name="Clark";s[3].percentage=32.56;
        s[4].rollno=12;s[4].name="Turner";s[4].percentage=83.42;
        s[5].rollno=42;s[5].name="Ben";s[5].percentage=59.32;
        s[6].rollno=31;s[6].name="Smith";s[6].percentage=65.71;
        s[7].rollno=46;s[7].name="John";s[7].percentage=85.35;
        display(s);
        while(true){
        System.out.println("Sort By: 1).Rollno 2).Name 3).Percentage\t[4].To Exit");
        System.out.println("");
        Scanner input=new Scanner(System.in);
        choice=input.nextInt();
        switch(choice)
        {
            case 1:
                Integer[] a=new Integer[s.length];
                for(int i=1;i<s.length;i++)
                {
                    a[i]=s[i].rollno;
                }
                obj=new <Integer>sort(a);
                break;
            case 2:
                obj=new <String>sort();
                display(s);
                break;
            case 3:
                Double[] b=new Double[8];
                for(int i=1;i<s.length;i++)
                {
                    b[i]=s[i].percentage;
                }
                obj=new <Double>sort(b);
                break;
            case 4:
                System.exit(1);
        }
        }
        
    }
    
    static void display(student[] s)
    {
        System.out.println("Rollno\t        "+" "+"Name\t     "+" "+"Percentage\n");
        for(int i=1;i<8;i++)
        {        
            System.out.println(s[i].rollno+"\t\t"+s[i].name+"\t\t"+s[i].percentage);
        }
    }
}

