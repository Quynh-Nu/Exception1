public class App {
    public static void main(String[] args){
        String str = "You Only Live Once. But if You do it right. once is Enough";
        char[] ch = str.toCharArray();
        System.out.println("countUpperCase = " + countUpperCase(ch));
        System.out.println("upperFirstLetter = " + upperCaseFirstLetter(ch));
        System.out.println("upperFirstLetterOfSentence = " + upperFirstLetterOfSentence(ch));
    }
    public static int countUpperCase(char[] arr){
        System.out.println(arr.length);
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                count = count + 1;
            }
        }
        return count;
    }
    public static String upperCaseFirstLetter(char[] arr){
        for (int i = 0; i < arr.length ; i++) {
           if(arr[i] == ' '){
               arr[i+1] = Character.toUpperCase(arr[i+1]);
           }
        }
        return String.valueOf(arr);
    }
    public static String upperFirstLetterOfSentence(char[] arr){
        for (int i = 1; i < arr.length - 1 ; i++) {
            if(arr[i-1] == '.' && arr[i] == ' '){
                arr[i+1] = Character.toUpperCase(arr[i+1]);
            }else{
                arr[i+1] = Character.toLowerCase(arr[i+1]);
            }
        }
        return String.valueOf(arr);
    }


}
