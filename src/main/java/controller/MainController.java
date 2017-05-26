package controller;

import hibernate.entity.RepoEntity;

import org.hibernate.Session;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo.Example;

@RestController
public class MainController {

	@RequestMapping(path = "/notify", method = RequestMethod.POST)
	public void notify(@RequestBody Example exp) {

		RepoEntity entity = new RepoEntity();
		entity.setRepo_id(exp.getRepository().getId());
		entity.setBody(exp.getPullRequest().getBody());
		entity.setRepo_name(exp.getRepository().getName());
		entity.setState(exp.getPullRequest().getState());
		entity.setClosed_at(exp.getPullRequest().getClosedAt());
		entity.setCreated_at(exp.getPullRequest().getCreatedAt());
		entity.setMerged_at(exp.getPullRequest().getMergedAt());
		entity.setRepo_number(exp.getPullRequest().getNumber().toString());
		entity.setUpdated_at(exp.getPullRequest().getUpdatedAt());
		entity.setTitle(exp.getPullRequest().getTitle());
		// return new res("response",-1l);

		/*
		 * ss.setStock_id(900); ss.setStockCode("code");
		 * ss.setStockName("code");
		 */

		insertOrUpdate(entity);
	}

	@RequestMapping(path = "/repo", method = RequestMethod.GET)
	public RepoEntity getData(@RequestParam(value = "repo_id") Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		RepoEntity entity = (RepoEntity) session
				.createQuery(
						"select RMaster from RepoEntity RMaster where RMaster.repo_id = :id")
				.setInteger("id", id).uniqueResult();
		return entity;
	}

	private void insertOrUpdate(RepoEntity entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Integer ID = (Integer) session
				.createQuery(
						"select RMaster.id from RepoEntity RMaster where RMaster.repo_id = :id")
				.setInteger("id", entity.getRepo_id()).uniqueResult();
		if (ID != null) {
			entity.setId(ID);
			session.update(entity);
		} else {
			session.save(entity);
			System.out.println(ID);

		}
		session.getTransaction().commit();

	}
}