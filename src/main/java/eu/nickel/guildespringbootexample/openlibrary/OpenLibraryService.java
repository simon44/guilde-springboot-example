package eu.nickel.guildespringbootexample.openlibrary;

import org.springframework.stereotype.Service;

@Service
public class OpenLibraryService {

    private final OpenLibraryClient openLibraryClient;

    public OpenLibraryService(OpenLibraryClient openLibraryClient) {
        this.openLibraryClient = openLibraryClient;
    }

    public SearchResult getSearchResult(String query) {
        return openLibraryClient.query(query);
    }
}
