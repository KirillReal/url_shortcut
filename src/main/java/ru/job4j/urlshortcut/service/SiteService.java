package ru.job4j.urlshortcut.service;

import org.springframework.stereotype.Service;

import ru.job4j.urlshortcut.model.Site;
import ru.job4j.urlshortcut.model.User;
import ru.job4j.urlshortcut.repository.SiteRepository;

@Service
public class SiteService {
    private final SiteRepository siteRepository;

    public SiteService(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }

    public boolean isSiteRegistered(String name) {
        return this.siteRepository.existsSiteByName(name);
    }

    public Site save(Site site) {
        return this.siteRepository.save(site);
    }

    public Site getSiteByUser(User user) {
        return this.siteRepository.getSiteByUser(user);
    }
}
