import java.util.*;

public class Mainclass {
    public static void main(String[] args) {
        String s = "TX Texas CA California VA Virgina GA Georgia AL Alaska MN Main WA Washington TX Texas";
        Map<String, String> map = new TreeMap<>();
        Map<Object,Object> map1 = new TreeMap<>();
        String [] str = s.split(" ");
        Set<Object> set = new HashSet<>();
        Set<Object> set1 = new TreeSet<>();
        Set<Object> set2 = new TreeSet<>();


        for(int i=0,j=1;i<str.length-1 & j<=str.length;i+=2,j+=2){
            map.put(str[i],str[j]);
            int c=0;
            char [] ar = str[i].toCharArray();
            for(int k=0;k<ar.length;k++){
                c+=(int)ar[k];
            }
            map1.put(c,str[j]);
            set.add(str[i]);set.add(str[j]);
            set1.add(str[i]);set1.add(str[j]);

        }
        for(Map.Entry<String,String> m : map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue() );
        }
        for(Map.Entry<Object,Object> m : map1.entrySet()){
            System.out.println(m.getKey()+": "+m.getValue() );
        }
        set2.addAll(set);
        System.out.println("HashSet: "+set.toString()+"\nTreeSet: "+set1.toString()
                +"\n Set2:"+set2.toString());
    }
}
