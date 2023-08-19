import java.util.Scanner;
class encryption
{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a String input: ");
        String text=in.nextLine();
        System.out.println("Cipher Text: "+encrypt(text));

    }
    static String encrypt(String text){
        String f="";
        int shift;
        char ch;
        for(int i=0;i<text.length();i++){
            ch =text.charAt(i);
            if(Character.isLetter(ch)){
                shift=ch+2;
                if((Character.isUpperCase(ch)&&shift>90)||(Character.isLowerCase(ch)&&shift>122)){
                    shift=shift-26;
                }
                ch=(char) shift;
            }
            f=f+ch;
        }
        return f;
    }
}

