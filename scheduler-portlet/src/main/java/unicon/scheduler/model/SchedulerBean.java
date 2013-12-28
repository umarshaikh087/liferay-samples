package unicon.scheduler.model;

import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.quartz.Scheduler;
import org.quartz.impl.SchedulerRepository;

@ManagedBean
@SessionScoped
public class SchedulerBean {
	
	public Collection<Scheduler> getSchedulers() {
		return SchedulerRepository.getInstance().lookupAll();
	}

}
