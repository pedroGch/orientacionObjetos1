package ar.edu.unlp.oo1.JobScheduler;

import java.util.List;

public class MostEffort implements Strategy {

	@Override
	public JobDescription next(List<JobDescription> jobs) {
		// TODO Auto-generated method stub
		JobDescription nextJob = jobs.stream()
     			.max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
     			.orElse(null);
		    //Sthis.unschedule(nextJob);
		    return nextJob;
	}

}
