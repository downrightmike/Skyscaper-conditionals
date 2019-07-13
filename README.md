Skyscaper conditionals:

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
  
