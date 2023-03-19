package io.zipcoder;

public class Music {

    private String[] playList = {"jcoleWorkOut", "togetherAgain", "doItAgain"};

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        // i = index where song is
        // k = the index of song sk
        // q = string the name of song you wish to switch to.
        //return an integer denoting the minimum number of button presses needed to switch from song sk to q

        Integer selectionIndex = 0;
        Integer abs = 0;



        for(int i = 0; i < playList.length; i++){

            if(playList[i].equals(selection)){
                selectionIndex = i;
                break;

            }
        }

        abs = Math.abs(startIndex - selectionIndex);

        if (startIndex == 0 && selectionIndex == 2){
            abs = 1;
        }

        Integer min1 = Math.min(selectionIndex, (playList.length - startIndex)) + Math.min(startIndex, (playList.length - selectionIndex));
        Integer min = Math.min(abs, min1);

        return min;
    }
}
