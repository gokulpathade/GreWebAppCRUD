package com.gre.crudoperation.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gre.crudoperation.Entity.Notification;
import com.gre.crudoperation.UserRepository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository notifyRepo;
	
	

	/*
	 * ADD NEW DATA HERE SAVE DATA
	 */

	public Notification addNotification(Notification notify) {
		return notifyRepo.save(notify);

	}

	/*
	 * GET ALL DATA HERE GET ALL DATA INFO IN LIST
	 */

	public List<Notification> getAllNotification() {
		return notifyRepo.findAll();

	}

	/*
	 * GET DATA HERE USING ID FETCH DATA USING ID
	 */

	public Notification getNotificationById(int notification_id) {
		return notifyRepo.findById(notification_id).get();

	}

	/*
	 * DELETE DATA HERE USING BY ID DELETE DATA USING ID
	 */

	public void deleteNotification(int notification_id) {
		notifyRepo.deleteById(notification_id);

	}

	/*
	 * UPDATER DATA HERE USING ID UPDATE DATA HERE USING ID
	 */

	public Notification updateNotification(Notification notify, int notification_id) {
		Optional<Notification> target = notifyRepo.findById(notification_id);

		if (target.isPresent()) {

			Notification alreadyexist = target.get();
			alreadyexist.setAccount_name(notify.getAccount_name());
			alreadyexist.setAfter_change(notify.getAfter_change());
			alreadyexist.setBefore_change(notify.getBefore_change());
			alreadyexist.setCreated_at(notify.getCreated_at());
			alreadyexist.setField(notify.getField());
			alreadyexist.setIs_read(notify.getIs_read());
//			alreadyexist.setProject_id(notify.getProject_id());
			alreadyexist.setUg_id(notify.getUg_id());
			alreadyexist.setUser_name(notify.getUser_name());
			return notifyRepo.save(alreadyexist);
//			notification_id, account_name, after_change, before_change, created_at, field, is_read, project_id, ug_id, user_name, userid 
		} else {
			throw new IllegalArgumentException(" Notification Id " + notification_id + " Not Found");
		}

	}

	
	
	
	
	
	
	
	
	/*
	 * FIND DATA USING DATE 
	 * ONE DATE TO ANOTHER DATE
	 */
	 public List<Notification> findcreated_atDate (Date startDate, Date endDate) {
		 return notifyRepo.findcreated_atDate(startDate, endDate);
	 }
	 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
