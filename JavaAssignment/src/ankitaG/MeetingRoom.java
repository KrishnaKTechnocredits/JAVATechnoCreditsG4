package ankitaG;

import java.util.Scanner;
//Q1 from overloading section
public class MeetingRoom {
	boolean flag= false;
	String roomName;
	String meetingDuration;
	
	void bookMeetingRoom()
	{
		flag= true;
				
	}
	void bookMeetingRoom(String roomName,String meetingDuration)
	{
		this.roomName=roomName;
		this.meetingDuration=meetingDuration;
		flag=false;
		
		
	}
	void displayInfo()
	{
		if(flag==true)
		{
			System.out.println("Nalanda meeting room is booked for 1 hour");
		}
		else
		{
			System.out.println(roomName+" is booked for "+ meetingDuration);
		}
	}
	 public static void main(String[] args) {
		 MeetingRoom mr=new MeetingRoom();
		 mr.bookMeetingRoom();
		 mr.displayInfo();
		 Scanner sc= new Scanner(System.in);
		System.out.println("enter meeting room name and duration of meeting ");
		 mr.bookMeetingRoom(sc.next(), sc.next());
		 mr.displayInfo();
		 sc.close();
	}

}
