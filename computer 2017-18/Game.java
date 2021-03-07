
/**
 * Write a description of class UNSCRAMBLE_WORD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
public class Game
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);// TO ACCEPT ALL THE VALUES FROM USER
        BufferedReader in = new BufferedReader(read);
        double r=0.00,r1=0.000;   
        String n,n1,n2="YES",n3="BEAR",n4="BARE",n5="HEAR",n6="HARE",n7="HINT",n8="WORD",n9="LETTER",n10="MICE",n11="JOKE",n12="PASS",n13="ALONE";
        String n14="BORON",n15="MAGIC",n16="LOGIC",n17="CARBON",n18="MEMORY",n19="NEPTUNE",n20="MERCURY",n21="GERMANY",n22="SUPREME",n23="COMPUTER";
        String n24="COMPILER",n25="AERONOMY",n26="ARGENTUM",n27="APOCALYPSE",n28="ANTARCTICA",n29="BRAE",n30="EMIC",n31="CORBAN",n32="PRESUME";
        String n33="ARGUMENT";
        int t=0,y=10,z;
        System.out.println("");
        System.out.println("Welcome to the 'UNSCRAMBLE THE WORD' Game");
        System.out.println("");
        for(z=1;z<=999999999;z++);
        System.out.println("In This Game there are 10 LEVELS.");
        System.out.println("");
        for(z=1;z<=999999995;z++);
        System.out.println("YOU WOULD GET JUMBLED WORDS AND YOU HAVE TO GIVE THE CORRECT WORD BY CORRECTING THE WORD AND UNSCRAMBLING IT");
        System.out.println("YOU HAVE TO USE ALL THE LETTERS ONLY ONCE TO FORM THE WORD");
        System.out.println("");
        System.out.println("e.g. \t The Letters Given to You are:  A A V J");
        System.out.println("");
        System.out.println("YOU have to REARRANGE THESE LETTERS AND FORM A MEANINGFUL WORD");
        System.out.println("");
        System.out.println("So you have to enter your answer as the 'UNSCRAMBLED FORM OF THE GIVEN WORD', for e.g. here the answer is 'JAVA'");
        System.out.println("");
        System.out.println("As The LEVEL WOULD INCREASE, THE DIFFICULTY WOULD INCREASE.");
        System.out.println("Even If You Play It for 2nd TIME,YOU MAY HAVE DIFFERENT WORDS");
        System.out.println("");
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        System.out.println("");
        System.out.println("You Have 10 LIVES...");
        System.out.println("");
        System.out.println("THIS WOULD BE HELPFUL WHEN YOU WOULD GET STUCK , YOU CAN USE THE LIFELINE at the cost of those 10 LIVES!");
        System.out.println("");
        System.out.println("IF YOU GET STUCK AT SOME POINT, You can use either the 'HINT', or 'LETTER', or 'WORD' as YOUR LIFELINES: ");
        System.out.println("");
        System.out.println("THE 'HINT' ABOUT THE WORD, MEANS YOU WOULD BE GIVEN SOME INFORMATION THAT DESCRIBES THE WORD, BUT YOU WOULD HAVE TO LOSE 2 LIVES");
        System.out.println("");
        System.out.println("THE 'LETTER' OF THE WORD,MEANS THAT YOU WOULD GET THE CORRECT LETTER AT CORRECT PLACE,BUT YOU WOULD HAVE TO LOSE 3 LIVES");
        System.out.println("");
        System.out.println("THE 'WORD',MEANS THAT YOU WOULD GET THE ENTIRE WORD, BUT YOU WOULD HAVE TO LOSE 5 LIVES ");
        System.out.println("");
        System.out.println("");
        System.out.println("IF YOU GET THE CORRECT ANSWER, YOU WOULD GET 50 POINTS");
        System.out.println("IF YOU USE 'HINT' AND YOU GET THE CORRECT ANSWER, YOU WOULD GET 40 POINTS");
        System.out.println("IF YOU USE 'LETTER' AND YOU GET THE CORRECT ANSWER, YOU WOULD GET 25 POINTS");
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        System.out.print("MIND THIS WELL, THIS Game is NOT AS SIMPLE AS YOU ARE THINKING...");
        for(z=1;z<=999999999;z++);
        for(z=1;z<=999999999;z++);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("LETS START THE Game");
        for(int i=1;i<=10;i++)
        {
            System.out.println("WORD "+i);
            r=Math.random();
            if(i==1)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: A E B R");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();//TO ACCEPT THE ANSWER OR THE LIFELINE FROM USER
                    n=n.toUpperCase();
                    if(n.equals(n3)||n.equals(n4)||n.equals(n29))//IF THE USER GETS CORRECT ANSWER
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS ARE: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO)(TRY ENTERING 'YES'): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');//TO CLEAR THE SCREEN
                    }
                    else if(n.equals(n7))// IF THE USER USES THE LIFELINE 'HINT'
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;// TO DIRECTLY GO TO THE NEXT LOOP IF THE LIVES ARE 0
                        }
                        System.out.println("The Word means 'support' or 'to carry the weight of'");
                        System.out.println("There is another option which is 'basic and simple'");
                        System.out.println("There is another option which means 'a steep bank or hillside'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE CORRECT WORD OR ENTER 'PASS' IF YOU ARE UNABLE TO GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n3)||n.equals(n4)||n.equals(n29))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER CAN BE BEAR,BARE OR BRAE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER CAN BE BEAR,BARE OR BRAE");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO)(TRY ENTERING 'YES'): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))// IF THE USER USES THE LIFELINE 'WORD'
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD CAN BE BARE, BEAR OR BRAE");
                        y=y-5;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO)(TRY ENTERING 'YES'): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))//IF THE USER USES THE LIFELINE 'LETTER'
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.25)
                        System.out.println("LETTER 'B' IS PRESENT AT 1st POSITION");
                        else if(r1>0.25 && r1<=0.50)
                        System.out.println("LETTER 'E' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.50 && r1<=0.75)
                        System.out.println("LETTER 'A' IS PRESENT AT 3rd POSITION");
                        else
                        System.out.println("LETTER 'R' IS PRESENT AT 4th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n3)||n.equals(n4)||n.equals(n29))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER CAN BE BARE,BEAR OR BRAE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER CAN BE BARE,BEAR OR BRAE");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO)(TRY ENTERING 'YES'): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD. THE CORRECT ANSWER IS BARE, BEAR OR BRAE");// IF THE USER ENTERS WRONG ANSWER;
                }
                else
                    { 
                    System.out.println("The letters are: R E H A");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n5)||n.equals(n6))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO)(TRY ENTERING 'YES'): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word means 'a fast-running, long-eared mammal that resembles a large rabbit'");
                        System.out.println("There is another option which is 'perceive with the ear the sound made by'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU ARE UNABLE TO GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n5)||n.equals(n6))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS HARE OR HEAR");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS HARE OR HEAR");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO)(TRY ENTERING 'YES'): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD CAN BE HARE OR HEAR");
                        y=y-5;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO)(TRY ENTERING 'YES'): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.25)
                        System.out.println("LETTER 'H' IS PRESENT AT 1st POSITION");
                        else if(r1>0.25 && r1<=0.50)
                        System.out.println("LETTER 'A' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.50 && r1<=0.75)
                        System.out.println("LETTER 'R' IS PRESENT AT 3rd POSITION");
                        else
                        System.out.println("LETTER 'E' IS PRESENT AT 4th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n6)||n.equals(n5))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS HARE OR HEAR");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS HARE OR HEAR");
                        System.out.println("YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO)(TRY ENTERING 'YES'): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD. THE CORRECT ANSWER IS HARE OR HEAR");
                }
            }
            
            
            
            if(i==2)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: O E J K");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n11))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word means 'a thing which causes amusement or laughter");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n11))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS JOKE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS JOKE");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS JOKE");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.25)
                        System.out.println("LETTER 'J' IS PRESENT AT 1st POSITION");
                        else if(r1>0.25 && r1<=0.50)
                        System.out.println("LETTER 'O' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.50 && r1<=0.75)
                        System.out.println("LETTER 'K' IS PRESENT AT 3rd POSITION");
                        else
                        System.out.println("LETTER 'E' IS PRESENT AT 4th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n11))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS JOKE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS JOKE");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS JOKE");
                }
                else
                    { 
                    System.out.println("The letters are:  E M C I");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n10)||n.equals(n30))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word means 'plural form of mouse'");
                        System.out.print("Another option means 'studying or describing a particular language or culture in terms of its internal ");
                        System.out.println("elements and their functioning rather than in terms of any existing external scheme");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n10)||n.equals(n30))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MICE OR EMIC");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MICE OR EMIC");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS MICE OR EMIC");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.25)
                        System.out.println("LETTER 'M' IS PRESENT AT 1st POSITION");
                        else if(r1>0.25 && r1<=0.50)
                        System.out.println("LETTER 'I' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.50 && r1<=0.75)
                        System.out.println("LETTER 'C' IS PRESENT AT 3rd POSITION");
                        else
                        System.out.println("LETTER 'E' IS PRESENT AT 4th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n10))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS MICE OR EMIC");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MICE OR EMIC");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD. THE CORRECT ANSWER IS MICE OR EMIC");
                }
            }
            
            
            if(i==3)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: O E L N A");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n13))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word means 'having no one else present'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n13))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS ALONE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS ALONE");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS ALONE");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.20)
                        System.out.println("LETTER 'A' IS PRESENT AT 1st POSITION");
                        else if(r1>0.20 && r1<=0.40)
                        System.out.println("LETTER 'L' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.40 && r1<=0.60)
                        System.out.println("LETTER 'O' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.60 && r1<=0.80)
                        System.out.println("LETTER 'N' IS PRESENT AT 4th POSITION");
                        else
                        System.out.println("LETTER 'E' IS PRESENT AT 5th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n13))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS ALONE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS ALONE");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS ALONE");
                }
                else
                { 
                    System.out.println("The letters are: O B R N O");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n14))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'The 5th element in the periodic table'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n14))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS BORON");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS BORON");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS BORON");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.20)
                        System.out.println("LETTER 'B' IS PRESENT AT 1st POSITION");
                        else if(r1>0.20 && r1<=0.40)
                        System.out.println("LETTER 'O' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.40 && r1<=0.60)
                        System.out.println("LETTER 'R' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.60 && r1<=0.80)
                        System.out.println("LETTER 'O' IS PRESENT AT 4th POSITION");
                        else
                        System.out.println("LETTER 'N' IS PRESENT AT 5th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n14))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS BORON");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS BORON");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS BORON.");
                }
            }
            
            
            if(i==4)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: A C G M I");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n15))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is'Rhyming with logic and tragic'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n15))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS MAGIC");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS MAGIC");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS MAGIC");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.20)
                        System.out.println("LETTER 'M' IS PRESENT AT 1st POSITION");
                        else if(r1>0.20 && r1<=0.40)
                        System.out.println("LETTER 'A' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.40 && r1<=0.60)
                        System.out.println("LETTER 'G' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.60 && r1<=0.80)
                        System.out.println("LETTER 'I' IS PRESENT AT 4th POSITION");
                        else
                        System.out.println("LETTER 'C' IS PRESENT AT 5th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n13))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS MAGIC");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS MAGIC");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS MAGIC");
                }
                else
                { 
                    System.out.println("The letters are: I O L C G ");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n16))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'rhyming to magic and tragic'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n14))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS LOGIC");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS LOGIC");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS LOGIC");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.20)
                        System.out.println("LETTER 'L' IS PRESENT AT 1st POSITION");
                        else if(r1>0.20 && r1<=0.40)
                        System.out.println("LETTER 'O' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.40 && r1<=0.60)
                        System.out.println("LETTER 'G' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.60 && r1<=0.80)
                        System.out.println("LETTER 'I' IS PRESENT AT 4th POSITION");
                        else
                        System.out.println("LETTER 'C' IS PRESENT AT 5th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n14))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS LOGIC");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS LOGIC");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS LOGIC");
                }
            }
            
            
            
            if(i==5)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: O C N A B R");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n17)||n.equals(n31))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'The main component of organic compounds'");
                        System.out.println("Another option is 'a sacrifice or offering to God among the ancient Hebrews'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n17)||n.equals(n31))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS CARBON OR CORBAN");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS CARBON OR CORBAN");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS CARBON OR CORBAN");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.18)
                        System.out.println("LETTER 'C' IS PRESENT AT 1st POSITION");
                        else if(r1>0.18 && r1<=0.36)
                        System.out.println("LETTER 'A' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.32 && r1<=0.54)
                        System.out.println("LETTER 'R' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.54 && r1<=0.72)
                        System.out.println("LETTER 'B' IS PRESENT AT 4th POSITION");
                        else if(r1>0.72 && r1<=0.89)
                        System.out.println("LETTER 'O' IS PRESENT AT 5th POSITION");
                        else
                        System.out.println("LETTER 'N' IS PRESENT AT 6th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n17)||n.equals(n31))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS CARBON OR CORBAN");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS CARBON OR CORBAN");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS CARBON OR CORBAN.");
                }
                else
                { 
                    System.out.println("The letters are: Y M R M O E");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n18))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word means 'The faculty by which mind stores and remembers information'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n18))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MEMORY");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MEMORY");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS MEMORY");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.18)
                        System.out.println("LETTER 'M' IS PRESENT AT 1st POSITION");
                        else if(r1>0.18 && r1<=0.36)
                        System.out.println("LETTER 'E' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.32 && r1<=0.54)
                        System.out.println("LETTER 'M' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.54 && r1<=0.72)
                        System.out.println("LETTER 'O' IS PRESENT AT 4th POSITION");
                        else if(r1>0.72 && r1<=0.89)
                        System.out.println("LETTER 'R' IS PRESENT AT 5th POSITION");
                        else
                        System.out.println("LETTER 'Y' IS PRESENT AT 6th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n14))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS MEMORY");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MEMORY");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS MEMORY");
                }
            }
            
            
            
            if(i==6)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: E T N U P E N");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n19))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'The eigth planet in the solar system'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n19))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS NEPTUNE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS NEPTUNE");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS NEPTUNE");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.14)
                        System.out.println("LETTER 'N' IS PRESENT AT 1st POSITION");
                        else if(r1>0.14 && r1<=0.28)
                        System.out.println("LETTER 'E' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.28 && r1<=0.42)
                        System.out.println("LETTER 'P' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.56 && r1<=0.70)
                        System.out.println("LETTER 'T' IS PRESENT AT 4th POSITION");
                        else if(r1>0.70 && r1<=0.84)
                        System.out.println("LETTER 'U' IS PRESENT AT 5th POSITION");
                        else if(r1>0.84 && r1<=0.91)
                        System.out.println("LETTER 'N' IS PRESENT AT 6th POSITION");
                        else
                        System.out.println("LETTER 'E' IS PRESENT AT 7th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n19))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS NEPTUNE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS NEPTUNE");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS NEPTUNE.");
                }
                else
                { 
                    System.out.println("The letters are: R E Y M C R U");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n20))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'The first planet in the solar system'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n20))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MERCURY");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MERCURY");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS MERCURY");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.14)
                        System.out.println("LETTER 'M' IS PRESENT AT 1st POSITION");
                        else if(r1>0.14 && r1<=0.28)
                        System.out.println("LETTER 'E' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.28 && r1<=0.42)
                        System.out.println("LETTER 'R' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.56 && r1<=0.70)
                        System.out.println("LETTER 'C' IS PRESENT AT 4th POSITION");
                        else if(r1>0.70 && r1<=0.84)
                        System.out.println("LETTER 'U' IS PRESENT AT 5th POSITION");
                        else if(r1>0.84 && r1<=0.91)
                        System.out.println("LETTER 'R' IS PRESENT AT 6th POSITION");
                        else
                        System.out.println("LETTER 'Y' IS PRESENT AT 7th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n20))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS MERCURY");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS MERCURY");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS MERCURY");
                }
            }
            
            
            
            if(i==7)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: A Y G N M E R");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n21))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'The country whose capital is BERLIN'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n21))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS GERMANY");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS GERMANY");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS GERMANY");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.14)
                        System.out.println("LETTER 'G' IS PRESENT AT 1st POSITION");
                        else if(r1>0.14 && r1<=0.28)
                        System.out.println("LETTER 'E' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.28 && r1<=0.42)
                        System.out.println("LETTER 'R' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.56 && r1<=0.70)
                        System.out.println("LETTER 'M' IS PRESENT AT 4th POSITION");
                        else if(r1>0.70 && r1<=0.84)
                        System.out.println("LETTER 'A' IS PRESENT AT 5th POSITION");
                        else if(r1>0.84 && r1<=0.91)
                        System.out.println("LETTER 'N' IS PRESENT AT 6th POSITION");
                        else
                        System.out.println("LETTER 'Y' IS PRESENT AT 7th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n21))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS GERMANY");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS GERMANY");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS GERMANY");
                }
                else
                { 
                    System.out.println("The letters are: M E S R P U E");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n22)||n.equals(n32))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is '________ Court consists of Chief Justice Of India'");
                        System.out.println("Another option is 'suppose that somethingis the case on the basis of probability'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n22)||n.equals(n32))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS SUPREME OR PRESUME");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS SUPREME OR PRESUME");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS SUPREME OR PRESUME");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.14)
                        System.out.println("LETTER 'S' IS PRESENT AT 1st POSITION");
                        else if(r1>0.14 && r1<=0.28)
                        System.out.println("LETTER 'U' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.28 && r1<=0.42)
                        System.out.println("LETTER 'P' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.56 && r1<=0.70)
                        System.out.println("LETTER 'R' IS PRESENT AT 4th POSITION");
                        else if(r1>0.70 && r1<=0.84)
                        System.out.println("LETTER 'E' IS PRESENT AT 5th POSITION");
                        else if(r1>0.84 && r1<=0.91)
                        System.out.println("LETTER 'M' IS PRESENT AT 6th POSITION");
                        else
                        System.out.println("LETTER 'E' IS PRESENT AT 7th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n22))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS SUPREME OR PRESUME");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS SUPREME OR PRESUME");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS SUPREME OR PERSUME.");
                }
            }
            
            
            
            if(i==8)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: U C M O P R E T");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n23))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.print("The Word is 'A usual electronic device for storing data(ususally in binary form),according to ");
                        System.out.println("instructions given to it in a variable program'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n23))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS COMPUTER");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS COMPUTER");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS COMPUTER");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.12)
                        System.out.println("LETTER 'C' IS PRESENT AT 1st POSITION");
                        else if(r1>0.12 && r1<=0.25)
                        System.out.println("LETTER 'O' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.25 && r1<=0.37)
                        System.out.println("LETTER 'M' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.37 && r1<=0.50)
                        System.out.println("LETTER 'P' IS PRESENT AT 4th POSITION");
                        else if(r1>0.50 && r1<=0.62)
                        System.out.println("LETTER 'U' IS PRESENT AT 5th POSITION");
                        else if(r1>0.62 && r1<=0.76)
                        System.out.println("LETTER 'T' IS PRESENT AT 6th POSITION");
                        else if(r1>0.76 && r1<=0.88)
                        System.out.println("LETTER 'E' IS PRESENT AT 7th POSITION");
                        else
                        System.out.println("LETTER 'R' IS PRESENT AT 8th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n23))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS COMPUTER");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS COMPUTER");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS COMPUTER");
                }
                else
                { 
                    System.out.println("The letters are: E L C P O M R I");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n24))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'It converts the entire source code into machine code at one time'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n24))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS COMPILER");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS COMPILER");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS COMPILER");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.12)
                        System.out.println("LETTER 'C' IS PRESENT AT 1st POSITION");
                        else if(r1>0.12 && r1<=0.25)
                        System.out.println("LETTER 'O' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.25 && r1<=0.37)
                        System.out.println("LETTER 'M' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.37 && r1<=0.50)
                        System.out.println("LETTER 'P' IS PRESENT AT 4th POSITION");
                        else if(r1>0.50 && r1<=0.62)
                        System.out.println("LETTER 'I' IS PRESENT AT 5th POSITION");
                        else if(r1>0.62 && r1<=0.76)
                        System.out.println("LETTER 'L' IS PRESENT AT 6th POSITION");
                        else if(r1>0.76 && r1<=0.88)
                        System.out.println("LETTER 'E' IS PRESENT AT 7th POSITION");
                        else
                        System.out.println("LETTER 'R' IS PRESENT AT 8th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n22))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS COMPILER");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS COMPILER");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS COMPILER.");
                }
            }
            
            
            if(i==9)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: O A R N M E Y O M ");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n25))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word means 'The study of the upper atmosphere'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n25))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS AERONOMY");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS AERONOMY");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS AERONOMY");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.12)
                        System.out.println("LETTER 'A' IS PRESENT AT 1st POSITION");
                        else if(r1>0.12 && r1<=0.25)
                        System.out.println("LETTER 'E' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.25 && r1<=0.37)
                        System.out.println("LETTER 'R' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.37 && r1<=0.50)
                        System.out.println("LETTER 'O' IS PRESENT AT 4th POSITION");
                        else if(r1>0.50 && r1<=0.62)
                        System.out.println("LETTER 'N' IS PRESENT AT 5th POSITION");
                        else if(r1>0.62 && r1<=0.76)
                        System.out.println("LETTER 'O' IS PRESENT AT 6th POSITION");
                        else if(r1>0.76 && r1<=0.88)
                        System.out.println("LETTER 'M' IS PRESENT AT 7th POSITION");
                        else
                        System.out.println("LETTER 'Y' IS PRESENT AT 8th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n25))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS AERONOMY");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS AERONOMY");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS AERONOMY");
                }
                else
                { 
                    System.out.println("The letters are: U A E T M R G N");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n26)||n.equals(n33))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'It is the Latin Name for the element SILVER'");
                        System.out.println("Another option is 'an exchange of diverging or opposite views,typically an angry one'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n26)||n.equals(n33))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS ARGENTUM OR ARGUMENT");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS ARGENTUM OR ARGUMENT");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS ARGENTUM OR ARGUMENT");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.12)
                        System.out.println("LETTER 'A' IS PRESENT AT 1st POSITION");
                        else if(r1>0.12 && r1<=0.25)
                        System.out.println("LETTER 'R' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.25 && r1<=0.37)
                        System.out.println("LETTER 'G' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.37 && r1<=0.50)
                        System.out.println("LETTER 'E' IS PRESENT AT 4th POSITION");
                        else if(r1>0.50 && r1<=0.62)
                        System.out.println("LETTER 'N' IS PRESENT AT 5th POSITION");
                        else if(r1>0.62 && r1<=0.76)
                        System.out.println("LETTER 'T' IS PRESENT AT 6th POSITION");
                        else if(r1>0.76 && r1<=0.88)
                        System.out.println("LETTER 'U' IS PRESENT AT 7th POSITION");
                        else
                        System.out.println("LETTER 'M' IS PRESENT AT 8th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n26)||n.equals(n33))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS ARGENTUM OR ARGUMENT");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS ARGENTUM OR ARGUMENT");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS ARGENTUM OR ARGUMENT");
                }
            }
            
            
            if(i==10)
            {
                if(r<=0.5)
                {
                    System.out.println("The letters are: L O P C E A S P Y A");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n27))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word means 'The complete final destruction of the world'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);                        
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n27))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS APOCALYPSE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS APOCALYPSE");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');                        
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS APOCALYPSE");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.10)
                        System.out.println("LETTER 'A' IS PRESENT AT 1st POSITION");
                        else if(r1>0.10 && r1<=0.20)
                        System.out.println("LETTER 'P' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.20 && r1<=0.30)
                        System.out.println("LETTER 'O' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.30 && r1<=0.40)
                        System.out.println("LETTER 'C' IS PRESENT AT 4th POSITION");
                        else if(r1>0.40 && r1<=0.50)
                        System.out.println("LETTER 'A' IS PRESENT AT 5th POSITION");
                        else if(r1>0.50 && r1<=0.60)
                        System.out.println("LETTER 'L' IS PRESENT AT 6th POSITION");
                        else if(r1>0.60 && r1<=0.70)
                        System.out.println("LETTER 'Y' IS PRESENT AT 7th POSITION");
                        else if(r1>0.70 && r1<=0.80)
                        System.out.println("LETTER 'P' IS PRESENT AT 8th POSITION");
                        else if(r1<0.80 && r1<=0.90)
                        System.out.println("LETTER 'S' IS PRESENT AT 9th POSITION");
                        else
                        System.out.println("LETTER 'E' IS PRESENT AT 10th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n27))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS APOCALYPSE");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS APOCALYPSE");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS APOCALYPSE");
                }
                else 
                { 
                    System.out.println("The letters are: C C T T A A A N R I");
                    System.out.println("ENTER THE WORD: \t or ENTER 'HINT', 'LETTER' OR 'WORD' FOR ENTIRE WORD:");
                    n=in.readLine();
                    n=n.toUpperCase();
                    if(n.equals(n28))
                    {
                        t=t+50;
                        System.out.println("CONGRATULATIONS YOUR POINTS HAVE BECOME: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();   
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n7))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("The Word is 'The Southernmost Continent and site of south pole and is virtually inhabited'");
                        y=y-2;
                        if(y<0)
                        y=0;
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n28))
                        {
                            t=t+40;
                        }
                        else if(n.equals(n12))
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS ANTARCTICA");
                        else
                        System.out.println("TRY FOR NEXT ONE, THE CORRECT ANSWER IS ANTARCTICA");
                        System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');     
                    }
                    else if(n.equals(n8))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        System.out.println("THE WORD IS ANTARCTICA");
                        y=y-5;
                        if(y<0)
                        y=0;
                        t=t+5;
                        System.out.println("POINTS: "+t);
                        System.out.println("NUMBER OF LIVES LEFT: "+y);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else if(n.equals(n9))
                    {
                        if(y==0)
                        {
                            System.out.println("THERE ARE NO LIVES LEFT");
                            System.out.println("TRY FOR NEXT WORD");
                            continue;
                        }
                        r1=Math.random();
                        if(r1<=0.10)
                        System.out.println("LETTER 'A' IS PRESENT AT 1st POSITION");
                        else if(r1>0.10 && r1<=0.20)
                        System.out.println("LETTER 'N' IS PRESENT AT 2nd POSITION");
                        else if(r1>0.20 && r1<=0.30)
                        System.out.println("LETTER 'T' IS PRESENT AT 3rd POSITION");
                        else if(r1>0.30 && r1<=0.40)
                        System.out.println("LETTER 'A' IS PRESENT AT 4th POSITION");
                        else if(r1>0.40 && r1<=0.50)
                        System.out.println("LETTER 'R' IS PRESENT AT 5th POSITION");
                        else if(r1>0.50 && r1<=0.60)
                        System.out.println("LETTER 'C' IS PRESENT AT 6th POSITION");
                        else if(r1>0.60 && r1<=0.70)
                        System.out.println("LETTER 'T' IS PRESENT AT 7th POSITION");
                        else if(r1>0.70 && r1<=0.80)
                        System.out.println("LETTER 'I' IS PRESENT AT 8th POSITION");
                        else if(r1<0.80 && r1<=0.90)
                        System.out.println("LETTER 'C' IS PRESENT AT 9th POSITION");
                        else
                        System.out.println("LETTER 'A' IS PRESENT AT 10th POSITION");
                        y=y-3;
                        if(y<0)
                        y=0;
                        System.out.println("LIVES LEFT: "+y);
                        System.out.println("ENTER THE WORD OR ENTER 'PASS' IF YOU DONT GET IT:");
                        n=in.readLine();
                        n=n.toUpperCase();
                        if(n.equals(n28))
                        {
                            t=t+25;
                        }
                        else if(n.equals(n12))
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS ANTARCTICA");
                        else
                        System.out.println("SORRY TRY FOR NEXT ONE, THE CORRECT ANSWER IS ANTARCTICA");
                            System.out.println("POINTS: "+t);
                        System.out.println("DO YOU WANT TO CLEAR THE SCREEN(YES OR NO): ");
                        n1=in.readLine();
                        n1=n1.toUpperCase();
                        boolean b=n1.equals(n2);
                        if(b==true)
                        System.out.print('\u000c');
                    }
                    else
                    System.out.println("SORRY,TRY FOR THE NEXT WORD.THE CORRECT ANSWER IS ANTARCTICA");
                }
            }
        }
        double p=0.00;
            p=t/5;
            System.out.println("YOUR PERCENTAGE FOR SOLVING UNSCRAMBLING WORDS IS: "+p+"%");
            if(p>=90)
            System.out.println("YOU ARE THE MASTER IN UNSCRAMBLING WORDS");
            else if(p>=80 && p<90)
            System.out.println("YOU ARE EXCELLENT IN UNSCRAMBLING WORDS");
            else if(p>=60 && p<80)
            System.out.println("YOU ARE GOOD IN UNSCRAMBLING WORDS");
            else if(p>=50 && p<60)
            System.out.println("YOU CAN DO A MUCH BETTER NEXT TIME");
            else
            System.out.println("YOU CAN TRY A LITTLE MORE NEXT TIME");
            System.out.println("");
            System.out.println("THANK YOU");
   }
}

