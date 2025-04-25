package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @Autowired
    private NotificationService notificationService;


}
