package hello.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	List<Project> findByDesc(String desc);
}
