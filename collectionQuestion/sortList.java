package collectionQuestion;
import java.util.*;
class sortList {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("lion","Bear","tiger","dog","cat");
        System.out.println(list);
        sortInDecending(list);
        System.out.println(list);

    }

    public static void sortInDecending(List<String> stringList){
        Collections.sort(stringList);// sort in ascending
        // sort list using comparator sort in either in ascending or decending
        Collections.sort(stringList, new java.util.Comparator<String>(){
            @Override
            public int compare(String s,String t1){
                if(s.equals(t1)){
                    return 0;
                }
                else if(s.charAt(0)<t1.charAt(0)){
                    return 1;//big
                }
                else{
                    return -1; // small 
                }
            }
        });
    }

}
