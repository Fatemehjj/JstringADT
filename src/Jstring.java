public class Jstring implements Jmethods {
    @Override
    public int size(String str){
        int size=0;
        for (Character s : str.toCharArray()){
             size++;
        }
        return size;
    }
    @Override
    public String reverse(String str) {
        int len = size(str);
        String newJstring = "";
        for (int i=len-1; i>=0; i--){
            newJstring += str.charAt(i);
        }
        return newJstring;
    }
    @Override
    public String firstChar(String str) {
        return String.valueOf(str.charAt(0));
    }

    @Override
    public String lastChar(String str) {
        int len = size(str);
        return String.valueOf(str.charAt(len-1));
    }
}
