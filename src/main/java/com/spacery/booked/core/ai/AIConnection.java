package com.spacery.booked.core.ai;

import com.google.genai.Client;

public interface AIConnection {
    Client client = null;

    public String newAuthor(String author);
}
