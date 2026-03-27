public class StringValidity {
    public static boolean validString(String str){
        boolean flag = true;
        if(str.length()==0){
            return flag;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(' && str.charAt(i+1)!=')'){
                flag=false;
                break;
            }else if(str.charAt(i)=='{' && str.charAt(i+1)!='}'){
                flag=false;
                break;
            }else if(str.charAt(i)=='[' && str.charAt(i+1)!=']'){
                flag=false;
                break;
            }else{
                i++;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(validString("([)]{}"));
    }
}
