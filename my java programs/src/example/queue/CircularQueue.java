package example.queue;

public class CircularQueue {
	int SIZE=5;
	int front,rear;
	int queue[]=new int[SIZE];
	public CircularQueue()
	{
		front=-1;
		rear=-1;
	}
	public boolean isFull()
	{
		if((rear+1)%SIZE==front)
		{
			return true;
		}
		else
			return false;
	}
	public boolean isEmpty()
	{
		if((front==-1) && (rear==-1))
		{
			return true;
		}
		else
			return false;
	}
	public void enQueue(int item)
	{
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else
		{
			if(front==-1)
			{
				front=0;
			}
		rear=(rear+1)% SIZE;
		queue[rear]=item;
		System.out.println(item +" inserted");
		}
	}
	public void deQueue()
	{
		int element;
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			element=queue[front];
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front=(front+1)% SIZE;
			}
			System.out.println(element +" deleted");
		}
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("front : "+front);
			System.out.println("rear : "+rear);
			System.out.println("queue elements :");
			int i=front;
			while(i!=rear)
			{
				System.out.print(queue[i]+ " ");
				i=(i+1)%SIZE;
			}
			System.out.println(queue[i]);
		}
	}
	public static void main(String[] args) {
		CircularQueue obj=new CircularQueue();
		obj.deQueue();
		obj.enQueue(10);
		obj.enQueue(20);
		obj.enQueue(30);
		obj.enQueue(40);
		obj.enQueue(50);
		obj.enQueue(60);
		obj.display();
		obj.deQueue();
		obj.display();
		obj.enQueue(70);
		obj.display();
		obj.enQueue(80);
		
		

	}

}
