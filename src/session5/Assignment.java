package session5;

class Assignment {
    public static void main(String[] args) {
        //Strings
        //String Initialization
        String s1 = "Dare to be Free";
        String s2 = "Dare to be Free";

        String s3 = new String("Dare to be Free");
        String s4 = new String("Dare to be Free");

        //Method Exploration

        System.out.println("s1 == s2 = "+ (s1 == s2));
        System.out.println("s2 == s3 = "+ (s2 == s3));
        System.out.println("s3 == s4 = "+ (s3 == s4));

        System.out.println("s1.equals(s2) = "+s1.equals(s2));
        System.out.println("s2.equals(s3) = "+ s2.equals(s3));
        System.out.println("s3.equals(s4) = "+ s3.equals(s4));


        System.out.println();

        System.out.println("s1.compareTo(s2) = "+s1.compareTo(s2));
        System.out.println("s2.compareTo(s3) = "+ s2.compareTo(s3));
        System.out.println("s3.compareTo(s4) = "+ s3.compareTo(s4));

        //for loop in strings

        System.out.println("Using for loop");

        for (int i=0;i<s3.length();i++){
            System.out.print(s3.charAt(i)+" ");
        }

        System.out.println();
        System.out.println("Using For Each - toCharArray ");
        for (char ch : s3.toCharArray()){
            System.out.print(ch+ " ");
        }

        System.out.println();
        System.out.println("Using For Each - split string ");
        for (String ch : s3.split("")){
            System.out.print(ch+ " ");
        }

        System.out.println("S3 = "+s3);
        s3.toLowerCase();
        System.out.println("s3(After toLowerCase !!!) --- "+ s3);
        String upperString = s3.toUpperCase();
        System.out.println("string after toUpper ---"+ upperString);

        System.out.println("Index of e = "+ s3.indexOf("e"));
        System.out.println("Last Index of e = "+s3.lastIndexOf("e"));
        System.out.println("index of 'be' = "+ s3.indexOf("be"));
        System.out.println("Index of z (not present) = "+ s3.indexOf("z"));

        System.out.println();

        String subString1 = s3.substring(8);
        System.out.println("Substring from idx 8 = "+subString1);

        String subString2 = s3.substring(5,10);
        System.out.println("Substring from 5 to 10 = "+ subString2);

        System.out.println("s3 containg b = "+ s3.contains("b"));

        String[] strArr = s3.split(" ");
        for (String str : strArr){
            System.out.println(str);
        }
    }
}

class ques2{

    static void printMP3(String[] arr){
        for (String file: arr){
            if (file.endsWith(".mp3")){
                System.out.println(file);
            }
        }
    }

    static void printtype(String[] arr,String type){
        for (String file: arr){
            if (file.endsWith(type)){
                System.out.println(file);
            }
        }
    }

    public static void main(String[] args) {
        String[] files = {"hello.doc","my.java","spaceship.mp3","hello2.doc","my2.java","brown munde.mp3","hello3.doc","my3.java","Desires.mp3"};

        printMP3(files);
        System.out.println();
        printtype(files,".doc");

    }

}
