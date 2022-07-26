package com.kocesat.structural.adapter.mosh.exercise;

import com.kocesat.structural.adapter.mosh.exercise.Gmail.GmailClient;

public class Solution {
    public static void main(String[] args) {
        var emailClient = new EmailClient();
        var gmailClient = new GmailClient();
        var gmailAdapter = new GmailClientAdapter(gmailClient);
        emailClient.addProvider(gmailAdapter);
        emailClient.downloadEmails();
    }
}
