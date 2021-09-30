package ar.edu.unlp.oo1.JobScheduler;

import java.util.List;

public class HighestPriority implements Strategy {

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		// TODO Auto-generated method stub
		JobDescription nextJob = jobs.stream()
				.max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
				.orElse(null);
        	//this.unschedule(nextJob);
        	return nextJob;
	}

}
