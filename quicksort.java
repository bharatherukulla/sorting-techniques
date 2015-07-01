package mysort;
import java.util.*;
import java.io.*;

public class Quicksort1{
        int length;
        String k,rollno1,percentage1,salary1,experience1;
        String name[]=new String[100];
        int rollno[]=new int[100];
        int experience[]=new int[100];
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        float percentage[]=new float[100];
        float salary[]=new float[100];
        StringTokenizer st;

    public void quicksrt(int y,int z) throws IOException {
        int i=0;
        if(z==1)
        {
            try
            {
                BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\Bharath\\Desktop\\New folder\\student.txt")));
                while((k=br.readLine()) != null)
                {
                    //System.out.println(k);
                    st=new StringTokenizer(k," ");
                    name[i]=st.nextToken();
                    rollno1=st.nextToken();
                    percentage1=st.nextToken();
                    rollno[i]=Integer.parseInt(rollno1);
                    percentage[i]=Float.parseFloat(percentage1);
                    i++;
                }
            }
            catch(IOException e)
            {}
//            System.out.println("Enter the type on which the records are to be sorted:");
//            System.out.println("0.exit 1.name  2.rollno  3.percentage");
//            z=Integer.parseInt(br1.readLine());
           // while(y!=0)
            //{
                quick(name,rollno,percentage,i,y);
//                z=Integer.parseInt(br1.readLine());
            //}
        }
        else if(z==2)
        {
            try
            {
                    BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\Bharath\\Desktop\\New folder\\employee.txt")));
                while((k=br.readLine()) != null)
                {
                  //  System.out.println(k);
                    st=new StringTokenizer(k," ");
                    name[i]=st.nextToken();
                    experience1=st.nextToken();
                    salary1=st.nextToken();
                    experience[i]=Integer.parseInt(experience1);
                    salary[i]=Float.parseFloat(salary1);
                    i++;   
                }
            }
            catch(IOException e)
            {}
           // System.out.println("0.exit 1.name  2.experience  3.salary");
            //z=Integer.parseInt(br1.readLine());
            //while(y!=0)
            //{
                quick(name,experience,salary,i,y);
                //z=Integer.parseInt(br1.readLine());
            //}
        }
    }
              
    public void quick(String[] s,int[] rollno,float[] percentage,int n,int z) {
         length = rollno.length;
        if(z==1)
            quickSort1(s,rollno,percentage,0, length - 1);
        else if(z==2)
            quickSort2(s,rollno,percentage,0, length - 1);
        else if(z==3)
            quickSort3(s,rollno,percentage,0, length - 1);
        display(s,rollno,percentage,length,z);
}
 
    private void quickSort2(String[] s,int[] rollno,float[] percentage,int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = rollno[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            
             
            while (rollno[i] < pivot) {
                i++;
            }
            while (rollno[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(s,rollno,percentage,i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort2(s,rollno,percentage,lowerIndex, j);
        if (i < higherIndex)
            quickSort2(s,rollno,percentage,i, higherIndex);
    }
 
    private void exchangeNumbers(String[] s,int[] rollno,float[] percentage,int i, int j) {
        int temp = rollno[i];
        rollno[i] = rollno[j];
        rollno[j] = temp;
        float temp1=percentage[i];
        percentage[i]=percentage[j];
        percentage[j]=temp1;
        String temp2=s[i];
        s[i]=s[j];
        s[j]=temp2;
    }

    public void display(String[] s,int[] rollno,float[] percentage,int n,int z)
    {
        int i;
        if(z==1)
        {
            for(i=0;i<n;i++)
            {                
                System.out.println(s[i]+" "+rollno[i]+" "+percentage[i]);
            }   
        }
        
        else if(z==2)
        {
            for(i=0;i<n;i++)
            {                
                System.out.println(rollno[i]+" "+s[i]+" "+percentage[i]);
            }   
        }
        
        if(z==3)
        {
            for(i=0;i<n;i++)
            {                
                System.out.println(percentage[i]+" "+s[i]+" "+rollno[i]);
            }   
        }
    }
    public void quickSort3(String[] s,int[] rollno,float[] percentage,int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        float pivot = percentage[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            
            while (percentage[i] < pivot) {
                i++;
            }
            while (percentage[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(s,rollno,percentage,i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort3(s,rollno,percentage,lowerIndex, j);
        if (i < higherIndex)
            quickSort3(s,rollno,percentage,i, higherIndex);
    }
 
    private void quickSort1(String[] s,int[] rollno,float[] percentage,int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        String pivot = s[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
           
            while (s[i].compareTo(pivot)<0) {
                i++;
            }
            while (s[j].compareTo(pivot)>=0) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(s,rollno,percentage,i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort1(s,rollno,percentage,lowerIndex, j);
        if (i < higherIndex)
            quickSort1(s,rollno,percentage,i, higherIndex);
    }
}