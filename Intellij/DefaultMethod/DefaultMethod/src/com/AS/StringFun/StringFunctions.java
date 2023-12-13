package com.AS.StringFun;

public class StringFunctions {
    public static void main(String[] rak)
    {
        String string = new String();

        String string1= "Rakshitha N";
        String string2= "Naresh E";
        System.out.println(string1.toString());//toString()

        char ch =string1.charAt(7);//charAt()
        System.out.println(ch);

        System.out.println("comparing two strings:"+string1.compareTo(string2));//compareTo()
        System.out.println("concating two strings:"+string1.concat(string2));//concat()
        System.out.println(string1.contains("Rakshi"));//contains()
        System.out.println(string1.endsWith("a"));//endsWith()
        System.out.println(string1.equals(string2));//equals()n
        byte[] b = string1.getBytes();//getBytes()
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i]);
        }
        System.out.println("\n====================================================");
        System.out.println(string2.hashCode());//hashCode()
        System.out.println(string1.indexOf("n"));//indexOf()
        System.out.println(string1.replace("a","A"));//replace(char oldChar, char newChar)
        System.out.println(string1.replace("Naresh","NARESH"));//replace(CharSeq target, charSeq replacement)
        System.out.println("");
        String[] split=string1.split("",7);//split(regex,limit)
        for(int i=0; i< split.length;i++){
            System.out.println(split[i]);
        }

        String[] split1 = string1.split("");//split(regex)
        for (int i=0;i< split1.length;i++){
            System.out.println(split1[i]);
        }

        System.out.println(string1.startsWith("S"));//startsWith(prefix)
        System.out.println(string1.startsWith("e",7));//startsWith(prefix, toffset)
        System.out.println(string1.substring(5));//subString(beginIndex)
        System.out.println(string1.substring(5, 7));//subString(beginIndex, endIndex)
        System.out.println(string1.toLowerCase());//toLowerCase()
        System.out.println(string1.toUpperCase());//toUpperCase()
        System.out.println(string2.trim());//trim()
    }
}


