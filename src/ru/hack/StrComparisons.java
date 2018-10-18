package ru.hack;

public class StrComparisons {
    String smallest = "";
    String largest = "";
    String nextNum = "";
    int result = 0;
        for(int i=0; i <= s.length()-k; i++){
        nextNum = s.substring(i,i+k);
        if (i == 0){
            smallest = nextNum;
            largest = nextNum;;
        }
        //System.out.println(i+" "+nextNum+" "+smallest+" "+largest);
        result = nextNum.compareTo(largest);
        //System.out.println("result= "+result);
        if (result <= 0){
            if(nextNum.compareTo(smallest) <=0){
                smallest = nextNum;
            }
            //System.out.println("largest= "+largest);
        } else {
            largest = nextNum;
            //System.out.println("largest= "+largest);
            //System.out.println("smallest= "+smallest);
        }
    }
        return smallest + "\n" + largest;
}
