/********************************************************************************************************************
  *  HotelHideout.java
  *  Author: Mike Bennett
  * 
  *  A fugitive is holed up in a hotel room and the FBI need our help in finding which room. 
  *  The hotel has 60 rooms, numbered from 1 to 60. 
  * 
  *  1. The fugitive is not in a room with the lowest 10 room numbers.
  *  2. The fugitive is not in the highest room number. 
  *  3. The fugitive is not in a room with the room number having 2 even digits.
  *  4. The fugitive is not in a room with the room number having 2 odd digits.
  *  5. The fugitive is not in a room when the second digit is not at least twice as large as the first digit. 
  *     For example, 57 would be eliminated because 7 is not > (5 * 2)). 
  *  6. The fugitive is not in a room that is divisable by 7. 
  *  7. The fugitive is not in a room whose room number digits when switched is not a valid room number in the hotel. 
  * 
  *  As you eliminate rooms, print the room number and why it has been eliminated. You can use these: 
     System.out.println("Room number " + i + " is the room we are seeking.");
     System.out.println("Room number " + i + " has been eliminated due to being less than 11."); 
     System.out.println("Room number " + i + " has been eliminated due to both digits being even."); 
     System.out.println("Room number " + i + " has been eliminated due to both digits being odd."); 
     System.out.println("Room number " + i + " has been eliminated due to the second digit not being twice as large as the first.");
     System.out.println("Room number " + i + " has been eliminated due to being divisable by 7.");
     System.out.println("Room number " + i + " has been eliminated due to switched digits not being a valid room number (" + newRoomNbr + ").");
  * 
  *  You should end up with 1 room number left where the fugitive is holed up. 
  * 
  * Turn in to D2L by the end of class: Class Exercise #10 
  * 
  ********************************************************************************************************************/
public class HotelHideout{
   final static int NBR_OF_ROOMS = 60;  
   final static int OFFSET = 1;  
   public static void main(String[] args){
      boolean[] matrix = new boolean[NBR_OF_ROOMS + OFFSET];
      int count  = 1;
      int temp1 = 0;
      int temp2 = 0;

      for(int i = 1; i< NBR_OF_ROOMS + OFFSET; i++){
         temp1 = (i % 10)*10 + (i/10);
         //1. The fugitive is not in a room with the lowest 10 room numbers.
         if(i < 11){
            matrix[i] = false;
            
            System.out.println("Room number " + i + " has been eliminated due to being less than 11."); 
            
         }else if(i == 60){ //2. The fugitive is not in the highest room number.
            matrix[i] = false;
         
            System.out.println("Room number " + i + " has been eliminated due to being the highest room number."); 
            
         }else if((i % 2 == 0) && ((i/10) % 2 == 0 )){ //3. The fugitive is not in a room with the room number having 2 even digits. 
            matrix[i] = false;
            System.out.println("Room number " + i + " has been eliminated due to both digits being even."); 

         }else if((i % 2 != 0) && ((i/10) % 2 != 0 )){//4. The fugitive is not in a room with the room number having 2 odd digits.
         matrix[i] = false;
         System.out.println("Room number " + i + " has been eliminated due to both digits being odd.");
          // 57; 7 = i%10; 5 = i/10 *2 = false
          // 12; 2 = i%10; 1 = i/10 *2 = false
          // 13; 2 = i%10; 1 = i/10 *2 = true
          // adding 0.1 to the factor based on class feedback that 12 is a false
         }else if( ((i/10)*2.1) > i%10){//*  5. The fugitive is not in a room when the second digit is not at least twice as large as the first digit. 
            // *     For example, 57 would be eliminated because 7 is not > (5 * 2)).
            matrix[i] = false;
            System.out.println("Room number " + i + " has been eliminated due to the second digit not being twice as large as the first.");
         
         }else if(i % 7 == 0){// 6. The fugitive is not in a room that is divisable by 7.             
            matrix[i] = false;
            System.out.println("Room number " + i + " has been eliminated due to being divisable by 7.");

         }else if(temp1 > NBR_OF_ROOMS){//7. The fugitive is not in a room whose room number digits when switched is not a valid room number in the hotel.
            matrix[i] = false;
            System.out.println("Room number " + i + " has been eliminated due to switched digits not being a valid room number ("+temp1+ ").");
            //System.out.println((i % 10)*2 <= 6 && i/ 10 <= 10);
           // temp1 = (i % 10)*10 + (i/10);
            //System.out.println(temp2+temp1);
         }
         else {matrix[i] = true;}
         //System.out.println(matrix[i]);
         //System.out.println(count);
         //matrix[i] = true;
         count++;
         if(matrix[i]){
            temp2 = count-1;// subtract the offset
            System.out.println("This is the room: " + temp2 + " " + matrix[i]);
         }
      }// end of for
      //System.out.println(count);
   
   
      
   }//end of main ----------------------------------------------------------------------------------------------------
   
   
   
}//end of class