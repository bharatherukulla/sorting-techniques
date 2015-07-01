package mysort;
import java.util.*;
import java.io.*;

public class MyMergeSort {
        int length;
        String k,rollno1,percentage1,salary1,experience1;
        String name[]=new String[100];
        int rollno[]=new int[100];
        int tempint[]=new int[100];
        float tempfloat[]=new float[100];
        String tempstring[]=new String[100];
        int experience[]=new int[100];
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        float percentage[]=new float[100];
        float salary[]=new float[100];
        StringTokenizer st;

     public void mergesrt(int y,int z) throws IOException {
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
                merge(name,rollno,percentage,i,y);
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
                merge(name,experience,salary,i,y);
                //z=Integer.parseInt(br1.readLine());
            //}
        }
    }
     public void merge(String[] s,int[] rollno,float[] percentage,int n,int z) {
         length = rollno.length;
        if(z==1)
            doMergeSort1(s,rollno,percentage,0, length - 1);
        else if(z==2)
            doMergeSort2(s,rollno,percentage,0, length - 1);
        else if(z==3)
            doMergeSort3(s,rollno,percentage,0, length - 1);
        display(s,rollno,percentage,length,z);
}
       
 
    private void doMergeSort1(String[] s,int[] rollno,float[] percentage,int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort1(s,rollno,percentage,lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort1(s,rollno,percentage,middle + 1, higherIndex);
            // Now merge both sides
            mergeParts1(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts2(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempint[i] = rollno[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempint[i] <= tempint[j]) {
                rollno[k] = tempint[i];
                i++;
            } else {
                rollno[k] = tempint[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            rollno[k] = tempint[i];
            k++;
            i++;
        }
 
    }
    

 
    
     
  
 
    private void doMergeSort2(String[] s,int[] rollno,float[] percentage,int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort2(s,rollno,percentage,lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort2(s,rollno,percentage,middle + 1, higherIndex);
            // Now merge both sides
            mergeParts2(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts3(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempfloat[i] = percentage[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempfloat[i] <= tempfloat[j]) {
                percentage[k] = tempfloat[i];
                i++;
            } else {
                percentage[k] = tempfloat[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            percentage[k] = tempfloat[i];
            k++;
            i++;
        }
 
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
    
 
    private void doMergeSort3(String[] s,int[] rollno,float[] percentage,int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort3(s,rollno,percentage,lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort3(s,rollno,percentage,middle + 1, higherIndex);
            // Now merge both sides
            mergeParts3(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts1(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempstring[i] = name[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempstring[i].compareTo(tempstring[j])<= 0) {
                name[k] = tempstring[i];
                i++;
            } else {
                name[k] = tempstring[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            name[k] = tempstring[i];
            k++;
            i++;
        }
 
    }
}