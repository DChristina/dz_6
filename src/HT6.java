
import java.util.ArrayList;
import java.util.HashSet;

public class HT6 {
    public HashSet findPairsOfLitera(String [] arr){
        ArrayList<String> pairedWords = new ArrayList<String>(  );
        HashSet<Character> resultList = new HashSet<Character>(  );

        for (int i = 0; i<arr.length; i++){
            if (arr[i].length()>2 && arr[i].length()%2==0) {

                HashSet<Integer> countCharactrs = new HashSet<Integer>(  );

                char[] charArray = arr[i].toCharArray();
                HashSet <Character> charsList = new HashSet<Character>();

                for( int j = 0; j<charArray.length;j++){
                    if (!charsList.contains(charArray[j])){
                        charsList.add(charArray[j]);
                    }
                }
                for (Character s: charsList){
                    int counter = 0;

                    for (Character t: charArray){
                        if (s.equals(t)){
                            counter++;
                        }
                    }
                    countCharactrs.add(counter);
                }
                HashSet<Boolean> allCharactersApearsEvenNumberOfTimes = new HashSet<Boolean>(  );;

                for (Integer p: countCharactrs){
                    if (p%2==0){
                        allCharactersApearsEvenNumberOfTimes.add(true);
                    } else {
                        allCharactersApearsEvenNumberOfTimes.add(false);
                    }
                }

                if (charsList.size()>=1 && allCharactersApearsEvenNumberOfTimes.size()==1 && allCharactersApearsEvenNumberOfTimes.contains(true) && pairedWords.size()<2 ){
                    pairedWords.add(arr[i]);
                }
            }

        }
        for(String i:pairedWords){
            char[] charsSegmentation  = i.toCharArray();
            for (int k = 0; k<charsSegmentation.length; k++){
                resultList.add(charsSegmentation[k]);
            }
        }
        System.out.println("Перші два, в яких кожен символ трапляється парну кількість разів:" + pairedWords);
        System.out.println("Набір унікальних символів у словах: "+ resultList);
        return resultList;
    }

}