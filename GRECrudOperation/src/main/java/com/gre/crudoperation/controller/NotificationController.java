package com.gre.crudoperation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.crudoperation.Entity.Notification;
import com.gre.crudoperation.service.NotificationService;

@RestController
@RequestMapping("/api")
public class NotificationController {

	@Autowired
	private NotificationService notificationService;

	/*
	 * ADD NEW DATA HERE SAVE DATA
	 */
	@PostMapping("/addNotificationData")
	public Notification addNotification(@RequestBody Notification notify) {
		return notificationService.addNotification(notify);

	}

	/*
	 * GET ALL DATA HERE GET ALL DATA INFO IN LIST
	 */
	@GetMapping("/getNotification")
	public List<Notification> getAllNotification() {
		return notificationService.getAllNotification();

	}

	/*
	 * GET DATA HERE USING ID FETCH DATA USING ID
	 */
	@GetMapping("/getNotificationById/{notification_id}")
	public Notification getNotificationById(@PathVariable("notification_id") int notification_id) {
		return notificationService.getNotificationById(notification_id);

	}

	/*
	 * DELETE DATA HERE USING BY ID DELETE DATA USING ID
	 */
	@DeleteMapping("/deleteNotification/{notification_id}")
	public String deleteNotification(@PathVariable("notification_id") int notification_id) {
		notificationService.deleteNotification(notification_id);
		return "Notification data id " + notification_id + " deleted succefully";

	}

	/*
	 * UPDATER DATA HERE USING ID UPDATE DATA HERE USING ID
	 */
	@PutMapping("/updateNotification/{notification_id}")
	public Notification updateNotification(@RequestBody Notification notify,
			@PathVariable("notification_id") int notification_id) {
		return notificationService.updateNotification(notify, notification_id);

	}

	/*
	 * get DATA HERE fetch DATA using date
	 */
	@GetMapping("/getNotificationDate/{startDate}/{endDate}")
	public ResponseEntity<List<Notification>> findcreated_atDate(
			@PathVariable("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
			@PathVariable("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
		try {
			List<Notification> notification = notificationService.findcreated_atDate(startDate, endDate);
			return ResponseEntity.ok(notification);
		} catch (Exception e) {
			e.printStackTrace(); // Log the exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
