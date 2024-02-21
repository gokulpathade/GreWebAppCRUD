package com.gre.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.MasterTable;
import com.gre.crudoperation.Entity.User;
import com.gre.crudoperation.UserRepository.MasterTableRepository;

@Service
public class MasterTableService {

	
	
	@Autowired
	private MasterTableRepository masterRepo;
	
	
	
/**
 *    ADD NEW DATA HERE 
 */

	public MasterTable addMasterData(MasterTable masterData) {

	return masterRepo.save(masterData);
}
	
	
	
	
/**
 *   GET MASTER DATA HERE  USING BY ID
 */

	public MasterTable getMasterDataById(int master_id) {

	return masterRepo.findById(master_id).get();
}
	
	
	
	
	
/**
 *    GET All MASTER DATA HERE
 */

	public List<MasterTable> getMasterAllData() {

	return masterRepo.findAll();
}
	

	
	
	
	/**
	 *    DELETE MASTER DATA HERE
	 */

		public void deleteMasterData( int master_id) {

		 masterRepo.deleteById(master_id);
		 
			
		}
		
		
	

	
		
		
/**
 *    UPDATE MASTER DATA DETAILS USING USER ID HERE 
 */

	public MasterTable updateMasterAllData(MasterTable master, int master_id) {

		
		MasterTable masteralreadyexist = getMasterDataById(master_id);
		if (masteralreadyexist != null) {
			
			masteralreadyexist.setAbbreviated_name(master.getAbbreviated_name());
			masteralreadyexist.setAddress(master.getAddress());
			
			
			masteralreadyexist.setCity(master.getCity());
			masteralreadyexist.setCountry(master.getCountry());
			masteralreadyexist.setCustomer_name(master.getCustomer_name());
			masteralreadyexist.setEmail_id(master.getEmail_id());
			masteralreadyexist.setMobile_no(master.getMobile_no());
			masteralreadyexist.setNotes(master.getNotes());
			masteralreadyexist.setPhone(master.getPhone());
			masteralreadyexist.setZip(master.getZip());
			masteralreadyexist.setState(master.getState());
			return masterRepo.save(masteralreadyexist);
			
//			master_id, abbreviated_name, address, city, country, customer_name, email_id, mobile_no, notes, phone, state, zip
			}
		return masteralreadyexist;
		
//	return masterRepo.save(master);
}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
