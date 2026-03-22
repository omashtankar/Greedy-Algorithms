package Greedy_Qs;
import java.util.*;

public class Class1 {
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};


        int activities[][]=new int[start.length][3];


        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));


        int count=0;
        ArrayList <Integer> list=new ArrayList<>();
        int last_end=activities[0][2];
        list.add(activities[0][0]);
        count=1;
        
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=last_end){
                list.add(activities[i][0]);
                count++;
                last_end=activities[i][2];
            }
        }
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
