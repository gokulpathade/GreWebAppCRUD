package com.gre.crudoperation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.LockingStatus;
import com.gre.crudoperation.UserRepository.LockingStatusRepository;

@Service
public class LockingStatusService {

	@Autowired
	private LockingStatusRepository lockingRepo;
	
	
	
	/**
	 * SAVE NEW DATA  
	 * ADD NEW RESOURSCE
	 * @param locking
	 * @return
	 */
	public LockingStatus addLockingStatus(LockingStatus locking)
	{
		return lockingRepo.save(locking);
	}
	
	
	
	/**
	 *  GET ALL DATA LIST 
	 * GET ALL DATA HERE
	 * @param locking
	 * @return
	 */
	public List<LockingStatus> getAllLockingStatus()
	{
		return lockingRepo.findAll();
	}
	
	
	
	
	
	/**
	 * GET DATA USING ID  
	 *   GET DATA
	 * @param locking
	 * @return
	 */
	public LockingStatus getLockingStatusById(int id)
	{
		return lockingRepo.findById(id).get();
	}
	
	
	
	
	
	
	/**
	 * DELETE DATA USING ID  
	 * DELETE
	 * @param locking
	 * @return
	 */
	public void deleteLockingStatus(int id)
	{
		 lockingRepo.deleteById(id);
	}
	
	
	
	
	
	
	/**
	 * UPDATE DATA USING ID 
	 * UPDATE EXIST DATA
	 * @param locking
	 * @return
	 */
	public LockingStatus updateLockingStatus(LockingStatus locking, int id)
	{
		
		Optional<LockingStatus> target = lockingRepo.findById(id);
		if (target.isPresent()) {
			LockingStatus alreadyexist= target.get();
			alreadyexist.setIslocked(locking.getIslocked());
			alreadyexist.setLocation(locking.getLocation());
			alreadyexist.setMonth(locking.getMonth());
			alreadyexist.setYear(locking.getYear());
			
			
			return lockingRepo.save(alreadyexist);
			
			
			
		}
		
		
	 throw new IllegalArgumentException("locking Status id" + id+ "Not Found");
	}
	
	
	
	

	
	
	
}
