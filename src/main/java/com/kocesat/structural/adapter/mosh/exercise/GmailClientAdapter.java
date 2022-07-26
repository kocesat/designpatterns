package com.kocesat.structural.adapter.mosh.exercise;

import com.kocesat.structural.adapter.mosh.exercise.Gmail.GmailClient;

/**
 * This class is an adapter to use GmailClient
 */
public class GmailClientAdapter implements EmailProvider{
    private GmailClient gmailClient;

    public GmailClientAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
