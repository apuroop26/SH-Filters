package se.bth.softhouse.process;

import se.bth.softhouse.db.FilterDAO;
import se.bth.softhouse.entities.Filter;

import java.util.List;

public class FilterProcess {

	final private FilterDAO filterDAO;

	public FilterProcess(FilterDAO filterDAO) {
		this.filterDAO = filterDAO;
	}

	public List<org.junit.runner.manipulation.Filter> getAll() {
		return filterDAO.getAll();
	}

	public void create(Filter filter) {
		if(filter.getName().length() < 10) {
			throw new RuntimeException("To short name");
		}
		filterDAO.createFilter(filter.getName());
	}

	public org.junit.runner.manipulation.Filter getBy(int id) {
		return filterDAO.getBy(id);
	}

}
