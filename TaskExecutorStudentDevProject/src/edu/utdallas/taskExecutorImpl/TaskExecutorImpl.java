package edu.utdallas.taskExecutorImpl;

import edu.utdallas.taskExecutor.Task;
import edu.utdallas.taskExecutor.TaskExecutor;

public class TaskExecutorImpl implements TaskExecutor
{
     
	int numthreads;
	public TaskExecutorImpl(int numthreads) {
		// TODO Auto-generated constructor stub
		this.numthreads = numthreads;
		
		//Initialize the FIFO object from here with the required size. 
		   /*{
		    *   initialize queue (FIFO) , put() and get() (synchronized)
		    * }*/
		      
		
		//Modify this constructor to initiate a task runnable for worker thread functionality.
		Runnable worker = new Runnable() {
			public void run()
			{
				//This would contain the definition for the worker thread functionality.
				//Use the get method from the blocking FIFO class.
				//Here the worker threads needs to be in synchronized manner
			}
		};
	}

	@Override
	public void addTask(Task task)
	{
		// TODO Complete the implementation
		//This function does the insertion into the blocking FIFO
		//Use put() from the blocking FIFO class
		//Synchronized function ---- check if needed.
	}

} 	
