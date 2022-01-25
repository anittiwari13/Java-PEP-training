package session6;

import java.util.Scanner;

public class assignmentStringBuffer {
    public static void main(String[] args) {
        //String Buffer
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.capacity());
        sb.append("This is a String");
        System.out.println(sb);
        sb.append(" Let's run this Code");
        System.out.println(sb);

        sb.reverse();        //mutable
        System.out.println("Revered stringBuffer----- "+sb);

        //delete method
        sb.reverse();
        sb.delete(27,31);
        System.out.println(sb);

        StringBuffer str = new StringBuffer("Program");
        str.replace(1,4,"Master");
        System.out.println(str);

        StringBuffer str1 = new StringBuffer("Program");
        System.out.println(str1);
        str1.insert(7," this problem");
        System.out.println("Inserted 'this problem at idx 7 : "+str1);

        System.out.println("Capacity before ensureCapacity : "+sb.capacity());

        sb.ensureCapacity(38);
        System.out.println("Capacity after ensureCapacity : "+sb.capacity());
    }
}


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();
        //let x be hrs in weekdays
        //x+10 = weekend hrs
        //sal = x*80 + 50*x+500
        int weekday = (sal-500)/130;
        System.out.println(weekday+10);
        System.out.println(weekday);
    }
}




