package ar.edu.unlp.oo1.JobScheduler;

import java.util.List;



public class Lifo implements Strategy {

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		// TODO Auto-generated method stub
		JobDescription nextJob = jobs.remove(jobs.size()-1);
    	//this.unschedule(nextJob);
    	return nextJob;
	}

}
