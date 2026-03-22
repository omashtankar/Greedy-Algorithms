import java.util.*;
public class max_no_of_meeting {
    public static int maxMeetings(int start[], int end[]) {
        // add your code here
        
        
        // Making a 2D array
        int meetings[][]=new int[start.length][3];
        // adding vals to the meeting 
        for(int i=0;i<start.length;i++){
            meetings[i][0]=i;
            meetings[i][1]=start[i];
            meetings[i][2]=end[i];
        }
        
        // Sorting the 2d array
        Arrays.sort(meetings, Comparator.comparingDouble(o->o[2]));
        
        // Making arraylist to store activities
        int count =0;
        ArrayList <Integer> meeting_list=new ArrayList<>();
        meeting_list.add(meetings[0][0]);
        count=1;
        int last_idx_ele=meetings[0][2];
        
        
        for(int i=1;i<start.length;i++){
            if(meetings[i][1]>last_idx_ele){
                count++;
                meeting_list.add(meetings[i][0]);
                last_idx_ele=meetings[i][2];
            }
        }
        
        
        return count;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        System.out.println(maxMeetings(start,end));

    }
}
