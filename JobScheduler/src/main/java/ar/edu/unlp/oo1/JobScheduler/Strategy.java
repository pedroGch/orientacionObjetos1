package ar.edu.unlp.oo1.JobScheduler;

import java.util.List;

public interface Strategy {
	public JobDescription next(List<JobDescription> jobs);
}
