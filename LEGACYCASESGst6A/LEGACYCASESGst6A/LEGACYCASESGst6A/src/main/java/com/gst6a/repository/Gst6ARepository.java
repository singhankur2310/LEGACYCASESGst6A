package com.gst6a.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst6a.entity.Gst6A;

import jakarta.persistence.EntityManager;

@Repository
public class Gst6ARepository {
	@Autowired
	private EntityManager em;
	@SuppressWarnings("unchecked")
	public List<Gst6A>getGst6Ainfo(){
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}

}
