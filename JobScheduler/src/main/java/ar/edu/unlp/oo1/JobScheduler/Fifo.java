package ar.edu.unlp.oo1.JobScheduler;

import java.util.List;

public class Fifo implements Strategy {
	public JobDescription next(List<JobDescription> jobs) {
		JobDescription nextJob = jobs.remove(0);
		/* esto se repite en todas hay que agregarlo 
    	this.unschedule(nextJob);
    	*/
    	return nextJob;
	}
}
