
import java.util.ArrayList;
import java.util.HashSet;

public class HT6 {
    public HashSet findPairsOfLitera(String [] arr){
        ArrayList<String> pairedWords = new ArrayList<String>(  );
        HashSet<Character> resultList = new HashSet<Character>(  );
        for (int i = 0; i<arr.length; i++){
            char[] charArray = arr[i].toCharArray();
            HashSet <Character> charsList = new HashSet<Character>();
            for( int j = 0; j<charArray.length;j++){
                if (!charsList.contains(charArray[j])){
                    charsList.add(charArray[j]);
                }
            }
            if ((arr[i].length()%charsList.size()==0) && (arr[i].length()>charsList.size())){
                pairedWords.add(arr[i]);
            }
        }
        for(String i:pairedWords){
            char[] charsSegmentation  = i.toCharArray();
            for (int k = 0; k<charsSegmentation.length; k++){
                resultList.add(charsSegmentation[k]);
            }
        }
        System.out.println("Слова у яких кожна літера трапляється парну кількість разів:" + pairedWords);
        System.out.println("Набір унікальних символів у словах: "+ resultList);
        return resultList;
    }

}
