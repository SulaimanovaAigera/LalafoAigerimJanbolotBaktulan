package service;

import dao.AnnouncementDao;
import models.Announcement;

import java.util.List;

public interface AnnouncementService {
    String  addAnnouncement(Announcement announcement);
    List<Announcement> getAllAnnouncements();
    List<AnnouncementDao> getAnnouncementsByAnnouncementId(long id);
    Announcement getUpdateAnnouncementsById(long id,AnnouncementDao announcementDao);
    String getDeleteAnnouncementsById(long id);


}
