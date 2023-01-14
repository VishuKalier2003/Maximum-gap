/* Given an integer array nums, return the maximum difference between two successive elements in its sorted form... If the array contains less than two elements, return 0... You must write an algorithm that runs in linear time and uses linear extra space...
 * Eg 1: nums = [7,15,12,1,3]       gap = 5
 * Eg 2: nums = [3,6,9,1]           gap = 3
 * Eg 3: nums = [10]                gap = 0
 */
import java.util.*;
public class Gap
{
    public int MaximumGapping(int nums[])
    {
        if(nums.length < 2)    // If array has only one element...
            return 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();   // Priority Queue for storing the elements in ascending order...
        for(int i = 0; i < nums.length; i++)
            queue.add(nums[i]);
        int maxGap = 0;
        while(queue.size() > 1)    // While Queue has more than one element...
        {
            int x1 = queue.poll();    // Removing the head of the Queue...
            int x2 = queue.peek();    // Getting the second element after removing the head...
            if(maxGap < x2 - x1)
                maxGap = x2 - x1;    // Updating the maxGap variable...
        }
        return maxGap;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the size of the array : ");
        x = sc.nextInt();
        int nums[] = new int[x];
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print("Enter data : ");
            nums[i] = sc.nextInt();
        }
        Gap gap = new Gap();    // Object creation...
        System.out.println("The Maximum Gap is : "+gap.MaximumGapping(nums));
        sc.close();
    }
}

// Time Complexity  - O(n) time...
// Space Complexity - O(n) space...

/* DEDUCTIONS :- 
 * 1. We can use the Priority Queue, since Priority Queue stores lowest value with highest priority (ascending order), we can keep on returning the Queue 's head to get the ascending order of the array...
 */