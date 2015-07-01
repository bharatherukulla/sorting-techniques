package mysort;
import java.util.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frames extends Applet implements ActionListener
{
    
    public Frame F1,F2,F3,F4;
    public insertionsort is=new insertionsort();
    public selectionsort st=new selectionsort();
    public Quicksort1 qt=new Quicksort1();
    public MyMergeSort mt=new MyMergeSort();
    public Dimension d;
    public int y,z;
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    public Label l1,l2,l3,l4;
    public BufferedReader br1;
    String k,rollno1,percentage1,salary1,experience1;
    String name[]=new String[100];
    int rollno[]=new int[100];
    int experience[]=new int[100];
    //BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
    float percentage[]=new float[100];
    float salary[]=new float[100];

    public void init()
    {
        F1=new Frame();
        F1.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        d=new Dimension(500,500);
        F1.setSize(d);
        b1=new Button("student");
        b2=new Button("employee");
        l3=new Label("sort by:");
        l4=new Label("sort by");
        l1=new Label("select operations on");
        F1.add(l1);
        F1.add(b1);
        F1.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        F1.setVisible(true);
        F2=new Frame();
        F2.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        F2.setSize(d);
        b3=new Button("insertion sort");
        b4=new Button("selection sort");
        b5=new Button("quick sort");
        b6=new Button("merge sort");
        b7=new Button("name");
        b8=new Button("roll");
        b9=new Button("percentage");
        b10=new Button("name");
        b11=new Button("dob");
        b12=new Button("salary");
        F3=new Frame();
        F3.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        F3.setSize(d);
        F3.add(l3);
        F3.add(b7);
        F3.add(b8);
        F3.add(b9);
        F3.setVisible(false);
        l2=new Label("select the sorting technique");
        F4=new Frame();
        F4.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        F4.setSize(d);
        F3.setVisible(false);
        F4.setVisible(false);
        F4.add(l4);
        F4.add(b10);
        F4.add(b11);
        F4.add(b12);
        F2.add(b3);
        F2.add(b4);
        F2.add(b5);
        F2.add(b6);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        F2.setVisible(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        int i=0;
        String str1=e.getActionCommand();
        if(str1.equals("student")) 
        {
            i=0;
            F1.setVisible(false);
            F3.setVisible(true);
            y=1;
        }
         else if(str1.equals("employee"))
        {
            F1.setVisible(false);
            F4.setVisible(true);
            y=2;
        }
        else if(str1.equals("name"))
        {
            z=1;
            F3.setVisible(false);
            F4.setVisible(false);
            F2.setVisible(true);
                
        }
        else if(str1.equals("roll"))
        {
            z=2;
            F3.setVisible(false);
            F2.setVisible(true);
        }
        else if(str1.equals("percentage"))
        {
            z=3;
            F3.setVisible(false);
            F2.setVisible(true);
        }
        
        else if(str1.equals("dob"))
        {
            z=2;
            F4.setVisible(false);
            F2.setVisible(true);
        }
        else if(str1.equals("salary"))
        {
            F4.setVisible(false);
            F2.setVisible(true);
            z=3;
        }
        else if(str1.equals("insertion sort"))
        {
            try {
                is.insertionsrt(z,y);
            } catch (IOException ex) {
                Logger.getLogger(frames.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(str1.equals("selection sort"))
        {
            try {
                st.selectionsrt(z,y);
            } catch (IOException ex) {
                Logger.getLogger(frames.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else if(str1.equals("quick sort"))
        {
            try { 
                qt.quicksrt(z,y);
            } catch (IOException ex) {
                Logger.getLogger(frames.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(str1.equals("merge sort"))
        {
            try {
                mt.mergesrt(y,z);
            } catch (IOException ex) {
                Logger.getLogger(frames.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
