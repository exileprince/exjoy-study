package cn.exjoy.study.basic;

public class CharStudy {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        char a = 'a';
        char A = 'A';
        int inta = (int)a;
        int intA = (int)A;
        
        System.out.println(inta);
        System.out.println(intA);
        
        a = (char)(inta - 32);
        
        System.out.println(a);
        
        Character ca = new Character(a);
        
        String aString = "a";
        
        
        
        System.out.println( aString.getBytes());
        
        char empty = (char)0;
        System.out.println(empty);
    }

}
