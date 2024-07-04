package dao;

import models.Announcement;

import java.util.List;

public interface AnnouncementDao {
    String  addAnnouncement(Announcement announcement);
    List<Announcement> getAllAnnouncements();
    List<AnnouncementDao> getAnnouncementsByAnnouncementId(long id);
    Announcement getUpdateAnnouncementsById(long id,AnnouncementDao announcementDao);
    String getDeleteAnnouncementsById(long id);

}
