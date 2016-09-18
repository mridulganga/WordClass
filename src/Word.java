
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mridul
 */
public class Word {
    
    public static int countWords(String S)
    { 
        int i,count=0;
        String stmp[] = S.trim().split(" ");
        for (i = 0;i<stmp.length;i++)
        {
            if (!stmp[i].equals(""))
                count++;
                
        }
        
        return count;
    }
    
    public static String reverseWord(String S)
    {
        int i;
        String S2="";
        for (i=S.length()-1;i>=0;i--)
        {
            char ch = S.charAt(i);
            S2 = S2.concat(ch + "");
        }
        return S2;
    }
    
    public static boolean isPalindrome(String S)
    {
        if (S.equals(reverseWord(S)))
            return true;
        else
            return false;
        
    }
    
    public static String WriteDiagonal(String S)
    {
        String Sr;
        int n = S.length(),i;
        Sr = S.charAt(0) + "\n";
        for (i=1;i<n;i++)
        {
            char ch = S.charAt(i);
            Sr =Sr+ spaceCreate(i) + ch + "\n";
        }
        return Sr;
    }
    
    public static String spaceCreate(int n)
    {
        String S = "";
        int i;
        for (i=1;i<=n;i++)
        {
            S=S + " ";
        }
        return S;
    }
    
    public static String[] getWords(String S)
    {
    List<String> list = new ArrayList<String>();

    for(String s : S.split(" ")) {
       if(s != null && s.length() > 0) {
          list.add(s);
       }
    }

        return  list.toArray(new String[list.size()]);
    }
    
    public static String reverseWordsInPosition(String S){
        String s[] = getWords(S);
        String res="";
        for (int i=0;i<s.length;i++)
            res+=reverseWord(s[i])+ " ";
        return res.trim();
        
    }
    public static String reverseWordPlacement(String S){
        String s[]=getWords(S);
        String res="";
        for (int i=s.length-1;i>=0;i--)
            res+=s[i]+ " ";
        return res.trim();
    }
    
    public static int countWordOccurence(String S,String word){
        String s[] = getWords(S);
        int count=0;
        for (String item : s) {
            if (item.equals(word)) {
                count++;
            }
        }
        return count;
    }
    
        
    /* usage: permutation("",stringToPermute);*/
    private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) System.out.println(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}
    
    public static void alert(String S)
    {
        System.out.println(S);
    }
    public static void alert(int S)
    {
        System.out.println(S);
    }
    public static void alert(char S)
    {
        System.out.println(S);
    }
    
    
    public static void main(String args[]){
        System.out.println(reverseWordsInPosition("Testing simple program"));
        System.out.println(reverseWordPlacement("Testing simple program"));
        System.out.println(countWordOccurence("This is a simple sentence, ans that is cool.","is"));
    }
}
