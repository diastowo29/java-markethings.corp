package hello.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hello.model.ProjectOrder;

public interface ProjectOrderRepository extends CrudRepository<ProjectOrder, Long> {
	List<ProjectOrder> findBySupplierId(int supplierId);

	List<ProjectOrder> findByProjectId(int projectId);
}
