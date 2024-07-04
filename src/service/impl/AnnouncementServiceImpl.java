package service.impl;

import dao.AnnouncementDao;
import models.Announcement;
import service.AnnouncementService;

import java.util.List;

public class AnnouncementServiceImpl implements AnnouncementService {

    private AnnouncementDao announcementDao;

    @Override
    public String addAnnouncement(Announcement announcement) {

        return announcementDao.addAnnouncement(announcement);
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return announcementDao.getAllAnnouncements();
    }

    @Override
    public List<AnnouncementDao> getAnnouncementsByAnnouncementId(long id) {
        return announcementDao.getAnnouncementsByAnnouncementId(id);
    }

    @Override
    public Announcement getUpdateAnnouncementsById(long id, AnnouncementDao announcementDao) {
        return announcementDao.getUpdateAnnouncementsById(id,announcementDao);
    }

    @Override
    public String getDeleteAnnouncementsById(long id) {
        return announcementDao.getDeleteAnnouncementsById(id);
    }
}
