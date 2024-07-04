package dao.impl;

import dao.AnnouncementDao;
import db.DataBase;
import models.Announcement;

import java.util.List;

public class AnnouncementDaoImpl implements AnnouncementDao {

    private DataBase dataBase;
    public AnnouncementDaoImpl(DataBase dataBase) {
        this.dataBase = dataBase;


    }

    @Override
    public String addAnnouncement(Announcement announcement) {
        dataBase.add(announcement);
        return "Success";
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return dataBase.getAnnouncements();
    }

    @Override
    public List<AnnouncementDao> getAnnouncementsByAnnouncementId(long id) {
        for (Announcement announcement : getAllAnnouncements()) {
            if(announcement.getId() == id) {
                dataBase.getAnnouncements().add(announcement);

            }
        }
        return null;
    }

    @Override
    public Announcement getUpdateAnnouncementsById(long id, AnnouncementDao announcementDao) {
        for (Announcement announcement : getAllAnnouncements()) {
            if(announcement.getId() == id) {
                dataBase.getAnnouncements().add(announcement);
                return announcement;
            }
        }
        return null;
    }

    @Override
    public String getDeleteAnnouncementsById(long id) {
        for (Announcement announcement : getAllAnnouncements()) {
            if(announcement.getId() == id) {
                dataBase.getAnnouncements().remove(announcement);
                return "Удалино";
            }
        }
        return null;
    }
}
