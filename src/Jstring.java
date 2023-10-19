import java.util.ArrayList;
import java.util.List;

public class Jstring implements Jmethods {
private List<String> jAdd = new ArrayList<>();
    @Override
    public int size() {
        int size=0;
        for (String s : jAdd){
             size++;
        }
        return size;
    }
    @Override
    public String reverse() {
        int len = size()-1;
        String newJstring = "";
       for (String str : jAdd){
           newJstring += "[ "+jAdd.get(len)+" ]";
           len--;
       }
        return newJstring;
    }
    @Override
    public String firstStr() {
        return jAdd.get(0);
    }
    @Override
    public String lastStr() {
        int len = size()-1;
        return jAdd.get(len);
    }
    @Override
    public void add(String str) {
        jAdd.add(str);
    }
    @Override
    public String getAll() {
        String newJstr = "";
        for (String s : jAdd){
            newJstr += "[ "+s+" ]";
        }
        return newJstr;
    }
}
