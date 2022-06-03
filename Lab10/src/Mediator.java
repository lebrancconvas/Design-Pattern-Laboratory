import java.util.ArrayList;

public class Mediator 
{
	public static void main(String[] args)
	{
		Person john = new Person("John");
		Person jane = new Person("Jane");
	}
}

class Person
{
	public String name;
	public ChatRoomMediator room;
	private ArrayList<String> chatLog = new ArrayList<String>();

	public Person(String name)
	{
		this.name = name;

	}

	public void receive(String sender, String message)
	{
		String s = sender + ": '" + message + "";
		chatLog.add(s);
		System.out.println("[" + name + "'s chat session] " + s);
	}

	public void say(String message)
	{
		String s = "me: '" + message + "'";
		chatLog.add(s);
		System.out.println("[" + name + "'s chat session']");
	}

	public void printChatLog()
	{
		System.out.println("[" + name + "] ChatLog");

		for(String alog: chatLog)
		{
			System.out.println(alog);
		}
	}

	public void privateMessage(String destination, String message)
	{
		String s = "me to " + destination + ": '" + message + "'";
		chatLog.add(s);
		room.message(name, destination, message);
	}
}

class ChatRoomMediator
{
	private ArrayList<Person> people = new ArrayList<Person>();

	public void broadcast(String source, String message)
	{
		for(Person person : people)
		{
			if(!person.name.equals(source))
			{
				person.receive(source, message);
			}
		}
	}

	public void join(Person p)
	{
		String joinMsg = p.name + " joins the chat.";
		broadcast("room", joinMsg);
		p.room = this;
		people.add(p);
	}

	public void message(String source, String destination, String message)
	{
		for(Person person : people)
		{
			if(person.name.equals(destination))
			{
				person.receive(source, message);
				return;
			}
		}
	}
}
