package mysort;
import java.util.*;
import java.io.*;
public class selectionsort {
        public void selectionsrt(int y,int z) throws IOException {
        int i=0;
        String k,rollno1,percentage1,salary1,experience1;
        String name[]=new String[100];
        int rollno[]=new int[100];
        int experience[]=new int[100];
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        float percentage[]=new float[100];
        float salary[]=new float[100];
        StringTokenizer st;
//        System.out.println("enter the record --> 1.student  2.employee");
//        z=Integer.parseInt(br1.readLine());
        if(z==1)
        {
            try
            {
                BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\Bharath\\Desktop\\New folder\\student.txt")));
                while((k=br.readLine()) != null)
                {
                  //  System.out.println(k);
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
                selection(name,rollno,percentage,i,y);
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
           // while(y!=0)
            //{
                selection(name,experience,salary,i,y);
                //z=Integer.parseInt(br1.readLine());
            //}
        }
    }
 public static void selection(String[] s,int[] rollno,float[] percentage,int n,int z){
        int i,j;
        int tmpint;
        String t1,tmp;
        int t2;
        float t3,tmpfloat;
        if(z==1)
        {
            for(i=0;i<n;i++)
            {                
                for(j=i+1;j<n;j++)
                {
                    if(s[i].compareTo(s[j])>0)
                    {
                        tmp = s[i];
                        s[i] = s[j];
                        s[j] = tmp;
                        
                        tmpint = rollno[i];
                        rollno[i] = rollno[j];
                        rollno[j] = tmpint;
                        
                        tmpfloat = percentage[i];
                        percentage[i] = percentage[j];
                        percentage[j] = tmpfloat;
   
                    }
                    
                }
                
            }
            for(i=0;i<n;i++)
                System.out.println(s[i]+" "+rollno[i]+" "+percentage[i]); 
        }
        if(z==2)
        {
            for(i=0;i<n;i++)
            {                
                for(j=i+1;j<n;j++)
                {
                    if(rollno[i]>rollno[j])
                    {
                        tmp = s[i];
                        s[i] = s[j];
                        s[j] = tmp;
                        
                        tmpint = rollno[i];
                        rollno[i] = rollno[j];
                        rollno[j] = tmpint;
                        
                        tmpfloat = percentage[i];
                        percentage[i] = percentage[j];
                        percentage[j] = tmpfloat;
   
                    }
                    
                }
                
            }
            for(i=0;i<n;i++)
                System.out.println(rollno[i]+" "+s[i]+" "+percentage[i]); 
        }
        if(z==3)
        {
            for(i=0;i<n;i++)
            {                
                for(j=i+1;j<n;j++)
                {
                    if(percentage[i]>percentage[j])
                    {
                        tmp = s[i];
                        s[i] = s[j];
                        s[j] = tmp;
                        
                        tmpint = rollno[i];
                        rollno[i] = rollno[j];
                        rollno[j] = tmpint;
                        
                        tmpfloat = percentage[i];
                        percentage[i] = percentage[j];
                        percentage[j] = tmpfloat;
   
                    }
                    
                }
                
            }
            for(i=0;i<n;i++)
                System.out.println(percentage[i]+" "+s[i]+" "+rollno[i]); 
        }
   }
}