package com.cg.Repository;

import javax.persistence.EntityManager;

import com.cg.entities.Placement;

public class IPlacementRepositoryImpl implements IPlacementRepository 
{
	@SuppressWarnings("unused")
	private static final Placement placement=null;
	//1: starting JPA lifecycle
	private EntityManager em;
	
	public IPlacementRepositoryImpl() 
		
		{
			//super();
			em= JPAUtil.getEntityManager();
		}
	
	//create opearation - Repo/DAO
	
	@Override
	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(long Id) {
		Placement placement=em.find(Placement.class, Id);
		return placement;
	}
	@Override
	public boolean cancelPlacement(long id) {
		em.remove(id);
		return false;
	}
	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}
}
